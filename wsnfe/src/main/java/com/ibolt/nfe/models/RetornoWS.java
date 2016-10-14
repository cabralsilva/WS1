package com.ibolt.nfe.models;

import com.ibolt.nfe.models.NotaFiscal;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso(value = { NotaFiscal.class })
public class RetornoWS<T> {
	@XmlElement
	private Long codStatus;
	@XmlElement
	private String msg;
	@XmlAnyElement
	private T model;

	public T getModel() {
		return this.model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getCodStatus() {
		return this.codStatus;
	}

	public void setCodStatus(Long codStatus) {
		this.codStatus = codStatus;
	}

	public String toString() {
		return "RetornoWS [codStatus=" + this.codStatus + ", msg=" + this.msg + ", model=" + this.model + "]";
	}
}