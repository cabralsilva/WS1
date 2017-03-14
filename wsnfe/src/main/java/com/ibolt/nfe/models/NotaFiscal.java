package com.ibolt.nfe.models;

import com.ibolt.nfe.models.BDFM;
import com.ibolt.nfe.models.Cliente;
import com.ibolt.nfe.models.ItemNotaFiscal;
import com.ibolt.nfe.models.Transportadora;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "model")
public class NotaFiscal {
	@XmlElement
	private Long codigo;
	@XmlElement
	private String tipoNotaFiscal;
	@XmlElement
	private String dataFaturamento;
	@XmlElement
	private String dataEntrada;
	@XmlElement
	private String dataSaida;
	@XmlElement
	private String dataNotaFiscal;
	@XmlElement
	private Long numeroNotaFiscal;
	@XmlElement
	private String naturezaOperacao;
	@XmlElement
	private Long finalidadeEmissao;
	@XmlElement
	private String finalidadeEmissaoTexto;
	@XmlElement
	private Long identificadorDestinoOperacao;
	@XmlElement
	private String identificadorDestinoOperacaoTexto;
	@XmlElement
	private Long identificadorOperacaoConsumidorFinal;
	@XmlElement
	private String identificadorOperacaoConsumidorFinalTexto;
	@XmlElement
	private Long identificadorPresencaConsumidorFinal;
	@XmlElement
	private String identificadorPresencaConsumidorFinalTexto;
	@XmlElement
	private String observacao;
	@XmlElement
	private Long unificado;
	@XmlElement
	private Long flagProdutoGrade;
	@XmlElement
	private Long tipoMovimentacao;
	@XmlElement
	private String numeroDocumentoImportacao;
	@XmlElement
	private Cliente fkCliente;
	@XmlElement
	private Transportadora fkTransportadora;
	@XmlElement
	private BDFM acessoSistemas;
	@XmlElement
	private Double valorFrete;
	@XmlElement
	private Double valorSeguro;
	@XmlElement
	private Double valorOutros;
	@XmlElement
	private Double valorDesconto;
	@XmlElement
	private Double valorProduto;
	@XmlElement
	private List<ItemNotaFiscal> lstItens;
	@XmlElement
	private String cpf;
	@XmlElement
	private String dataRegistroDI;
	@XmlElement
	private String localDesembaraco;
	@XmlElement
	private String dataDesembaraco;
	@XmlElement
	private String ufDesembaraco;
	@XmlElement
	private Double valorAfrmm;
	@XmlElement
	private String viaTransporteInternacional;
	@XmlElement
	private String formaImportacaoIntermediacao;
	@XmlElement
	private String cnpjAdquirente;
	@XmlElement
	private String ufTerceiro;

