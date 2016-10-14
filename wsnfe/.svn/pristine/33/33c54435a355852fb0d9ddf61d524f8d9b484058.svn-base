package com.ibolt.nfe.services;

import com.ibolt.util.ConnectFilemaker;
import java.sql.Statement;

public class ControlService {
	ConnectFilemaker cf;
	Statement sttm;

	public void CreateConnection(String host, String base, String user, String pwd) throws Exception {
		System.out.println("Criando a Conexão");
		this.cf = new ConnectFilemaker(host, base, user, pwd);
		this.sttm = this.cf.getCon().createStatement();
	}

	public void CloseConnection() throws Throwable {
		this.sttm.close();
		this.cf.getCon().close();
		super.finalize();
	}

	public ConnectFilemaker getCf() {
		return this.cf;
	}

	public void setCf(ConnectFilemaker cf) {
		this.cf = cf;
	}

	public Statement getSttm() {
		return this.sttm;
	}

	public void setSttm(Statement sttm) {
		this.sttm = sttm;
	}
}
