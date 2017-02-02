package com.ibolt.nfe.services;

import com.ibolt.nfe.models.ItemNotaFiscal;
import com.ibolt.nfe.models.NotaFiscal;
import com.ibolt.nfe.models.Produto;
import com.ibolt.nfe.models.ProdutoGrade;
import com.ibolt.nfe.models.RetornoWS;
import com.ibolt.nfe.services.ControlService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemNotaFiscalService extends ControlService {
	public RetornoWS<List<ItemNotaFiscal>> buscarItensNF(NotaFiscal nf) throws SQLException {
		RetornoWS<List<ItemNotaFiscal>> retorno = new RetornoWS<List<ItemNotaFiscal>>();
		retorno.setModel(new ArrayList<ItemNotaFiscal>());
		System.out.println(nf);
		String sql = "SELECT ";
		if (nf.getUnificado() == 1) {
			sql = String.valueOf(sql)
					+ "\n FaturamentoProdutoGrade.Codigo, FaturamentoProdutoGrade.CodigoProdutoGrade,\n FaturamentoProdutoGrade.Valor, FaturamentoProdutoGrade.ValorUnitario, FaturamentoProdutoGrade.Quantidade,\n FaturamentoProdutoGrade.ValorTotal, FaturamentoProdutoGrade.AliqCofins, \n FaturamentoProdutoGrade.AliqIcms, FaturamentoProdutoGrade.AliqIcmsInternoUfDestino,\n FaturamentoProdutoGrade.AliqIcmsSt, FaturamentoProdutoGrade.AliqIpi,\n FaturamentoProdutoGrade.AliqPis, FaturamentoProdutoGrade.Cfop,\n FaturamentoProdutoGrade.CstCofins, FaturamentoProdutoGrade.CstCsosn,\n FaturamentoProdutoGrade.CstIpi, FaturamentoProdutoGrade.CstPis,\n FaturamentoProdutoGrade.ModalidadeIcms, FaturamentoProdutoGrade.ModalidadeIcmsSt,\n FaturamentoProdutoGrade.OrigemTributaria, FaturamentoProdutoGrade.ReducaoBaseCalculoIcms,\n FaturamentoProdutoGrade.ReducaoBaseCalculoIcmsSt, FaturamentoProdutoGrade.ValorBaseCalculoImpostoImportacao,\n FaturamentoProdutoGrade.ValorDespesaAduaneira, FaturamentoProdutoGrade.ValorImpostoImportacao,\n FaturamentoProdutoGrade.ValorImpostoOperacoesFinanceiras, FaturamentoProdutoGrade.NumeroAdicao,\n FaturamentoProdutoGrade.NumeroSequencialAdicao, FaturamentoProdutoGrade.CodigoFabricanteEstrangeiro,\n FaturamentoProdutoGrade.ValorDescontoDI, FaturamentoProdutoGrade.Mva, ";
			if (nf.getFlagProdutoGrade() == 1) {
				sql = String.valueOf(sql)
						+ "\n ProdutoGrade.Codigo AS CodigoPG, ProdutoGrade.Referencia AS ReferenciaPG,\n ProdutoGrade.Modelo AS ModeloPG, ProdutoGrade.DescricaoGrade AS DescricaoGradePG,\n\n Produto.Codigo AS CodigoP, Produto.Descricao AS DescricaoP,\n Produto.UnidadeComercial AS UnidadeComercialP, Produto.ValorSaida AS ValorSaidaP,\n Produto.ValorSaidaPromocao AS ValorSaidaPromocaoP, "
						+ "Produto.PesoBruto AS PesoBrutoP,\n Produto.PesoLiquido AS PesoLiquidoP, Produto.Comprimento AS ComprimentoP,\n Produto.Altura AS AlturaP, Produto.Largura AS LarguraP,\n Produto.Ncm AS NcmP, Produto.CfopSaidaInterno AS CfopSaidaInternoP,\n Produto.CfopSaidaExterno AS CfopSaidaExternoP, Produto.CfopEntradaInterno AS CfopEntradaInternoP,\n Produto.CfopEntradaExterno AS CfopEntradaExternoP, Produto.OrigemTributaria AS OrigemTributariaP,\n Produto.AliqPis AS AliquotaPisP, Produto.AliqCofins AS AliquotaCofinsP,\n Produto.AliqIpi AS AliquotaIpiP, Produto.AliqIcms AS AliquotaIcmsP,\n Produto.AliqIcmsSt AS AliquotaIcmsStP, Produto.CstIpi AS CstIpiP,\n Produto.CstCofins AS CstCofinsP, Produto.CstPis AS CstPisP,\n Produto.CstCsosn AS CstCsosnP, Produto.ModalidadeIcms AS ModalidadeIcmsP,\n Produto.ModalidadeIcmsSt AS ModalidadeIcmsStP ";
			}
			sql = String.valueOf(sql)
					+ "\n\n FROM FaturamentoProdutoGrade \n\t LEFT JOIN ProdutoGrade ON FaturamentoProdutoGrade.CodigoProdutoGrade = ProdutoGrade.CodigoProdutoGrade \n\t LEFT JOIN Produto ON ProdutoGrade.CodigoProduto = Produto.Codigo \n WHERE FaturamentoProdutoGrade.CodigoFaturamento = "
					+ nf.getCodigo();
		} else {
			sql = String.valueOf(sql) + "\n SaidaProdutoGrade.Codigo, SaidaProdutoGrade."
					+ (nf.getTipoMovimentacao() == 0 ? "CodigoEntrada, " : "CodigoSaida, ")
					+ "\n SaidaProdutoGrade.CodigoProdutoGrade, SaidaProdutoGrade.Valor, "
					+ "\n SaidaProdutoGrade.ValorUnitario, SaidaProdutoGrade.Quantidade, "
					+ "\n SaidaProdutoGrade.ValorTotal, SaidaProdutoGrade.AliqCofins, "
					+ "\n SaidaProdutoGrade.AliqIcms, SaidaProdutoGrade.AliqIcmsSt, "
					+ "\n SaidaProdutoGrade.AliqIpi, SaidaProdutoGrade.AliqPis, "
					+ "\n SaidaProdutoGrade.Cfop, SaidaProdutoGrade.CstCofins, "
					+ "\n SaidaProdutoGrade.CstCsosn, SaidaProdutoGrade.CstIpi, "
					+ "\n SaidaProdutoGrade.CstPis, SaidaProdutoGrade.ModalidadeIcms, "
					+ "\n SaidaProdutoGrade.ModalidadeIcmsSt, SaidaProdutoGrade.OrigemTributaria, "
					+ "\n SaidaProdutoGrade.ReducaoBaseCalculoIcms, SaidaProdutoGrade.ReducaoBaseCalculoIcmsSt, "
					+ "\n SaidaProdutoGrade.ValorBaseCalculoImpostoImportacao, SaidaProdutoGrade.ValorDespesaAduaneira, "
					+ "\n SaidaProdutoGrade.ValorImpostoImportacao, SaidaProdutoGrade.ValorImpostoOperacoesFinanceiras, "
					+ "\n SaidaProdutoGrade.NumeroAdicao, SaidaProdutoGrade.NumeroSequencialAdicao, "
					+ "\n SaidaProdutoGrade.CodigoFabricanteEstrangeiro, SaidaProdutoGrade.ValorDescontoDI, "
					+ "\n SaidaProdutoGrade.Mva, SaidaProdutoGrade.AliqIcmsInternoUfDestino, ";
			if (nf.getFlagProdutoGrade() == 1) {
				sql = String.valueOf(sql)
						+ "\n ProdutoGrade.Codigo AS CodigoPG, ProdutoGrade.Referencia AS ReferenciaPG,\n "
						+ "ProdutoGrade.Modelo AS ModeloPG, ProdutoGrade.DescricaoGrade AS DescricaoGradePG,\n "
						+ "Produto.Codigo AS CodigoP, Produto.Descricao AS DescricaoP,\n "
						+ "Produto.UnidadeComercial AS UnidadeComercialP, Produto.ValorSaida AS ValorSaidaP,\n "
						+ "Produto.ValorSaidaPromocao AS ValorSaidaPromocaoP, Produto.PesoBruto AS PesoBrutoP,\n "
						+ "Produto.PesoLiquido AS PesoLiquidoP, Produto.Comprimento AS ComprimentoP,\n "
						+ "Produto.Altura AS AlturaP, Produto.Largura AS LarguraP,\n "
						+ "Produto.Ncm AS NcmP, Produto.CfopSaidaInterno AS CfopSaidaInternoP,\n "
						+ "Produto.CfopSaidaExterno AS CfopSaidaExternoP, Produto.CfopEntradaInterno AS CfopEntradaInternoP,\n "
						+ "Produto.CfopEntradaExterno AS CfopEntradaExternoP, Produto.OrigemTributaria AS OrigemTributariaP,\n "
						+ "Produto.AliqPis AS AliquotaPisP, Produto.AliqCofins AS AliquotaCofinsP,\n "
						+ "Produto.AliqIpi AS AliquotaIpiP, Produto.AliqIcms AS AliquotaIcmsP,\n "
						+ "Produto.AliqIcmsSt AS AliquotaIcmsStP, Produto.CstIpi AS CstIpiP,\n "
						+ "Produto.CstCofins AS CstCofinsP, Produto.CstPis AS CstPisP,\n "
						+ "Produto.CstCsosn AS CstCsosnP, Produto.ModalidadeIcms AS ModalidadeIcmsP,\n "
						+ "Produto.ModalidadeIcmsSt AS ModalidadeIcmsStP";
			}
			sql = String.valueOf(sql)
					+ "\n\n FROM SaidaProdutoGrade \n\t LEFT JOIN ProdutoGrade ON SaidaProdutoGrade.CodigoProdutoGrade = ProdutoGrade.CodigoProdutoGrade \n\t LEFT JOIN Produto ON ProdutoGrade.CodigoProduto = Produto.Codigo \n WHERE SaidaProdutoGrade."
					+ (nf.getTipoMovimentacao() == 0 ? "CodigoEntrada " : "CodigoSaida ") + " = " + nf.getCodigo();
		}
		System.out.println(sql);
		ResultSet rs = this.sttm.executeQuery(sql);
		while (rs.next()) {
			ItemNotaFiscal inf = new ItemNotaFiscal();
			inf.setFkProdutoGrade(new ProdutoGrade());
			inf.getFkProdutoGrade().setFkProduto(new Produto());
			inf.getFkProdutoGrade().setCodigo(Long.valueOf(rs.getLong("CodigoPG")));
			inf.getFkProdutoGrade().setCodigoProdutoGrade(rs.getString("CodigoProdutoGrade"));
			inf.getFkProdutoGrade().setReferencia(rs.getString("ReferenciaPG"));
			inf.getFkProdutoGrade().setModelo(rs.getString("ModeloPG"));
			inf.getFkProdutoGrade().setDescricaoGrade(rs.getString("DescricaoGradePG"));
			inf.getFkProdutoGrade().getFkProduto().setCodigo(Long.valueOf(rs.getLong("CodigoP")));
			inf.getFkProdutoGrade().getFkProduto().setDescricao(rs.getString("DescricaoP"));
			inf.getFkProdutoGrade().getFkProduto().setUnidadeComercial(rs.getString("UnidadeComercialP"));
			inf.getFkProdutoGrade().getFkProduto().setValorSaida(Double.valueOf(rs.getDouble("ValorSaidaP")));
			inf.getFkProdutoGrade().getFkProduto()
					.setValorSaidaPromocao(Double.valueOf(rs.getDouble("ValorSaidaPromocaoP")));
			inf.getFkProdutoGrade().getFkProduto().setPesoBruto(Double.valueOf(rs.getDouble("PesoBrutoP")));
			inf.getFkProdutoGrade().getFkProduto().setPesoLiquido(Double.valueOf(rs.getDouble("PesoLiquidoP")));
			inf.getFkProdutoGrade().getFkProduto().setComprimento(Double.valueOf(rs.getDouble("ComprimentoP")));
			inf.getFkProdutoGrade().getFkProduto().setAltura(Double.valueOf(rs.getDouble("AlturaP")));
			inf.getFkProdutoGrade().getFkProduto().setLargura(Double.valueOf(rs.getDouble("LarguraP")));
			inf.getFkProdutoGrade().getFkProduto().setNcm(Long.valueOf(rs.getLong("NcmP")));
			inf.getFkProdutoGrade().getFkProduto().setCfopSaidaEstadual(Long.valueOf(rs.getLong("CfopSaidaInternoP")));
			inf.getFkProdutoGrade().getFkProduto().setCfopSaidaNacional(Long.valueOf(rs.getLong("CfopSaidaExternoP")));
			inf.getFkProdutoGrade().getFkProduto()
					.setCfopEntradaEstadual(Long.valueOf(rs.getLong("CfopEntradaInternoP")));
			inf.getFkProdutoGrade().getFkProduto()
					.setCfopEntradaNacional(Long.valueOf(rs.getLong("CfopEntradaExternoP")));
			inf.getFkProdutoGrade().getFkProduto().setOrigemTributaria(Long.valueOf(rs.getLong("OrigemTributariaP")));
			inf.getFkProdutoGrade().getFkProduto().setAliquotaPis(Long.valueOf(rs.getLong("AliquotaPisP")));
			inf.getFkProdutoGrade().getFkProduto().setAliquotaCofins(Long.valueOf(rs.getLong("AliquotaCofinsP")));
			inf.getFkProdutoGrade().getFkProduto().setAliquotaIpi(Long.valueOf(rs.getLong("AliquotaIpiP")));
			inf.getFkProdutoGrade().getFkProduto().setAliquotaIcms(Long.valueOf(rs.getLong("AliquotaIcmsP")));
			inf.getFkProdutoGrade().getFkProduto().setAliquotaIcmsSt(Long.valueOf(rs.getLong("AliquotaIcmsStP")));
			inf.getFkProdutoGrade().getFkProduto().setCstIpi(Long.valueOf(rs.getLong("CstIpiP")));
			inf.getFkProdutoGrade().getFkProduto().setCstCofins(Long.valueOf(rs.getLong("CstCofinsP")));
			inf.getFkProdutoGrade().getFkProduto().setCstPis(Long.valueOf(rs.getLong("CstPisP")));
			inf.getFkProdutoGrade().getFkProduto().setCstCsosn(Long.valueOf(rs.getLong("CstCsosnP")));
			inf.getFkProdutoGrade().getFkProduto().setModalidadeIcms(Long.valueOf(rs.getLong("ModalidadeIcmsP")));
			inf.getFkProdutoGrade().getFkProduto().setModalidadeIcmsSt(Long.valueOf(rs.getLong("ModalidadeIcmsStP")));
			inf.setCodigo(Long.valueOf(rs.getLong("Codigo")));
			inf.setValor(Double.valueOf(rs.getDouble("Valor")));
			inf.setValorUnitario(Double.valueOf(rs.getDouble("ValorUnitario")));
			inf.setQuantidade(Double.valueOf(rs.getDouble("Quantidade")));
			inf.setValorTotal(Double.valueOf(rs.getDouble("ValorTotal")));
			inf.setAliquotaCofins(Double.valueOf(rs.getDouble("AliqCofins")));
			inf.setAliquotaIcms(Double.valueOf(rs.getDouble("AliqIcms")));
			inf.setAliquotaIcmsInternoUfDestino(Double.valueOf(rs.getDouble("AliqIcmsInternoUfDestino")));
			inf.setAliquotaIcmsSt(Double.valueOf(rs.getDouble("AliqIcmsSt")));
			inf.setAliquotaIpi(Double.valueOf(rs.getDouble("AliqIpi")));
			inf.setAliquotaPis(Double.valueOf(rs.getDouble("AliqPis")));
			inf.setCfop(Long.valueOf(rs.getLong("Cfop")));
			inf.setCstCofins(Long.valueOf(rs.getLong("CstCofins")));
			inf.setCstCsosn(Long.valueOf(rs.getLong("CstCsosn")));
			inf.setCstIpi(Long.valueOf(rs.getLong("CstIpi")));
			inf.setCstPis(Long.valueOf(rs.getLong("CstPis")));
			inf.setModalidadeIcms(rs.getString("ModalidadeIcms"));
			inf.setModalidadeIcmsSt(rs.getString("ModalidadeIcmsSt"));
			inf.setOrigemTributaria(rs.getString("OrigemTributaria"));
			inf.setReducaoBaseCalculoIcms(Double.valueOf(rs.getDouble("ReducaoBaseCalculoIcms")));
			inf.setReducaoBaseCalculoIcmsSt(Double.valueOf(rs.getDouble("ReducaoBaseCalculoIcmsSt")));
			inf.setValorBaseCalculoImpostoImportacao(Double.valueOf(rs.getDouble("ValorBaseCalculoImpostoImportacao")));
			inf.setValorDespesaAduaneira(Double.valueOf(rs.getDouble("ValorDespesaAduaneira")));
			inf.setValorImpostoImportacao(Double.valueOf(rs.getDouble("ValorImpostoImportacao")));
			inf.setValorImpostoOperacoesFinanceiras(Double.valueOf(rs.getDouble("ValorImpostoOperacoesFinanceiras")));
			inf.setNumeroAdicao(Long.valueOf(rs.getLong("NumeroAdicao")));
			inf.setNumeroSequencialAdicao(Long.valueOf(rs.getLong("NumeroSequencialAdicao")));
			inf.setCodigoFabricanteEstrangeiro(rs.getString("CodigoFabricanteEstrangeiro"));
			inf.setValorDescontoDI(Double.valueOf(rs.getDouble("ValorDescontoDI")));
			inf.setMva(Double.valueOf(rs.getDouble("Mva")));
			retorno.getModel().add(inf);
		}
		retorno.setCodStatus(Long.valueOf(1));
		retorno.setMsg("Busca efetuada com sucesso!");
		rs.close();
		return retorno;
	}
}
