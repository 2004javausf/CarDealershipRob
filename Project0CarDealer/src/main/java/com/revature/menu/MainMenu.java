package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.io.CustomerIO;
import com.revature.io.EmployeeIO;
import com.revature.util.LogThis;

public class MainMenu {
	
	static Scanner scan = new Scanner(System.in);
	static Scanner scanTxt = new Scanner(System.in);
	
	public static void startMenu() {
		CustomerDAOImpl cdi = new CustomerDAOImpl();
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
			CustomerMenu cm = new CustomerMenu();
			System.out.println("Enter user name");
			String userName = scanTxt.nextLine();
			System.out.println("Enter password");
			String password = scanTxt.nextLine();
			
//			if (userName == null || password == null) {
//				startMenu();		
//			}
//			try {
//				for (int i = 0; i < cdi.getCustomerList().size(); i++) {
//					if (userName.equals(anObject)) {
//						
//					}
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			cm.customerMenu();
			break;
		case 2:
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter your First Name");
				String firstName = sc.nextLine();
				System.out.println("Enter your Last Name");
				String lastName = sc.nextLine();
				System.out.println("Make a user name");
				String userName1 = sc.nextLine();
				System.out.println("Make a password");
				String password1 = sc.nextLine();
				cdi.insertCustomer(firstName, lastName, userName1, password1);
				LogThis.LogIt("info", "Account created");
			}catch (SQLException e) {
				e.printStackTrace();
			}
			startMenu();
			break;
		case 3:
			Scanner sc1 = new Scanner(System.in);
			OtherServicesMenu osm = new OtherServicesMenu();
			System.out.println("Enter user name");
			String userName1 = sc1.nextLine();
			System.out.println("Enter password");
			String password1 = sc1.nextLine();
			osm.otherServicesMenu();
			
			
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
