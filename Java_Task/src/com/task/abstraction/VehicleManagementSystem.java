package com.task.abstraction;

abstract class Vehicle{
	String modelName;
	int vehicleNumber;
	String company;
	
	public Vehicle(String modelName, int vehicleNumber, String company) {
	
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}
	public abstract void startEngine();
	public void fuelType() {
		System.out.println("fuel type: petrol");
	}
	
}
class Car extends Vehicle{
	int numOfDoors;
	boolean hasSunroof;
	
	public Car(String modelName, int vehicleNumber, String company, int numOfDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numOfDoors = numOfDoors;
		this.hasSunroof = hasSunroof;
	}
@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}

	
}
class Bike extends Vehicle{
	boolean hasSideCar;
	Bike(String modelName,int vehicleNumber,String company,boolean hasSideCar){
		super(modelName,vehicleNumber,company);
		this.hasSideCar=hasSideCar;
	}
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}
	
}
class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String modelName, int vehicleNumber, String company, int cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}
	public void fuelType() {
		System.out.println("fuel type: Diesel");
	}
}

public class VehicleManagementSystem {

	public static void main(String[] args) {
	Vehicle car=new Car("toyota",1234,"toyota",4,true);
	System.out.println("=============Car============");
	car.fuelType();
	car.startEngine();
	Vehicle bike=new Bike("yamaha R1",54321,"yamaha",false);
	System.out.println("=============Bike============");
	bike.fuelType();
	bike.startEngine();
	Vehicle truck=new Truck("volvo FH",6789,"volvo",20000);
	System.out.println("=============Truck============");
	truck.fuelType();
	truck.startEngine();

	}

}
