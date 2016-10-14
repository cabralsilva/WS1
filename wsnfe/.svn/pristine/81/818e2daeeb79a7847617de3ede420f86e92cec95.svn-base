package com.ibolt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLWarning;
import java.sql.Statement;

public class ConnectFilemaker {
	private Connection con;
	private Statement stmt;

	public Connection getCon() {
		return this.con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStmt() {
		return this.stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ConnectFilemaker(String host, String base, String user, String pwd) throws Exception {
		Class.forName("com.filemaker.jdbc.Driver").newInstance();
		this.con = DriverManager.getConnection("jdbc:filemaker://" + host + "/" + base, user, pwd);
		SQLWarning warning = null;
		warning = this.con.getWarnings();
		while (warning != null) {
			System.out.println("Warning: " + warning);
			warning = warning.getNextWarning();
		}
	}
}
