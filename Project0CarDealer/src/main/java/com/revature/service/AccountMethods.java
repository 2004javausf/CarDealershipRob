package com.revature.service;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.io.AccountIO;

public class AccountMethods {
	
	public static void deposits(Account account, double amount) {
		account.setDeposits(account.getDeposits() + amount);
		account.setAccountBalance(account.getAccountBalance() - amount);
		AccountIO.writeAccountFile();
	}

	public static void approveOffer(Customer customer) {
		if(customer.getOffer() == true) {
			customer.setOffer(false);
		}else {
			customer.setOffer(true);
		}
	}
	
}
