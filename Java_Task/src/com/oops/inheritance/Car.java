package com.oops.inheritance;

public class Car extends Vehicle {
	void speed() {
		System.out.println("car is moving at 80 Km/h");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.run();
		c.speed();
	}

}
