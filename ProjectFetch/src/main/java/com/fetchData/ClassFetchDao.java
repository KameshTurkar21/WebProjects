package com.fetchData;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

public class ClassFetchDao {
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public List<Map<String, Object>> fetchData() {
		List<Map<String, Object>> list = null;

		String query = "SELECT * FROM student"; // Modify the SQL query as needed

		QueryRunner queryRunner = new QueryRunner();

		try {
			list = queryRunner.query(connection, query, new MapListHandler());
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Error fetching data", e);
		}

		return list;
	}
}