	public Double getValorFrete() {
		return this.valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTipoNotaFiscal() {
		return this.tipoNotaFiscal;
	}

	public void setTipoNotaFiscal(String tipoNotaFiscal) {
		this.tipoNotaFiscal = tipoNotaFiscal;
	}

	public String getDataFaturamento() {
		return this.dataFaturamento;
	}

	public void setDataFaturamento(String dataFaturamento) {
		this.dataFaturamento = dataFaturamento;
	}

	public String getDataNotaFiscal() {
		return this.dataNotaFiscal;
	}

	public void setDataNotaFiscal(String dataNotaFiscal) {
		this.dataNotaFiscal = dataNotaFiscal;
	}

	public Long getNumeroNotaFiscal() {
		return this.numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(Long numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public String getNaturezaOperacao() {
		return this.naturezaOperacao;
	}

	public void setNaturezaOperacao(String naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public Long getFinalidadeEmissao() {
		return this.finalidadeEmissao;
	}

	public void setFinalidadeEmissao(Long finalidadeEmissao) {
		this.finalidadeEmissao = finalidadeEmissao;
	}

	public String getFinalidadeEmissaoTexto() {
		return this.finalidadeEmissaoTexto;
	}

	public void setFinalidadeEmissaoTexto(String finalidadeEmissaoTexto) {
		this.finalidadeEmissaoTexto = finalidadeEmissaoTexto;
	}

	public Long getIdentificacaoDestinoOperacao() {
		return this.identificadorDestinoOperacao;
	}

	public void setIdentificacaoDestinoOperacao(Long identificacaoDestinoOperacao) {
		this.identificadorDestinoOperacao = identificacaoDestinoOperacao;
	}

	public String getIdentificacaoDestinoOperacaoTexto() {
		return this.identificadorDestinoOperacaoTexto;
	}

	public void setIdentificacaoDestinoOperacaoTexto(String identificacaoDestinoOperacaoTexto) {
		this.identificadorDestinoOperacaoTexto = identificacaoDestinoOperacaoTexto;
	}

	public Long getIdentificadorOperacaoConsumidorFinal() {
		return this.identificadorOperacaoConsumidorFinal;
	}

	public void setIdentificadorOperacaoConsumidorFinal(Long identificadorOperacaoConsumidorFinal) {
		this.identificadorOperacaoConsumidorFinal = identificadorOperacaoConsumidorFinal;
	}

	public String getIdentificadorOperacaoConsumidorFinalTexto() {
		return this.identificadorOperacaoConsumidorFinalTexto;
	}

	public void setIdentificadorOperacaoConsumidorFinalTexto(String identificadorOperacaoConsumidorFinalTexto) {
		this.identificadorOperacaoConsumidorFinalTexto = identificadorOperacaoConsumidorFinalTexto;
	}

	public Long getIdentificadorPresencaConsumidorFinal() {
		return this.identificadorPresencaConsumidorFinal;
	}

	public void setIdentificadorPresencaConsumidorFinal(Long identificadorPresencaConsumidorFinal) {
		this.identificadorPresencaConsumidorFinal = identificadorPresencaConsumidorFinal;
	}

	public String getIdentificadorPresencaConsumidorFinalTexto() {
		return this.identificadorPresencaConsumidorFinalTexto;
	}

	public void setIdentificadorPresencaConsumidorFinalTexto(String identificadorPresencaConsumidorFinalTexto) {
		this.identificadorPresencaConsumidorFinalTexto = identificadorPresencaConsumidorFinalTexto;
	}

	public Cliente getFkCliente() {
		return this.fkCliente;
	}

	public void setFkCliente(Cliente fkCliente) {
		this.fkCliente = fkCliente;
	}

	public Transportadora getFkTransportadora() {
		return this.fkTransportadora;
	}

	public void setFkTransportadora(Transportadora fkTransportadora) {
		this.fkTransportadora = fkTransportadora;
	}

	public BDFM getAcessoSistemas() {
		return this.acessoSistemas;
	}

	public void setAcessoSistemas(BDFM acessoSistemas) {
		this.acessoSistemas = acessoSistemas;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<ItemNotaFiscal> getLstItens() {
		return this.lstItens;
	}

	public void setLstItens(List<ItemNotaFiscal> lstItens) {
		this.lstItens = lstItens;
	}

	public Long getUnificado() {
		return this.unificado;
	}

	public void setUnificado(Long unificado) {
		this.unificado = unificado;
	}

	public Long getFlagProdutoGrade() {
		return this.flagProdutoGrade;
	}

	public void setFlagProdutoGrade(Long flagProdutoGrade) {
		this.flagProdutoGrade = flagProdutoGrade;
	}

	public String getNumeroDocumentoImportacao() {
		return this.numeroDocumentoImportacao;
	}

	public void setNumeroDocumentoImportacao(String numeroDocumentoImportacao) {
		this.numeroDocumentoImportacao = numeroDocumentoImportacao;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValorSeguro() {
		return this.valorSeguro;
	}

	public void setValorSeguro(Double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public Double getValorOutros() {
		return this.valorOutros;
	}

	public void setValorOutros(Double valorOutros) {
		this.valorOutros = valorOutros;
	}

	public Double getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorProduto() {
		return this.valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getDataRegistroDI() {
		return this.dataRegistroDI;
	}

	public void setDataRegistroDI(String dataRegistroDI) {
		this.dataRegistroDI = dataRegistroDI;
	}

	public String getLocalDesembaraco() {
		return this.localDesembaraco;
	}

	public void setLocalDesembaraco(String localDesembaraco) {
		this.localDesembaraco = localDesembaraco;
	}

	public String getDataDesembaraco() {
		return this.dataDesembaraco;
	}

	public void setDataDesembaraco(String dataDesembaraco) {
		this.dataDesembaraco = dataDesembaraco;
	}

	public String getUfDesembaraco() {
		return this.ufDesembaraco;
	}

	public void setUfDesembaraco(String ufDesembaraco) {
		this.ufDesembaraco = ufDesembaraco;
	}

	public Double getValorAfrmm() {
		return this.valorAfrmm;
	}

	public void setValorAfrmm(Double valorAfrmm) {
		this.valorAfrmm = valorAfrmm;
	}

	public String getViaTransporteInternacional() {
		return this.viaTransporteInternacional;
	}

	public void setViaTransporteInternacional(String viaTransporteInternacional) {
		this.viaTransporteInternacional = viaTransporteInternacional;
	}

	public String getFormaImportacaoIntermediacao() {
		return this.formaImportacaoIntermediacao;
	}

	public void setFormaImportacaoIntermediacao(String formaImportacaoIntermediacao) {
		this.formaImportacaoIntermediacao = formaImportacaoIntermediacao;
	}

	public String getCnpjAdquirente() {
		return this.cnpjAdquirente;
	}

	public void setCnpjAdquirente(String cnpjAdquirente) {
		this.cnpjAdquirente = cnpjAdquirente;
	}

	public String getUfTerceiro() {
		return this.ufTerceiro;
	}

	public void setUfTerceiro(String ufTerceiro) {
		this.ufTerceiro = ufTerceiro;
	}

	public Long getTipoMovimentacao() {
		return this.tipoMovimentacao;
	}

	public void setTipoMovimentacao(Long tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public String getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return this.dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return "NotaFiscal [codigo=" + codigo + ", tipoNotaFiscal=" + tipoNotaFiscal + ", dataFaturamento="
				+ dataFaturamento + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", dataNotaFiscal="
				+ dataNotaFiscal + ", numeroNotaFiscal=" + numeroNotaFiscal + ", naturezaOperacao=" + naturezaOperacao
				+ ", finalidadeEmissao=" + finalidadeEmissao + ", finalidadeEmissaoTexto=" + finalidadeEmissaoTexto
				+ ", identificadorDestinoOperacao=" + identificadorDestinoOperacao
				+ ", identificadorDestinoOperacaoTexto=" + identificadorDestinoOperacaoTexto
				+ ", identificadorOperacaoConsumidorFinal=" + identificadorOperacaoConsumidorFinal
				+ ", identificadorOperacaoConsumidorFinalTexto=" + identificadorOperacaoConsumidorFinalTexto
				+ ", identificadorPresencaConsumidorFinal=" + identificadorPresencaConsumidorFinal
				+ ", identificadorPresencaConsumidorFinalTexto=" + identificadorPresencaConsumidorFinalTexto
				+ ", observacao=" + observacao + ", unificado=" + unificado + ", flagProdutoGrade=" + flagProdutoGrade
				+ ", tipoMovimentacao=" + tipoMovimentacao + ", numeroDocumentoImportacao=" + numeroDocumentoImportacao
				+ ", fkCliente=" + fkCliente + ", fkTransportadora=" + fkTransportadora + ", acessoSistemas="
				+ acessoSistemas + ", valorFrete=" + valorFrete + ", valorSeguro=" + valorSeguro + ", valorOutros="
				+ valorOutros + ", valorDesconto=" + valorDesconto + ", valorProduto=" + valorProduto + ", lstItens="
				+ lstItens + ", cpf=" + cpf + ", dataRegistroDI=" + dataRegistroDI + ", localDesembaraco="
				+ localDesembaraco + ", dataDesembaraco=" + dataDesembaraco + ", ufDesembaraco=" + ufDesembaraco
				+ ", valorAfrmm=" + valorAfrmm + ", viaTransporteInternacional=" + viaTransporteInternacional
				+ ", formaImportacaoIntermediacao=" + formaImportacaoIntermediacao + ", cnpjAdquirente="
				+ cnpjAdquirente + ", ufTerceiro=" + ufTerceiro + "]";
	}
}
