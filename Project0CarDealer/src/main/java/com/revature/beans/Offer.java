package com.revature.beans;

public class Offer {
	
	private int offerId;
	private int customerId;
	private int carId;
	
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	public Offer() {
		super();
		
	}
	
	public Offer(int offerId, int customerId, int carId) {
		super();
		this.offerId = offerId;
		this.customerId = customerId;
		this.carId = carId;
	}
	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", customerId=" + customerId + ", carId=" + carId + "]";
	}
}
