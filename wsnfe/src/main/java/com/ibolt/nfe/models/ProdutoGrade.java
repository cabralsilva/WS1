package com.ibolt.nfe.models;

import com.ibolt.nfe.models.Produto;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="model")
public class ProdutoGrade {
    @XmlElement
    private Long codigo;
    @XmlElement
    private Produto fkProduto;
    @XmlElement
    private String codigoProdutoGrade;
    @XmlElement
    private String referencia;
    @XmlElement
    private String modelo;
    @XmlElement
    private String descricaoGrade;

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Produto getFkProduto() {
        return this.fkProduto;
    }

    public void setFkProduto(Produto fkProduto) {
        this.fkProduto = fkProduto;
    }

    public String getCodigoProdutoGrade() {
        return this.codigoProdutoGrade;
    }

    public void setCodigoProdutoGrade(String codigoProdutoGrade) {
        this.codigoProdutoGrade = codigoProdutoGrade;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricaoGrade() {
        return this.descricaoGrade;
    }

    public void setDescricaoGrade(String descricaoGrade) {
        this.descricaoGrade = descricaoGrade;
    }
}
