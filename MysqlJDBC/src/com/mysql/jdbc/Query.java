package com.mysql.jdbc;

public class Query {
	
	public static String select = "SELECT * FROM student";
	public static String insert = "INSERT INTO student (sname,smail) values (?,?)";
	public static String update = "UPDATE student sname=? ,snamil=? where sid=?";
    public static String delete = "DELETE FROM student WHERE sid = ?";
}
