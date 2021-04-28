package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	
	
	public static Connection getdatabaseconn()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "");
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
