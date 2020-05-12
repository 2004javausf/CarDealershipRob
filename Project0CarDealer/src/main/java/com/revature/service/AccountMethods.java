package com.revature.service;

import com.revature.beans.Account;

public class AccountMethods {
	
	public static void deposits(Account account, double amount) {
		account.setDeposits(account.getDeposits() + amount);
		
	}
	
	public static void balance(Account account, double amount) {
		account.setAccountBalance(account.getAccountBalance() - amount);
	}

}
