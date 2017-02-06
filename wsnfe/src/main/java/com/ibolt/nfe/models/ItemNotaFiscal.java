package com.ibolt.nfe.models;

import com.ibolt.nfe.models.ProdutoGrade;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "model")
public class ItemNotaFiscal {
	@XmlElement
	private Long codigo;
	@XmlElement
	private ProdutoGrade fkProdutoGrade;
	@XmlElement
	private Double valor;
	@XmlElement
	private Double valorUnitario;
	@XmlElement
	private Double quantidade;
	@XmlElement
	private Double valorTotal;
	@XmlElement
	private Double aliqCofins;
	@XmlElement
	private Double aliqIcms;
	@XmlElement
	private Double aliqIcmsSt;
	@XmlElement
	private Double aliqIpi;
	@XmlElement
	private Double aliqPis;
	@XmlElement
	private Double aliqIcmsInternoUfDestino;
	@XmlElement
	private Long cfop;
	@XmlElement
	private String cstCofins;
	@XmlElement
	private String cstCsosn;
	@XmlElement
	private String cstIpi;
	@XmlElement
	private String cstPis;
	@XmlElement
	private String modalidadeIcms;
	@XmlElement
	private String modalidadeIcmsSt;
	@XmlElement
	private String origemTributaria;
	@XmlElement
	private Double reducaoBaseCalculoIcms;
	@XmlElement
	private Double reducaoBaseCalculoIcmsSt;
	@XmlElement
	private Double valorBaseCalculoImpostoImportacao;
	@XmlElement
	private Double valorDespesaAduaneira;
	@XmlElement
	private Double valorImpostoImportacao;
	@XmlElement
	private Double valorImpostoOperacoesFinanceiras;
	@XmlElement
	private Long numeroAdicao;
	@XmlElement
	private Long numeroSequencialAdicao;
	@XmlElement
	private String codigoFabricanteEstrangeiro;
	@XmlElement
	private Double valorDescontoDI;
	@XmlElement
	private Double mva;

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public ProdutoGrade getFkProdutoGrade() {
		return this.fkProdutoGrade;
	}

