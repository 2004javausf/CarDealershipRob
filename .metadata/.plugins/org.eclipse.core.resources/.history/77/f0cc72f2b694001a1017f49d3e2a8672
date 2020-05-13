package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;

public class CarIO {
	
	private static final String carFile = "carList.txt";
	
	public static void writeCarList() {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(carFile));
			objectOut.writeObject(CarDAOImpl.carList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void  readCarFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(carFile));
			CarDAOImpl.carList = (ArrayList<Car>) objectIn.readObject();
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
