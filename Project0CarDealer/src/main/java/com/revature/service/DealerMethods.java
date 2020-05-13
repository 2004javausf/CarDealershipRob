package com.revature.service;

import com.revature.beans.Car;

public class DealerMethods {

	public static void sellCar(Car car) {
		if(car.getSold() == true) {
			car.setSold(false);
		}else {
			car.setSold(true);
		}
	}
}
