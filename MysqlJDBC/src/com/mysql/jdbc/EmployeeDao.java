package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {

	public static ArrayList<Employee> Select() {

		ArrayList<Employee> emplist = new ArrayList<Employee>();

		try {
			Connection con = Db.connect();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(Query.select);
			while (rs.next()) {
				Employee employ = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));

				emplist.add(employ);
			}
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;

	}

	public static void Update(Employee employee) throws SQLException {
		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement(Query.update);
		psm.setInt(1, employee.getSid());
		psm.setString(2, employee.getSname());
		psm.setString(3, employee.getSmail());
		psm.executeUpdate();
		System.out.println("UPDATED SUCCSESSFULLY");
		con.close();

	}

	public static void Delete(Employee employee) throws SQLException {

		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement(Query.delete);
		psm.setInt(1, employee.getSid());
		psm.execute();
		System.out.println("Deleted SUCCSESSFULLY");
		con.close();

	}

	public static void Create(Employee employee) throws SQLException {
		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement(Query.insert);
		psm.setInt(1, employee.getSid());
		psm.setString(2, employee.getSname());
		psm.setString(3, employee.getSmail());
		psm.execute();
		System.out.println("Employee Added " + psm);
	}

}
