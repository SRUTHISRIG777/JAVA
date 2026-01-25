package com.task.inheritance;
import java.util.Scanner;
class Vehicle {
	String ownerName;
	String vehicleNumber;
	String vehicleType;
	Vehicle(String ownerName,String vehicleNumber,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleNumber=vehicleNumber;
		this.vehicleType=vehicleType;
	}
	
}
class ServiceVehicle extends Vehicle{
	String serviceCenterName;
	String category;
	ServiceVehicle(String ownerName,String vehicleNumber,String vehicleType,String serviceCenterName,String category){
		super(ownerName,vehicleNumber,vehicleType);
		this.serviceCenterName=serviceCenterName;
		this.category=category;
		System.out.println("vehicle profile has been created successfully");
	}
	public void updateServiceCategory(String cat) {
		if(cat==null||cat.equals("")) {
			System.out.println("please enter valid category");
		}
		else {
			this.category=cat;
		}
	}
	public void updateServiceCenterName(String service) {
		if(service==null||service.equals("")) {
			System.out.println("please enter valid service");
		}
		else {
			this.serviceCenterName=service;
		}
	}
	public void vehicleProfile() {
		System.out.println("owner name:"+this.ownerName);
		System.out.println("vehicle number:"+this.vehicleNumber);
		System.out.println("vehicle type:"+this.vehicleType);
		System.out.println("service center name:"+this.serviceCenterName);
		System.out.println("service category:"+this.category);
	}
	
}
public class VehicleOwnership {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter owner name:");
	String name=sc.nextLine();
	System.out.println("enter vehicle number:");
	String num=sc.nextLine();
	System.out.println("enter vehicle type:");
	String type=sc.nextLine();
	System.out.println("enter service center name:");
	String servicename=sc.nextLine();
	System.out.println("enter service category");
	String category=sc.nextLine();
	
	  ServiceVehicle s=new ServiceVehicle(name,num,type,servicename,category);
	  boolean a=true;
	  while(a) {
		  System.out.println("---------menu--------");
		  System.out.println("1.update service category");
		  System.out.println("2.update service center");
		  System.out.println("3.view profile");
		  System.out.println("4.exit");
		  System.out.println("select any option:");
		  int option=sc.nextInt();
		  sc.nextLine();
		  switch(option) {
		  case 1:
			  System.out.println("enter service category:");
			  String servicecategory=sc.nextLine();
			  s.updateServiceCategory(servicecategory);
			  break;
		  case 2:
			  System.out.println("enter service center to update:");
			  String center=sc.nextLine();
			  s.updateServiceCenterName(center);
			  break;
		  case 3:
			  System.out.println("vehicle details:");
			  s.vehicleProfile();
			  break;
		  case 4:
			  System.out.println("thank you");
			  a=false;
			  break;
		 default:
			 System.out.println("please enter valid option");
		  
			  
		  }
	  }
	  

	}

}
