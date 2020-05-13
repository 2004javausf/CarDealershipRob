package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CarDAOImpl;
import com.revature.daoimpl.EmployeeDAOImpl;
import com.revature.util.LogThis;

public class OtherServicesMenu {
	
	public static void otherServicesMenu() {
		int choice;
		EmployeeDAOImpl edi = new EmployeeDAOImpl();
		CarDAOImpl cadi = new CarDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Other Services");
		System.out.println("Press 1 to add car");
		System.out.println("Press 2 to view offers");
		System.out.println("Press 3 to delete a car");
		System.out.println("Press 4 to view all payments");
		System.out.println("Press 5 to Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				Scanner scan = new Scanner(System.in);
				Scanner scd = new Scanner(System.in);
				System.out.println("Enter make");
				String make = scan.nextLine();
				System.out.println("Enter model");
				String model = scan.nextLine();
				System.out.println("Enter color");
				String color = scan.nextLine();
				System.out.println("Enter year");
				int year = sc.nextInt();
				System.out.println("Enter price");
				double price = scd.nextDouble();
				cadi.insertCar(make, model, color, year, price);
				LogThis.LogIt("info", "New Car inserted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			otherServicesMenu();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			System.exit(1);
			break;

		default:
			break;
		}
	}

}
