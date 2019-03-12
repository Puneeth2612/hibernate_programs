package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {

	public static void main(String[] args) {
	String jdbcUrl = "jdbc:mysql://localhost:3306/grosstore?useSSL=false";
		String user = "root";
		String pswrd="root";

		try
		{
			Connection con =DriverManager.getConnection(jdbcUrl,user,pswrd);
			System.out.println("connection sucess");
				
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}


}
