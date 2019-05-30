package com.demo.dbc;

import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseConnection {
	public String cond="com.mysql.jdbc.Driver";
	public String conc="jdbc:mysql://localhost:3306/try?characterEncoding=utf-8";
	public String username="root";
	public String password="";
	
	public Connection con;
	public DatabaseConnection() throws Exception{
		Class.forName(cond);
		con=DriverManager.getConnection(conc,username,password);
	}
	
	public Connection getConnection(){
		return this.con;
	}
	
	public void Close() throws Exception{
			this.con.close();
	}
}
