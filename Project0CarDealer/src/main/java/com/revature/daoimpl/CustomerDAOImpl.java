package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;
import com.revature.io.AccountIO;
import com.revature.io.CustomerIO;
import com.revature.util.ConnFactory;

public class CustomerDAOImpl implements CustomerDAO {
	public static List<Customer> customerList = new ArrayList<Customer>();
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void createCustomer() {
		CustomerIO.readCustomerFile();
		AccountIO.readAccountFile();
		List<Customer> cList = CustomerDAOImpl.customerList;
		List<Account> accList = AccountDAOImpl.accountList;
		Scanner txtInput = new Scanner(System.in);
		
		String firstName;
		String lastName;
		String userName;
		String password;
		int accountNumber = 0;
		int answer = 0;
		
		System.out.println("Enter your First Name");
		firstName = txtInput.nextLine();
		System.out.println("Enter your Last Name");
		lastName = txtInput.nextLine();
		System.out.println("Make a user name");
		userName = txtInput.nextLine();
			for (int i = 0; i < cList.size(); i++) {
				while (userName.equals(cList.get(i).getUserName())) {
					System.out.println("Username already exists");
					System.out.println("Try another user name");
					userName = txtInput.nextLine();
				}
			}
		System.out.println("Make a password");
		password = txtInput.nextLine();
		accountNumber = accList.size() + 1;
		double deposits = 0;
		double accountBalance = 0;
		Account account = new Account(accountNumber, deposits, accountBalance);
	}
	
	@Override
	public void insertCustomer(String firstName, String lastName, String userName, String password) throws SQLException {
		Connection conn = cf.getConnection();
		Scanner txtInput = new Scanner(System.in);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO CUSTOMER VALUES(CSEQ.NEXTVAL, ?, ?, ?, ?, ASEQ.NEXTVAL)");

		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, userName);
		ps.setString(4, password);
		ps.executeUpdate();			
	}

	@Override
	public List<Customer> getCustomerList() throws SQLException {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
		Customer c = null;
		while (rs.next()) {
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
			customerList.add(c);
		}
		return customerList;
	}
	
	public static void validateCustomer() {
		
	}
	
	public static Customer findCustomerByUserName(String inputUserName) {
		for (int i = 0; i < CustomerDAOImpl.customerList.size(); i++) {
			String name = CustomerDAOImpl.customerList.get(i).getUserName();
			if(inputUserName.equals(name)) {
				return CustomerDAOImpl.customerList.get(i);
			}
		}
		System.out.println("Customer not found");
		return null;
	}
	
	public static Customer findCustomerByPassword(String inputPassword) {
		for (int i = 0; i < CustomerDAOImpl.customerList.size(); i++) {
			String password = CustomerDAOImpl.customerList.get(i).getPassword();
			if (inputPassword.equals(password)) {
				return CustomerDAOImpl.customerList.get(i);
			}
		}
		System.out.println("Password doed not match");
		return null;
	}

}
