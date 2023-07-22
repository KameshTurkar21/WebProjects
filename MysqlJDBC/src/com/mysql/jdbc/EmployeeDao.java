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

	public static void Update(String smail,String sname,int sid) throws SQLException {
		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement("UPDATE STUDENT SET sname = '"+ sname + "', smail = '"  + smail + "' WHERE sid = " + sid+"");
		psm.executeUpdate();
		System.out.println("UPDATED SUCCSESSFULLY");
		con.close();

	}

	public static void Delete(int id) throws SQLException {

		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement(Query.delete);
		psm.setInt(1, id);
		psm.execute();
		System.out.println("Deleted SUCCSESSFULLY");
		con.close();

	}

	public static void Create(String sname, String smail) throws SQLException {
		Connection con = Db.connect();
		PreparedStatement psm = con.prepareStatement(Query.insert);
	//	psm.setInt(1, sid);
		psm.setString(2, sname);
		psm.setString(3, smail);
		psm.execute();
		System.out.println("Employee Added " + psm);
	}

}
