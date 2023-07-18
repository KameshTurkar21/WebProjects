package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	static Connection con = null;

	public static Connection connect() {
		String url = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "2110";

		try {
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

}
