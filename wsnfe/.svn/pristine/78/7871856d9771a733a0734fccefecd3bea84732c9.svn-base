package com.ibolt.nfe.services;

import com.ibolt.nfe.models.Cliente;
import com.ibolt.nfe.models.RetornoWS;
import com.ibolt.nfe.services.ControlService;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteService extends ControlService {
	public RetornoWS<Cliente> buscarCliente(Cliente c) throws SQLException {
		RetornoWS<Cliente> retorno = new RetornoWS<Cliente>();
		String sql = "SELECT Codigo, Pessoa, Cpf, Nome, Cnpj, RazaoSocial, Logradouro, Numero, Bairro, Municipio, MunicipioCodigo, Uf, UfCodigo FROM Cliente WHERE Codigo = "
				+ c.getCodigo();
		System.out.println(sql);
		ResultSet rs = this.sttm.executeQuery(sql);
		rs.last();
		int numeroRegistros = rs.getRow();
		rs.beforeFirst();
		if (numeroRegistros != 0) {
			while (rs.next()) {
				c.setTipoPessoa(Long.valueOf(rs.getLong("Pessoa")));
				c.setCpf(rs.getString("Cpf"));
				c.setNome(rs.getString("Nome"));
				c.setCnpj(rs.getString("Cnpj"));
				c.setRazaoSocial(rs.getString("RazaoSocial"));
				c.setLogradouro(rs.getString("Logradouro"));
				c.setNumero(rs.getString("Numero"));
				c.setBairro(rs.getString("Bairro"));
				c.setMunicipio(rs.getString("Municipio"));
				c.setUf(rs.getString("Uf"));
				c.setMunicipioCodigo(rs.getString("MunicipioCodigo"));
				c.setUfCodigo(rs.getString("UfCodigo"));
			}
			retorno.setCodStatus(Long.valueOf(1));
			retorno.setMsg("Busca efetuada com sucesso!");
			retorno.setModel(c);
		} else {
			retorno.setCodStatus(Long.valueOf(2));
			retorno.setMsg("Nenhum cliente encontrado!");
			retorno.setModel(null);
		}
		rs.close();
		return retorno;
	}
}