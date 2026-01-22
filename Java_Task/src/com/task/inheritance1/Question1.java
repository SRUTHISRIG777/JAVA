package com.task.inheritance1;
class Vehicle{
	String make;
	String model;
	int year;
	public Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	public void displayInfo() {
		System.out.println(this.make);
		System.out.println(this.model);
		System.out.println(this.year);
	}
}
class Car extends Vehicle{
	int numberOfDoors;
	public Car(String make,String model,int year,int numberOfDoors) {
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	public void displayCarInfo() {
		System.out.println("number of doors:"+this.numberOfDoors);
	}
	
}

class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String make,String model,int year,int cargoCapacity) {
		super(make,model,year);
		this.cargoCapacity=cargoCapacity;
	}
	public void displayTruckInfo() {
		System.out.println("cargo capacity:"+this.cargoCapacity);
	}
	
}
class MotorCycle extends Vehicle{
	boolean hasSideCar;
	public MotorCycle(String make,String model,int year,boolean hasSideCar) {
		super(make,model,year);
		this.hasSideCar=hasSideCar;
	}
	public void displayMotorCycleInfo() {
		System.out.println("has sideCar:"+this.hasSideCar);
	}
	
}

public class Question1 {

	public static void main(String[] args) {
	Vehicle car=new Car("Toyota","corolla",2022,4);
	car.displayInfo();
	Car c=(Car)car;
	c.displayCarInfo();
	System.out.println("truck info");
	Vehicle truck=new Truck("ford","F-150",2021,1000);
	truck.displayInfo();
	Truck t=(Truck)truck;
	t.displayTruckInfo();
	System.out.println("motorcycle info:");
	Vehicle motor=new MotorCycle("Harley-davidson","street glide",2023,true);
	motor.displayInfo();
	MotorCycle m=(MotorCycle)motor;
	m.displayMotorCycleInfo();

	}

}
