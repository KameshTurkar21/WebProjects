package com.mysql.jdbc;

public class Query {
	
	public static String select = "SELECT * FROM student";
	public static String insert = "INSERT INTO student (sid,sname,smail) values (?,?,?)";
	public static String update = "UPDATE student SET sid=?,sname=?,smail=? where sid=?";
    public static String delete = "DELETE FROM student WHERE eid = ?";
}
