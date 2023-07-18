package com.mysql.jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("IM RUNNING");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1)Select 2)Update 3)Create 4)Delete");
			int option = sc.nextInt();

			if (option < 1 || option >= 5)
				break;

			switch (option) {
			case 1:

				ArrayList<Employee> emp = EmployeeDao.Select();
				for (Employee list : emp) {

					System.out.println(list);
				}

				break;

			}

		}

	}

}
