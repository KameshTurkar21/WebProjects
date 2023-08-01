package com.fetchData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSoGet {
	static Connection connection = null;
	
	public static Connection DbConnect() {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "2110";
		
		try {
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return connection;
		
	}
	
	
	

}
