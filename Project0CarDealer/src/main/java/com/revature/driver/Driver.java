package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CustomerDAOImpl;

public class Driver {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		MainMenu.startMenu();
		CustomerDAOImpl cdi = new CustomerDAOImpl();
		try {
			System.out.println("Enter your first name:");
			
			String firstName = scan.nextLine();
			System.out.println("Enter your last name:");
			String lastName = scan.nextLine();
			System.out.println("Enter your user name");
			String userName = scan.nextLine();
			System.out.println("Enter your password");
			String password = scan.nextLine();
			cdi.insertCustomer(firstName, lastName, userName, password);
			System.out.println(cdi.getCustomerList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
