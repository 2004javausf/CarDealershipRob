package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.menu.MainMenu;

public class Driver {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		MainMenu.startMenu();
	}
}
