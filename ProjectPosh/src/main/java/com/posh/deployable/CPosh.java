package com.posh.deployable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CPosh {
  
	static Connection con  ;
	
	
	public static Connection connectionPosh() {
		
		String url = "jdbc:mysql://localhost:3306/mh_data";
		String user = "root";
		String password = "2110";
		
		try {
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return  con;
		
	}
	
	
	

	
	
	
}
