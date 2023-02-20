package com.ex;

public class Travel implements Journey{
	Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void startJourney() {
		System.out.println("Journey started .....");	
		vehicle.move();
	}

}
