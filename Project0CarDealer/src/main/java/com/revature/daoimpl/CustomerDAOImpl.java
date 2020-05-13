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
import com.revature.util.LogThat;

public class CustomerDAOImpl implements CustomerDAO {
	public static List<Customer> customerList = new ArrayList<Customer>();
	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void insertCustomer(String firstName, String lastName, String userName, String password) throws SQLException {
		Connection conn = cf.getConnection();
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
			System.out.println(customerList);
		}
		return customerList;
	}
	
//	public static List<Customer> findCustomerByUserName(String inputUserName, String inputPassword) throws SQLException {
//		List<Customer> customerList = new ArrayList<Customer>();
//		Connection conn = cf.getConnection();
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT C_USER_NAME, C_PASSWORD FROM CUSTOMER");
//		Customer c = null;
//		while (rs.next()) {
//			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
//			customerList.add(c);
//		}
//		for (int i = 0; i < customerList.size(); i++) {
//			String usName = rs.getString(3);
//			String psword = rs.getString(5);
//			if(inputUserName.equals(usName) || inputPassword.equals(psword)) {
//				return 
//			
//		}
//		return customerList;
//		}
//		System.out.println("User name not Found");
//		return null;
//		
//	}
//	
//	public static Customer findCustomerByPassword(String inputPassword) {
//		
//		for (int i = 0; i < customerList.size(); i++) {
//			String password = CustomerDAOImpl.customerList.get(i).getPassword();
//			if (inputPassword.equals(password)) {
//				return CustomerDAOImpl.customerList.get(i);
//			}
//		}
//		System.out.println("Password doed not match");
//		return null;
//	}
//
	@Override
	public void createCustomer(String userName, String password) {
		CustomerIO.readCustomerFile();
		List<Customer> cList = CustomerDAOImpl.customerList;
		
		String username;
		String password;
		
		for (int i = 0; i < cList.size(); i++) {
			while(userName.equals(cList.get(i))) {
				System.out.println("That username has been taken");
			}
			
		}
		
	}
	


}
