package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Car;
import com.revature.dao.CarDAO;
import com.revature.util.ConnFactory;

public class CarDAOImpl implements CarDAO {
	
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void insertCar(int carId, String make, String model, String color, int year, double price, String sold)
			throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO STUDENT VALUES(" +carId+ ", '"+make+"', '"+model+"', '"+color+"', "+year+",  "+sold+")";
		stmt.executeUpdate(sql);
	}
	@Override
	public List<Car> getCarList() throws SQLException {
		List<Car> carList = new ArrayList<Car>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR");
		Car c = null;
		while (rs.next()) {
			c = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(7), rs.getString(8));
		}
		return carList;
	}
}
