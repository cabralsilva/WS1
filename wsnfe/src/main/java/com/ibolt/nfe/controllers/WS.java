package com.ibolt.nfe.controllers;

import com.ibolt.nfe.models.ItemNotaFiscal;
import com.ibolt.nfe.models.NotaFiscal;
import com.ibolt.nfe.models.RetornoWS;
import com.ibolt.nfe.services.ItemNotaFiscalService;
import com.ibolt.nfe.services.NotaFiscalService;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
//	COMENTARIO
@Path(value="/")
public class WS {
    @POST
    @Path(value="/buscarFaturamento")
    @Produces(value={"application/json; charset=UTF-8"})
    public Response buscaFaturamento(NotaFiscal nf) {
        System.out.println("WSNFE -> buscarFaturamento: ");
        System.out.println((Object)nf);
        NotaFiscalService nfs = new NotaFiscalService();
        ItemNotaFiscalService infs = new ItemNotaFiscalService();
        RetornoWS<NotaFiscal> retorno = null;
        try {
            nfs.CreateConnection(nf.getAcessoSistemas().getHost(), nf.getAcessoSistemas().getBase(), nf.getAcessoSistemas().getUser(), nf.getAcessoSistemas().getPwd());
            nf.setAcessoSistemas(null);
        }
        catch (Exception e) {
            System.out.println("Erro ao criar conexão com banco: " + e.getMessage());
            e.printStackTrace();
            retorno = new RetornoWS<NotaFiscal>();
            retorno.setCodStatus(Long.valueOf(4));
            retorno.setMsg("WSNFE -> Falha ao criar conexão com banco");
            retorno.setModel(null);
            return Response.ok((Object)retorno).build();
        }
        try {
            retorno = nfs.buscarFaturamento(nf);
            System.out.println((Object)retorno);
            infs.setSttm(nfs.getSttm());
            RetornoWS<List<ItemNotaFiscal>> retornoLstItens = infs.buscarItensNF((NotaFiscal)retorno.getModel());
            retorno.getModel().setLstItens(retornoLstItens.getModel());
            System.out.println("Itens: " + (Object)retornoLstItens);
        }
        catch (SQLException e) {
            System.out.println("Erro ao buscar dados no banco: " + e.getMessage());
            retorno = new RetornoWS<NotaFiscal>();
            retorno.setCodStatus(Long.valueOf(5));
            retorno.setMsg("Falha ao buscar dados no banco " + e.getMessage());
            retorno.setModel(null);
            return Response.ok((Object)retorno).build();
        }
        try {
            nfs.CloseConnection();
        }
        catch (Throwable e) {
            System.out.println("Falha ao fechar conexão com o banco: " + e.getMessage());
            retorno = new RetornoWS<NotaFiscal>();
            retorno.setCodStatus(Long.valueOf(4));
            retorno.setMsg("WSNFE -> Falha ao fechar conexão com o banco");
            retorno.setModel(null);
            return Response.ok((Object)retorno).build();
        }
        return Response.ok((Object)retorno).build();
    }

    @GET
    @Path(value="/testeWS")
    @Produces(value={"application/json; charset=UTF-8"})
    public Response TesteWs(@QueryParam(value="texto") String texto) throws InterruptedException {
        System.out.println("Texto: " + texto);
        NotaFiscalService nfs = new NotaFiscalService();
        RetornoWS<String> retorno = new RetornoWS<String>();
//        try {
//            nfs.CreateConnection("10.203.51.242", "Plander", "nfe.plander", "np057@");
//            nf.setAcessoSistemas(null);
//        }
//        catch (Exception e) {
//            System.out.println("Erro ao criar conexão com banco: " + e.getMessage());
//            retorno = new RetornoWS<NotaFiscal>();
//            retorno.setCodStatus(Long.valueOf(4));
//            retorno.setMsg("WSNFE -> Falha ao criar conexão com banco: " + e.getMessage());
//            retorno.setModel(null);
//            return Response.ok((Object)retorno).build();
//        }
//        RetornoWS<String> retorno = new RetornoWS<String>();
//        try {
//        	System.out.println("Fechando Conexão");
//            nfs.CloseConnection();
            retorno.setCodStatus(Long.valueOf(1));
            retorno.setMsg("WS OK");
            retorno.setModel(texto);
            System.out.println((Object)retorno);
            return Response.ok((Object)retorno).build();
//        }
//        catch (Throwable e) {
//            System.out.println("Falha ao fechar conexão com o banco: " + e.getMessage());
//            retorno.setCodStatus(Long.valueOf(4));
//            retorno.setMsg("WSNFE -> Falha ao fechar conexão com o banco");
//            retorno.setModel(null);
//            return Response.ok((Object)retorno).build();
//        }
        
    }
}
