package com.ibolt.nfe.models;

import com.ibolt.nfe.models.BDFM;
import com.ibolt.nfe.models.Cliente;
import com.ibolt.nfe.models.ItemNotaFiscal;
import com.ibolt.nfe.models.Transportadora;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Entrada {
	@XmlElement
	private Long codigo;
	@XmlElement
	private String dataEntrada;
	@XmlElement
	private String dataNotaFiscal;
	@XmlElement
	private Long numeroNotaFiscal;
	@XmlElement
	private String tipoNotaFiscal;
	@XmlElement
	private String naturezaOperacao;
	@XmlElement
	private Double valorDesconto;
	@XmlElement
	private Double valorProduto;
	@XmlElement
	private Double valorDiferenca;
	@XmlElement
	private Double valorFrete;
	@XmlElement
	private Double valorOutros;
	@XmlElement
	private Double valorSeguro;
	@XmlElement
	private Double valorTotal;
	@XmlElement
	private String dataRegistroDI;
	@XmlElement
	private String numeroDocumentoImportacao;
	@XmlElement
	private String localDesembaraco;
	@XmlElement
	private String ufDesembaraco;
	@XmlElement
	private String dataDesembaraco;
	@XmlElement
	private String observacao;
	@XmlElement
	private Cliente fkCliente;
	@XmlElement
	private Transportadora fkTransportadora;
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
	private String cnpjAdquirente;
	@XmlElement
	private String formaImportacaoIntermediacao;
	@XmlElement
	private String ufTerceiro;
	@XmlElement
	private String viaTransporteInternacional;
	@XmlElement
	private Double valorAfrmm;
	@XmlElement
	private Long unificado;
	@XmlElement
	private Long flagProdutoGrade;
	@XmlElement
	private BDFM acessoSistemas;
	@XmlElement
	private List<ItemNotaFiscal> lstItens;
}
