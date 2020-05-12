package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.dao.AccountDAO;
import com.revature.util.ConnFactory;

public class AccountDAOImpl implements AccountDAO{
	
	public static List<Account> accountList = new ArrayList<Account>();
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void createAccount() {
		Account account = new Account();
		accountList.add(account);
	}

	public void insertAccount(int accountNumber, double deposits, int accountBalance) throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO ACCOUNT VALUES(" +deposits+ "," +accountBalance+ ")";
		stmt.executeUpdate(sql);
	}
	
	public static Account findByAccountNumber(int num) {
		for (int i = 0; i < AccountDAOImpl.accountList.size(); i++) {
			int accountNumber = AccountDAOImpl.accountList.get(i).getAccountNumber();
			if(accountNumber == num) {
				return AccountDAOImpl.accountList.get(i);
			}
		}
		System.out.println("Account not found");
		return null;
	}
}
