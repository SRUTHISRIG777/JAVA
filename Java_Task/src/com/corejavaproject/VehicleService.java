package com.corejavaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleService implements Service {
	ArrayList<Vehicle>vehicles=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	String fileName="vehicles.txt";
	

	   public VehicleService() {

	        loadVehiclesFromFile();
	    }
	private void loadVehiclesFromFile() {
		 try {

	            File file = new File(fileName);

	            // FILE NOT EXISTS
	            if(!file.exists()) {

	                return;
	            }

	            FileReader fr = new FileReader(file);

	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            while((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);

	                String name = data[1];

	                String type = data[2];
	                String number = data[3];

	                long contact = Integer.parseInt(data[4]);

	                Vehicle vehicle =
	                        new Vehicle(id, name, type,number,contact);

	                vehicles.add(vehicle);
	            }

	            br.close();
	        }

	        catch(Exception e) {

	            System.out.println("Error Loading Vehicles");
	        }
		
	}
	public void add() {
		try {
		System.out.println("enter vehicle id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter vehicle  name:");
		String name=sc.nextLine();
		System.out.println("enter vehicle type:");
		String type=sc.nextLine();
		System.out.println("enter vehicle number:");
		String vnumber=sc.nextLine();
		System.out.println("enter contact number:");
		long contact=sc.nextLong();
		sc.nextLine();
		Vehicle v=new Vehicle(id,name,type,vnumber,contact);
		vehicles.add(v);
		saveVehiclesToFile();
		}
		catch(Exception e) {
			System.out.println("invalid input");
			sc.nextLine();
		}
		
	}
    private void saveVehiclesToFile() {
    	 try {

             FileWriter fw = new FileWriter(fileName);

             BufferedWriter bw = new BufferedWriter(fw);

             for(Vehicle v : vehicles) {

                 String data =
                         v.getVehicleId() + ","
                         + v.getVehicleName() + ","
                         + v.getVehicleType();

                 bw.write(data);

                 bw.newLine();
             }

             bw.close();
         }

         catch(Exception e) {

             System.out.println("Error Saving Vehicles");
         }
		
	}
	public void delete() {
    	
    	System.out.println("enter vehicle id to delete:");
    	int id=sc.nextInt();
    	boolean found=false;
    	for(Vehicle v:vehicles) {
    		if(v.getVehicleId()==id) {
    			vehicles.remove(v);
    			saveVehiclesToFile();
    			System.out.println("vehicles deleted successfully....");
    			found=true;
    			break;
    			
    		}
    		
    	}
    	if(!found) {
    		System.out.println("vehicle not found");
    	}
	
    }
    public void update() {
    	try {
    	  System.out.println("enter vehicle id to update:");
    	  int id=sc.nextInt();
    	  sc.nextLine();
    	  boolean found=false;
    	  for(Vehicle v:vehicles) {
    		  if(v.getVehicleId()==id) {
    			  System.out.println("enter vehicle new  name:");
    				String name=sc.nextLine();
    				v.setVehicleName(name);
    				System.out.println("enter new vehicle type:");
    				String type=sc.nextLine();
    				v.setVehicleType(type);
    				System.out.println("enter new vehicle number:");
    				String vnumber=sc.nextLine();
    				v.setVehicleNumber(vnumber);
    				System.out.println("enter new contact number:");
    				long contact=sc.nextLong();
    				v.setContactNumber(contact);
    				//sc.nextLine();
    				saveVehiclesToFile();
    				System.out.println("vehicle updated successfully");
    				found=true;
    			  
    		  }
    	  }
    	  if(!found) {
    		  System.out.println("vehicle not found...........");
    	  }
    	}
    	catch(Exception e) {
    		System.out.println("invalid indput");
    	}
    	  
	
    }
    public void view() {
    	if(vehicles.isEmpty()) {
    		System.out.println("no vehicles found");
    	}
    	else {
    		for(Vehicle v:vehicles) {
    			System.out.println(v.displayVehicleDetails());
    		}
    	}
	
    }
    public void search() {
    	System.out.println("enter vehicle id to search");
    	int id=sc.nextInt();
    	boolean found=false;
    	for(Vehicle v:vehicles) {
    		if(v.getVehicleId()==id) {
    			System.out.println("vehicle found successfully.............");
    			System.out.println(v.displayVehicleDetails());
    			found=true;
    			
    		}
    	}
    	if(!found) {
    		System.out.println("vehicle not found...........");
    	}
    	
    }
}