	public void setFkProdutoGrade(ProdutoGrade fkProdutoGrade) {
		this.fkProdutoGrade = fkProdutoGrade;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getAliquotaCofins() {
		return this.aliqCofins;
	}

	public void setAliquotaCofins(Double aliquotaCofins) {
		this.aliqCofins = aliquotaCofins;
	}

	public Double getAliquotaIcms() {
		return this.aliqIcms;
	}

	public void setAliquotaIcms(Double aliquotaIcms) {
		this.aliqIcms = aliquotaIcms;
	}

	public Double getAliquotaIcmsSt() {
		return this.aliqIcmsSt;
	}

	public void setAliquotaIcmsSt(Double aliquotaIcmsSt) {
		this.aliqIcmsSt = aliquotaIcmsSt;
	}

	public Double getAliquotaIpi() {
		return this.aliqIpi;
	}

	public void setAliquotaIpi(Double aliquotaIpi) {
		this.aliqIpi = aliquotaIpi;
	}

	public Double getAliquotaPis() {
		return this.aliqPis;
	}

	public void setAliquotaPis(Double aliquotaPis) {
		this.aliqPis = aliquotaPis;
	}

	public Double getAliquotaIcmsInternoUfDestino() {
		return this.aliqIcmsInternoUfDestino;
	}

	public void setAliquotaIcmsInternoUfDestino(Double aliquotaIcmsInternoUfDestino) {
		this.aliqIcmsInternoUfDestino = aliquotaIcmsInternoUfDestino;
	}

	public Long getCfop() {
		return this.cfop;
	}

	public void setCfop(Long cfop) {
		this.cfop = cfop;
	}

	public String getCstCofins() {
		return this.cstCofins;
	}

	public void setCstCofins(String cstCofins) {
		this.cstCofins = cstCofins;
	}

	public String getCstCsosn() {
		return this.cstCsosn;
	}

	public void setCstCsosn(String cstCsosn) {
		this.cstCsosn = cstCsosn;
	}

	public String getCstIpi() {
		return this.cstIpi;
	}

	public void setCstIpi(String cstIpi) {
		this.cstIpi = cstIpi;
	}

	public String getCstPis() {
		return this.cstPis;
	}

	public void setCstPis(String cstPis) {
		this.cstPis = cstPis;
	}

	public String getModalidadeIcms() {
		return this.modalidadeIcms;
	}

	public void setModalidadeIcms(String modalidadeIcms) {
		this.modalidadeIcms = modalidadeIcms;
	}

	public String getModalidadeIcmsSt() {
		return this.modalidadeIcmsSt;
	}

	public void setModalidadeIcmsSt(String modalidadeIcmsSt) {
		this.modalidadeIcmsSt = modalidadeIcmsSt;
	}

	public String getOrigemTributaria() {
		return this.origemTributaria;
	}

	public void setOrigemTributaria(String origemTributaria) {
		this.origemTributaria = origemTributaria;
	}

	public Double getReducaoBaseCalculoIcms() {
		return this.reducaoBaseCalculoIcms;
	}

	public void setReducaoBaseCalculoIcms(Double reducaoBaseCalculoIcms) {
		this.reducaoBaseCalculoIcms = reducaoBaseCalculoIcms;
	}

	public Double getReducaoBaseCalculoIcmsSt() {
		return this.reducaoBaseCalculoIcmsSt;
	}

	public void setReducaoBaseCalculoIcmsSt(Double reducaoBaseCalculoIcmsSt) {
		this.reducaoBaseCalculoIcmsSt = reducaoBaseCalculoIcmsSt;
	}

	public Double getValorBaseCalculoImpostoImportacao() {
		return this.valorBaseCalculoImpostoImportacao;
	}

	public void setValorBaseCalculoImpostoImportacao(Double valorBaseCalculoImpostoImportacao) {
		this.valorBaseCalculoImpostoImportacao = valorBaseCalculoImpostoImportacao;
	}

	public Double getValorDespesaAduaneira() {
		return this.valorDespesaAduaneira;
	}

	public void setValorDespesaAduaneira(Double valorDespesaAduaneira) {
		this.valorDespesaAduaneira = valorDespesaAduaneira;
	}

	public Double getValorImpostoImportacao() {
		return this.valorImpostoImportacao;
	}

	public void setValorImpostoImportacao(Double valorImpostoImportacao) {
		this.valorImpostoImportacao = valorImpostoImportacao;
	}

	public Double getValorImpostoOperacoesFinanceiras() {
		return this.valorImpostoOperacoesFinanceiras;
	}

	public void setValorImpostoOperacoesFinanceiras(Double valorImpostoOperacoesFinanceiras) {
		this.valorImpostoOperacoesFinanceiras = valorImpostoOperacoesFinanceiras;
	}

	public Long getNumeroAdicao() {
		return this.numeroAdicao;
	}

	public void setNumeroAdicao(Long numeroAdicao) {
		this.numeroAdicao = numeroAdicao;
	}

	public Long getNumeroSequencialAdicao() {
		return this.numeroSequencialAdicao;
	}

	public void setNumeroSequencialAdicao(Long numeroSequencialAdicao) {
		this.numeroSequencialAdicao = numeroSequencialAdicao;
	}

	public String getCodigoFabricanteEstrangeiro() {
		return this.codigoFabricanteEstrangeiro;
	}

	public void setCodigoFabricanteEstrangeiro(String codigoFabricanteEstrangeiro) {
		this.codigoFabricanteEstrangeiro = codigoFabricanteEstrangeiro;
	}

	public Double getValorDescontoDI() {
		return this.valorDescontoDI;
	}

	public void setValorDescontoDI(Double valorDescontoDI) {
		this.valorDescontoDI = valorDescontoDI;
	}

	public Double getMva() {
		return this.mva;
	}

	public void setMva(Double mva) {
		this.mva = mva;
	}
}
