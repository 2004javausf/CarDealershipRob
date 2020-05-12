package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.revature.beans.Employee;
import com.revature.daoimpl.EmployeeDAOImpl;

public class EmployeeIO {
	
	private static final String employeeFile = "employeeFile.txt";
	
	public static void writeEmployeeFile() {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(employeeFile));
			objectOut.writeObject(EmployeeDAOImpl.employeeList);
			objectOut.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readEmployeeFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(employeeFile));
			EmployeeDAOImpl.employeeList = (ArrayList<Employee>) objectIn.readObject();
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
