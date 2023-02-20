package com.ex;

public class Bus implements Vehicle{
 int speed;
 String fuel;
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getFuel() {
	return fuel;
}
public void setFuel(String fuel) {
	this.fuel = fuel;
}
 public void move() {
	 System.out.println("Bus started ....");
	 System.out.println("Fuel type="+fuel);
	 System.out.println("Speed"+speed);
 }
}
