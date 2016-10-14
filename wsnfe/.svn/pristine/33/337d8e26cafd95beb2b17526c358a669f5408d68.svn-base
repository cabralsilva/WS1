package com.ibolt.nfe.services;

import com.ibolt.nfe.models.RetornoWS;
import com.ibolt.nfe.models.Transportadora;
import com.ibolt.nfe.services.ControlService;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransportadoraService extends ControlService {
	public RetornoWS<Transportadora> buscarTransportadora(Transportadora t) throws SQLException {
		RetornoWS<Transportadora> retorno = new RetornoWS<Transportadora>();
		String sql = "SELECT * FROM Fornecedor WHERE Codigo = " + t.getCodigo();
		System.out.println(sql);
		ResultSet rs = this.sttm.executeQuery(sql);
		rs.last();
		int numeroRegistros = rs.getRow();
		rs.beforeFirst();
		if (numeroRegistros != 0) {
			while (rs.next()) {
			}
			retorno.setCodStatus(Long.valueOf(1));
			retorno.setMsg("Busca efetuada com sucesso!");
			retorno.setModel(t);
		} else {
			retorno.setCodStatus(Long.valueOf(2));
			retorno.setMsg("Nenhum cliente encontrado!");
			retorno.setModel(null);
		}
		rs.close();
		return retorno;
	}
}
