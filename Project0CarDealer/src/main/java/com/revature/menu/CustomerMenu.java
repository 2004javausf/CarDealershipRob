package com.revature.menu;

import com.revature.io.AccountIO;
import com.revature.io.CarIO;
import com.revature.io.CustomerIO;

public class CustomerMenu {
	
	public static void customerMenu() {
		CustomerIO.readCustomerFile();
		AccountIO.readAccountFile();
		CarIO.readCarFile();
		System.out.println("How can we be of service?");
	}

}
