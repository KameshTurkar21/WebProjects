package com.mysql.jdbc;

public class Employee {
	
	private int sid;
	private String sname;
	private String smail;
	
	public Employee(int sid, String sname, String smail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smail = smail;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getSmail() {
		return smail;
	}

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", sname=" + sname + ", smail=" + smail + "]";
	}
	
	
	
	
	

}
