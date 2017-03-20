package com.ibolt.nfe.services;

import com.ibolt.nfe.models.Cliente;
import com.ibolt.nfe.models.NotaFiscal;
import com.ibolt.nfe.models.RetornoWS;
import com.ibolt.nfe.models.Transportadora;
import com.ibolt.nfe.services.ControlService;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotaFiscalService extends ControlService {
	public RetornoWS<NotaFiscal> buscarFaturamento(NotaFiscal nf) throws SQLException {
		RetornoWS<NotaFiscal> retorno = new RetornoWS<NotaFiscal>();
		String sql = "";
		if (nf.getUnificado() == 1) {
			sql = "SELECT\n "
					+ "Faturamento.Codigo, Faturamento.CodigoCliente, Faturamento.CodigoTransportadora, \n "
					+ "Faturamento.DataFaturamento, Faturamento.DataNotaFiscal, Faturamento.NumeroNotaFiscal, \n "
					+ "Faturamento.Tipo, Faturamento.NaturezaOperacao, Faturamento.FinalidadeEmissao, \n "
					+ "Faturamento.FinalidadeEmissaoTexto, Faturamento.IdentificadorDestinoOperacao, \n "
					+ "Faturamento.IdentificadorDestinoOperacaoTexto, Faturamento.IdentificadorOperacaoConsumidorFinal, \n "
					+ "Faturamento.IdentificadorOperacaoConsumidorFinalTexto, Faturamento.IdentificadorPresencaConsumidorFinal, \n "
					+ "Faturamento.ValorFrete, Faturamento.IdentificadorPresencaConsumidorFinalTexto, Faturamento.Observacao, \n "
					+ "Faturamento.NumeroDocumentoImportacao, Faturamento.Cpf, Faturamento.ValorSeguro, Faturamento.ValorOutros,\n "
					+ "Faturamento.ValorDesconto, Faturamento.ValorProduto, Faturamento.DataRegistroDI, Faturamento.LocalDesembaraco, \n "
					+ "Faturamento.DataDesembaraco, Faturamento.UfDesembaraco, Faturamento.ValorAfrmm, Faturamento.ViaTransporteInternacional, \n "
					+ "Faturamento.FormaImportacaoIntermediacao, Faturamento.CnpjAdquirente, Faturamento.UfTerceiro, \n\n "
					
					+ "Cliente.Codigo AS CodigoC, Cliente.Pessoa AS PessoaC, Cliente.Cpf AS CpfC, \n "
					+ "Cliente.Nome AS NomeC, Cliente.Cnpj AS CnpjC, Cliente.RazaoSocial AS RazaoSocialC, \n "
					+ "Cliente.Logradouro AS LogradouroC, Cliente.Numero AS NumeroC, Cliente.Bairro AS BairroC, \n "
					+ "Cliente.Municipio AS MunicipioC, Cliente.MunicipioCodigo AS MunicipioCodigoC, Cliente.Uf AS UfC, \n "
					+ "Cliente.UfCodigo AS UfCodigoC, Cliente.IdEstrangeiro AS IdEstrangeiroC, \n "
					+ "Cliente.Email AS EmailC, Cliente.Cpf AS CpfC, \n "
					+ "Cliente.Rg AS RgC, Cliente.Contato AS ContatoC, \n "
					+ "Cliente.Ddd AS DddC, Cliente.Telefone AS TelefoneC, \n "
					+ "Cliente.Cep AS CepC, Cliente.Sexo AS SexoC, \n "
					+ "Cliente.Site AS SiteC, Cliente.Observacao AS ObservacaoC, \n "
					+ "Cliente.Complemento AS ComplementoC, Cliente.IdentificacaoEndereco AS IdentificacaoEnderecoC, \n "
					+ "Cliente.InformacoesReferencia AS InformacoesReferenciaC, Cliente.InscricaoEstadual AS InscricaoEstadualC, \n "
					+ "Cliente.IdentificadorInscricaoEstadual AS IdentificadorInscricaoEstadualC, Cliente.PaisCodigo AS PaisCodigoC, Cliente.Pais AS PaisC, \n\n "
					
					+ "Fornecedor.Codigo AS CodigoT, Fornecedor.Pessoa AS PessoaT, Fornecedor.Cnpj AS CnpjT, \n "
					+ "Fornecedor.Cpf AS CpfT, Fornecedor.RazaoSocial  AS RazaoSocialT, Fornecedor.Nome  AS NomeT, \n "
					+ "Fornecedor.Logradouro  AS LogradouroT, Fornecedor.InscricaoEstadual AS InscricaoEstadualT, \n "
					+ "Fornecedor.InscricaoMunicipal AS InscricaoMunicipalT, Fornecedor.Observacao AS ObservacaoT, \n"
					+ "Fornecedor.Numero AS NumeroT, Fornecedor.Complemento AS ComplementoT, \n "
					+ "Fornecedor.Bairro AS BairroT, Fornecedor.Cep AS CepT, Fornecedor.Municipio AS MunicipioT, \n "
					+ "Fornecedor.Site AS SiteT, \n "
					+ "Fornecedor.Uf AS UfT, Fornecedor.Telefone AS TelefoneT, Fornecedor.Email AS EmailT \n\t "
					
					+ "FROM Faturamento \n "
					+ "LEFT OUTER JOIN Cliente ON Cliente.Codigo = Faturamento.CodigoCliente\n "
					+ "LEFT OUTER JOIN Fornecedor ON Fornecedor.Codigo = Faturamento.CodigoTransportadora\n"
					+ "WHERE Faturamento.Codigo = " + nf.getCodigo();
		} else {
			sql = "SELECT ";
			sql = nf.getTipoMovimentacao() == 0
					? String.valueOf(sql)
							+ "\n Entrada.Codigo, Entrada.DataEntrada, Entrada.DataNotaFiscal, Entrada.NumeroNotaFiscal, \n "
							+ "Entrada.Tipo, Entrada.NaturezaOperacao, Entrada.ValorDesconto,Entrada.ValorProduto, \n "
							+ "Entrada.ValorDiferenca, Entrada.ValorFrete, Entrada.ValorOutros, Entrada.ValorSeguro, \n "
							+ "Entrada.ValorTotal, Entrada.DataRegistroDI, Entrada.NumeroDocumentoImportacao, \n "
							+ "Entrada.LocalDesembaraco, Entrada.UfDesembaraco, Entrada.DataDesembaraco, Entrada.Observacao, \n "
							+ "Entrada.FinalidadeEmissao, Entrada.FinalidadeEmissaoTexto, Entrada.IdentificadorDestinoOperacao, \n "
							+ "Entrada.IdentificadorDestinoOperacaoTexto, Entrada.IdentificadorOperacaoConsumidorFinal, \n "
							+ "Entrada.IdentificadorOperacaoConsumidorFinalTexto, Entrada.IdentificadorPresencaConsumidorFinal, \n "
							+ "Entrada.ValorAfrmm, Entrada.ViaTransporteInternacional, Entrada.IdentificadorPresencaConsumidorFinalTexto,\n "
							+ "Entrada.FormaImportacaoIntermediacao, Entrada.CnpjAdquirente, Entrada.UfTerceiro, \n \n "
							+ "Cliente.Codigo AS CodigoC, Cliente.Pessoa AS PessoaC, Cliente.Cpf AS CpfC, \n "
							+ "Cliente.Nome AS NomeC, Cliente.Cnpj AS CnpjC, Cliente.RazaoSocial AS RazaoSocialC, \n "
							+ "Cliente.Logradouro AS LogradouroC, Cliente.Numero AS NumeroC, Cliente.Bairro AS BairroC, \n "
							+ "Cliente.Municipio AS MunicipioC, Cliente.MunicipioCodigo AS MunicipioCodigoC, Cliente.Uf AS UfC, \n "
							+ "Cliente.UfCodigo AS UfCodigoC, Cliente.IdEstrangeiro AS IdEstrangeiroC, \n "
							+ "Cliente.Email AS EmailC, Cliente.Cpf AS CpfC, \n "
							+ "Cliente.Rg AS RgC, Cliente.Contato AS ContatoC, \n "
							+ "Cliente.Ddd AS DddC, Cliente.Telefone AS TelefoneC, \n "
							+ "Cliente.Cep AS CepC, Cliente.Sexo AS SexoC, \n "
							+ "Cliente.Site AS SiteC, Cliente.Observacao AS ObservacaoC, \n "
							+ "Cliente.Complemento AS ComplementoC, Cliente.IdentificacaoEndereco AS IdentificacaoEnderecoC, \n "
							+ "Cliente.InformacoesReferencia AS InformacoesReferenciaC, Cliente.InscricaoEstadual AS InscricaoEstadualC, \n "
							+ "Cliente.IdentificadorInscricaoEstadual AS IdentificadorInscricaoEstadualC, Cliente.PaisCodigo AS PaisCodigoC, Cliente.Pais AS PaisC, \n\n "
							+ "Transportador.Codigo AS CodigoT, Transportador.Pessoa AS PessoaT, Transportador.Cnpj AS CnpjT, \n "
							+ "Transportador.Cpf AS CpfT, Transportador.RazaoSocial  AS RazaoSocialT, Transportador.Nome  AS NomeT, \n "
							+ "Transportador.Logradouro  AS LogradouroT, Transportador.InscricaoEstadual AS InscricaoEstadualT, \n "
							+ "Transportador.Numero AS NumeroT, Transportador.Complemento AS ComplementoT, \n "
							+ "Transportador.Bairro AS BairroT, Transportador.Cep AS CepT, Transportador.Municipio AS MunicipioT, \n "
							+ "Transportador.InscricaoMunicipal AS InscricaoMunicipalT, Transportador.Observacao AS ObservacaoT, \n"
							+ "Transportador.Uf AS UfT, Transportador.Telefone AS TelefoneT, Transportador.Email AS EmailT \n\t "
							+ "Transportador.Site AS SiteT, \n "
							+ "FROM Entrada \n "
							+ "LEFT JOIN Cliente ON Cliente.Codigo = Entrada.CodigoCliente\n "
							+ "LEFT JOIN Transportador ON Transportador.Codigo = Entrada.CodigoTransportador\n"
							+ "WHERE Entrada.Codigo = "
							+ nf.getCodigo()
					: String.valueOf(sql)
							+ "\n Saida.Codigo, Saida.DataSaida, Saida.DataNotaFiscal, Saida.NumeroNotaFiscal, \n "
							+ "Saida.Tipo, Saida.NaturezaOperacao, Saida.ValorDesconto,Saida.ValorProduto, \n "
							+ "Saida.ValorFrete, Saida.ValorOutros, Saida.ValorSeguro, \n "
							+ "Saida.ValorTotal, Saida.Observacao, Saida.FinalidadeEmissao, \n "
							+ "Saida.FinalidadeEmissaoTexto, Saida.IdentificadorDestinoOperacao, \n "
							+ "Saida.IdentificadorDestinoOperacaoTexto, Saida.IdentificadorOperacaoConsumidorFinal, \n "
							+ "Saida.IdentificadorOperacaoConsumidorFinalTexto, Saida.IdentificadorPresencaConsumidorFinal, \n "
							+ "Saida.IdentificadorPresencaConsumidorFinalTexto,\n \n "
							+ "Cliente.Codigo AS CodigoC, Cliente.Pessoa AS PessoaC, Cliente.Cpf AS CpfC, \n "
							+ "Cliente.Nome AS NomeC, Cliente.Cnpj AS CnpjC, Cliente.RazaoSocial AS RazaoSocialC, \n "
							+ "Cliente.Logradouro AS LogradouroC, Cliente.Numero AS NumeroC, Cliente.Bairro AS BairroC, \n "
							+ "Cliente.Municipio AS MunicipioC, Cliente.MunicipioCodigo AS MunicipioCodigoC, Cliente.Uf AS UfC, \n "
							+ "Cliente.UfCodigo AS UfCodigoC, Cliente.IdEstrangeiro AS IdEstrangeiroC, \n "
							
							+ "Cliente.Email AS EmailC, Cliente.Cpf AS CpfC, \n "
							+ "Cliente.Rg AS RgC, Cliente.Contato AS ContatoC, \n "
							+ "Cliente.Ddd AS DddC, Cliente.Telefone AS TelefoneC, \n "
							+ "Cliente.Cep AS CepC, Cliente.Sexo AS SexoC, \n "
							+ "Cliente.Site AS SiteC, Cliente.Observacao AS ObservacaoC, \n "
							+ "Cliente.Complemento AS ComplementoC, Cliente.IdentificacaoEndereco AS IdentificacaoEnderecoC, \n "
							+ "Cliente.InformacoesReferencia AS InformacoesReferenciaC, Cliente.InscricaoEstadual AS InscricaoEstadualC, \n "
							
							+ "Cliente.IdentificadorInscricaoEstadual AS IdentificadorInscricaoEstadualC, Cliente.PaisCodigo AS PaisCodigoC, Cliente.Pais AS PaisC, \n\n "
							+ "Transportador.Codigo AS CodigoT, Transportador.Pessoa AS PessoaT, Transportador.Cnpj AS CnpjT, \n "
							+ "Transportador.Cpf AS CpfT, Transportador.RazaoSocial  AS RazaoSocialT, Transportador.Nome  AS NomeT, \n "
							+ "Transportador.Logradouro  AS LogradouroT, Transportador.InscricaoEstadual AS InscricaoEstadualT, \n "
							+ "Transportador.Numero AS NumeroT, Transportador.Complemento AS ComplementoT, \n "
							+ "Transportador.Bairro AS BairroT, Transportador.Cep AS CepT, Transportador.Municipio AS MunicipioT, \n "
							+ "Transportador.InscricaoMunicipal AS InscricaoMunicipalT, Transportador.Observacao AS ObservacaoT, \n"
							+ "Transportador.Uf AS UfT, Transportador.Telefone AS TelefoneT, Transportador.Email AS EmailT \n\t "
							+ "Transportador.Site AS SiteT, \n "
							
							+ "FROM Saida \n "
							+ "LEFT JOIN Cliente ON Cliente.Codigo = Saida.CodigoCliente\n "
							+ "LEFT JOIN Transportador ON Transportador.Codigo = Saida.CodigoTransportador\n"
							+ "WHERE Saida.Codigo = "
							+ nf.getCodigo();
		}
		System.out.println(sql);
		ResultSet rs = this.sttm.executeQuery(sql);
		rs.last();
		int numeroRegistros = rs.getRow();
		rs.beforeFirst();
		if (numeroRegistros != 0) {
			while (rs.next()) {
				nf.setFkCliente(new Cliente());
				nf.setFkTransportadora(new Transportadora());
				nf.getFkTransportadora().setCodigo(Long.valueOf(rs.getLong("CodigoT")));
				nf.getFkTransportadora().setPessoa(rs.getString("PessoaT"));
				nf.getFkTransportadora().setCnpj(rs.getString("CnpjT"));
				nf.getFkTransportadora().setCpf(rs.getString("CpfT"));
				nf.getFkTransportadora().setRazaoSocial(rs.getString("RazaoSocialT"));
				nf.getFkTransportadora().setLogradouro(rs.getString("LogradouroT"));
				nf.getFkTransportadora().setInscricaoEstadual(rs.getString("InscricaoEstadualT"));
				nf.getFkTransportadora().setInscricaoMunicipal(rs.getString("InscricaoMunicipalT"));
				nf.getFkTransportadora().setNumero(rs.getString("NumeroT"));
				nf.getFkTransportadora().setComplemento(rs.getString("ComplementoT"));
				nf.getFkTransportadora().setBairro(rs.getString("BairroT"));
				nf.getFkTransportadora().setCep(rs.getString("CepT"));
				nf.getFkTransportadora().setMunicipio(rs.getString("MunicipioT"));
				nf.getFkTransportadora().setUf(rs.getString("UfT"));
				nf.getFkTransportadora().setTelefone(rs.getString("TelefoneT"));
				nf.getFkTransportadora().setEmail(rs.getString("EmailT"));
				nf.getFkTransportadora().setObservacao(rs.getString("ObservacaoT"));
				
				nf.getFkTransportadora().setSite(rs.getString("SiteT"));
				
				nf.getFkCliente().setCodigo(Long.valueOf(rs.getLong("CodigoC")));
				nf.getFkCliente().setTipoPessoa(Long.valueOf(rs.getLong("PessoaC")));
				nf.getFkCliente().setCpf(rs.getString("CpfC"));
				nf.getFkCliente().setNome(rs.getString("NomeC"));
				nf.getFkCliente().setCnpj(rs.getString("CnpjC"));
				nf.getFkCliente().setRazaoSocial(rs.getString("RazaoSocialC"));
				nf.getFkCliente().setLogradouro(rs.getString("LogradouroC"));
				nf.getFkCliente().setNumero(rs.getString("NumeroC"));
				nf.getFkCliente().setBairro(rs.getString("BairroC"));
				nf.getFkCliente().setMunicipio(rs.getString("MunicipioC"));
				nf.getFkCliente().setMunicipioCodigo(rs.getString("MunicipioCodigoC"));
				nf.getFkCliente().setUf(rs.getString("UfC"));
				nf.getFkCliente().setUfCodigo(rs.getString("UfCodigoC"));
				nf.getFkCliente().setIdEstrangeiro(Long.valueOf(rs.getLong("IdEstrangeiroC")));
				nf.getFkCliente().setIdentificadorInscricaoEstadual(rs.getString("IdentificadorInscricaoEstadualC"));
				nf.getFkCliente().setPaisCodigo(rs.getString("PaisCodigoC"));
				nf.getFkCliente().setPais(rs.getString("PaisC"));
				
				
				nf.getFkCliente().setEmail(rs.getString("EmailC"));
				nf.getFkCliente().setCpf(rs.getString("CpfC"));
				nf.getFkCliente().setRg(rs.getString("RgC"));
				nf.getFkCliente().setContato(rs.getString("ContatoC"));
				nf.getFkCliente().setTelefone(rs.getString("TelefoneC"));
				nf.getFkCliente().setCep(rs.getString("CepC"));
				nf.getFkCliente().setSexo(rs.getString("SexoC"));
				nf.getFkCliente().setSite(rs.getString("SiteC"));
				nf.getFkCliente().setObservacao(rs.getString("ObservacaoC"));
				nf.getFkCliente().setComplemento(rs.getString("ComplementoC"));
				nf.getFkCliente().setIdentificacaoEndereco(rs.getString("IdentificacaoEnderecoC"));
				nf.getFkCliente().setInformacoesReferencia(rs.getString("InformacoesReferenciaC"));
				nf.getFkCliente().setInscricaoEstadual(rs.getString("InscricaoEstadualC"));
				
				
				int limite = nf.getFkCliente().getCpf() != null && nf.getFkCliente().getCpf() != ""
						? nf.getFkCliente().getCpf().length() : nf.getFkCliente().getCnpj().length();
				int i = nf.getFkCliente().getCpf() != null && nf.getFkCliente().getCpf() != "" ? 11 : 14;
				while (i > limite) {
					if (nf.getFkCliente().getCpf() != null && nf.getFkCliente().getCpf() != "") {
						nf.getFkCliente().setCpf("0" + nf.getFkCliente().getCpf());
					} else {
						nf.getFkCliente().setCnpj("0" + nf.getFkCliente().getCnpj());
					}
					--i;
				}
				if (nf.getUnificado() == 1) {
					nf.setDataFaturamento(rs.getString("DataFaturamento"));
				} else if (nf.getTipoMovimentacao() == 0) {
					nf.setDataEntrada(rs.getString("DataEntrada"));
				} else if (nf.getTipoMovimentacao() == 1) {
					nf.setDataSaida(rs.getString("DataSaida"));
				}
				
				nf.setDataNotaFiscal(rs.getString("DataNotaFiscal"));
				nf.setNumeroNotaFiscal(Long.valueOf(rs.getLong("NumeroNotaFiscal")));
				nf.setTipoNotaFiscal(rs.getString("Tipo"));
				nf.setNaturezaOperacao(rs.getString("NaturezaOperacao"));
				nf.setFinalidadeEmissao(Long.valueOf(rs.getLong("FinalidadeEmissao")));
				nf.setFinalidadeEmissaoTexto(rs.getString("FinalidadeEmissaoTexto"));
				nf.setIdentificacaoDestinoOperacao(Long.valueOf(rs.getLong("IdentificadorDestinoOperacao")));
				nf.setIdentificacaoDestinoOperacaoTexto(rs.getString("IdentificadorDestinoOperacaoTexto"));
				nf.setIdentificadorOperacaoConsumidorFinal(Long.valueOf(rs.getLong("IdentificadorOperacaoConsumidorFinal")));
				nf.setIdentificadorOperacaoConsumidorFinalTexto(rs.getString("IdentificadorOperacaoConsumidorFinalTexto"));
				nf.setIdentificadorPresencaConsumidorFinal(Long.valueOf(rs.getLong("IdentificadorPresencaConsumidorFinal")));
				nf.setIdentificadorPresencaConsumidorFinalTexto(rs.getString("IdentificadorPresencaConsumidorFinalTexto"));
				nf.setObservacao(rs.getString("Observacao"));
				nf.setValorFrete(Double.valueOf(rs.getDouble("ValorFrete")));
				nf.setNumeroDocumentoImportacao(nf.getTipoMovimentacao() != 1 ? rs.getString("NumeroDocumentoImportacao") : null);
				nf.setCpf(nf.getUnificado() == 1 ? rs.getString("Cpf") : null);
				nf.setValorSeguro(Double.valueOf(rs.getDouble("ValorSeguro")));
				nf.setValorOutros(Double.valueOf(rs.getDouble("ValorOutros")));
				nf.setValorDesconto(Double.valueOf(rs.getDouble("ValorDesconto")));
				nf.setValorProduto(Double.valueOf(rs.getDouble("ValorProduto")));
				nf.setDataRegistroDI(nf.getTipoMovimentacao() != 1 ? rs.getString("DataRegistroDI") : null);
				nf.setLocalDesembaraco(nf.getTipoMovimentacao() != 1 ? rs.getString("LocalDesembaraco") : null);
				nf.setDataDesembaraco(nf.getTipoMovimentacao() != 1 ? rs.getString("DataDesembaraco") : null);
				nf.setUfDesembaraco(nf.getTipoMovimentacao() != 1 ? rs.getString("UfDesembaraco") : null);
				nf.setValorAfrmm(nf.getTipoMovimentacao() != 1 ? Double.valueOf(rs.getDouble("ValorAfrmm")) : null);
				nf.setViaTransporteInternacional(nf.getTipoMovimentacao() != 1 ? rs.getString("ViaTransporteInternacional") : null);
				nf.setFormaImportacaoIntermediacao(nf.getTipoMovimentacao() != 1 ? rs.getString("FormaImportacaoIntermediacao") : null);
				nf.setCnpjAdquirente(nf.getTipoMovimentacao() != 1 ? rs.getString("CnpjAdquirente") : null);
				nf.setUfTerceiro(nf.getTipoMovimentacao() != 1 ? rs.getString("UfTerceiro") : null);
				
				if (nf.getCpf() == null || nf.getCpf() == "")
					continue;
				int l = nf.getCpf().length();
				int i2 = 11;
				while (i2 > l) {
					nf.getFkCliente().setCpf("0" + nf.getFkCliente().getCpf());
					--i2;
				}
			}
		} else {
			throw new SQLException("Nenhum Registro Encontrado");
		}
		retorno.setCodStatus(Long.valueOf(1));
		retorno.setMsg("Busca efetuada com sucesso!");
		retorno.setModel(nf);
		rs.close();
		return retorno;
	}
}
