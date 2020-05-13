package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.revature.beans.Account;
import com.revature.daoimpl.AccountDAOImpl;

public class AccountIO {
	
	private static final String accountFile = "accountFile.txt";
	
	public static void writeAccountFile() {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(accountFile));
			objectOut.writeObject(AccountDAOImpl.accountList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void  readAccountFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));
			AccountDAOImpl.accountList = (ArrayList<Account>) objectIn.readObject();
			objectIn.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
