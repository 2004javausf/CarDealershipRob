package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CarDAOImpl;

public class CustomerMenu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void customerMenu() {
		int choice;
		CarDAOImpl cdi = new CarDAOImpl();
		System.out.println("How can we be of service?");
		System.out.println("Press 1 to see available cars");
		System.out.println("Press 2 to make an offer");
		System.out.println("Press 3 to make a payment");
		System.out.println("Press 4 to check balance owed");
		System.out.println("Press 5 to exit");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			try {
				cdi.getCarList();
				System.out.println(cdi.carList);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case 2:
			Scanner dbscan = new Scanner(System.in);
			System.out.println("Enter the ID number of the car you would like");
			int carId = scan.nextInt();
			System.out.println("How much would you like to offer?");
			double depositamount = dbscan.nextDouble();
			break;
		case 3:
			
			break;
		case 4:
			customerMenu();
			break;
		case 5:
			System.out.println("Have a good one!");
			System.exit(1);
			break;
		default:
			break;
		}
	}

}
