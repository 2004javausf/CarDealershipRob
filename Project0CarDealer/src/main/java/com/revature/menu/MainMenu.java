package com.revature.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.daoimpl.CustomerDAOImpl;

public class MainMenu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void startMenu() {
		int choice;
		System.out.println("Welcome to Awesome Cars!");
		System.out.println("========================");
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to create an account");
		System.out.println("Press 3 for other services");
		System.out.println("Press 4 to exit");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter user name");
			String userName = scan.nextLine();
			System.out.println("Enter password");
			String password = scan.nextLine();
			
			if (userName == null || password == null) {
				startMenu();		
			}
			break;
		case 2:
			CustomerDAOImpl cdi = new CustomerDAOImpl();
			try {
				cdi.insertCustomer(userName, userName, userName, userName, choice, choice);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case 3:
			OtherServicesMenu();
			break;
		case 4:
			System.out.println("Keep being awesome!");
			System.exit(1);
			break;
		default:
			break;
		}
	}

}
