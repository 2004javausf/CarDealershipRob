package com.revature.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

}
