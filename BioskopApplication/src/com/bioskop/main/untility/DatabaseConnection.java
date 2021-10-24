package com.bioskop.main.untility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	private static Connection con = null;
	
	private static String url = "jdbc:mysql://localhost:3306/db_bioskop?useSSL=false"; //connect database
	private static String user = "root";
	private static String password = "";
	
	public static Connection getConnection() {
		
		if (con==null) {
			try {
				con = DriverManager.getConnection(url,user,password);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} 
		return con;
	} 
}


