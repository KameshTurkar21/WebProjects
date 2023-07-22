package com.mysql.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		System.out.println("IM RUNNING \n\n");

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1)Select 2)Insert 3)Update 4)Delete");
			int option = sc.nextInt();

			if (option < 1 || option >= 5)
				break;

			switch (option) {
			case 1:

				ArrayList<Employee> emp = EmployeeDao.Select();
				for (Employee list : emp) {

					System.out.println(list.toString());
				}

				break;

			case 2:
				try {

					System.out.println("Enetr sname ,smail");
				//	int sid = sc.nextInt();
					String sname = sc.next();
					String smail = sc.next();

					EmployeeDao.Create( sname, smail);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 3:
				System.out.println("sname=? ,snamil=? where sid=?");

				String sname1 = sc.next();
				String smail1 = sc.next();
				int sid1 = sc.nextInt();

				EmployeeDao.Update(sname1, smail1, sid1);

			case 4:
				System.out.println("Enter sid to delete");

				int id = sc.nextInt();
				EmployeeDao.Delete(id);

			}
			System.exit(0);

		}

	}

}
