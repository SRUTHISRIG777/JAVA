package com.task.polymorphism;
class Vehicle{
	public void start() {
		System.out.println("vehicle started");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("car started");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Vehicle v1=new Car();
		v.start();
		v1.start();
		

	}

}
