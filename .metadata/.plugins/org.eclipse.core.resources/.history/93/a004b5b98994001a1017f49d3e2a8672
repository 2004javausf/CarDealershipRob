package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.dao.AccountDAO;
import com.revature.util.ConnFactory;

public class AccountDAOImpl implements AccountDAO{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createAccount(int accountNumber, double deposits, int accountBalance) throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO ACCOUNT VALUES(" +accountNumber+ ", " +deposits+ "," +accountBalance+ ")";
		stmt.executeUpdate(sql);
	}
	
	

}
