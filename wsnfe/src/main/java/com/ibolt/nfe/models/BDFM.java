package com.ibolt.nfe.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "model")
public class BDFM {
	@XmlElement
	private String host;
	@XmlElement
	private String base;
	@XmlElement
	private String user;
	@XmlElement
	private String pwd;

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "BDFM [host=" + host + ", base=" + base + ", user=" + user + ", pwd=" + pwd + "]";
	}
	
	
}
