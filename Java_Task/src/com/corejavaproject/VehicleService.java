//package com.corejavaproject;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class VehicleService implements Service {
//	//ArrayList<Vehicle>vehicles=new ArrayList<>();
//	Map<Integer,Vehicle>vehicles=new HashMap<>();
//	Scanner sc=new Scanner(System.in);
//	String fileName="vehicles.txt";
//	
//
//	   public VehicleService() {
//
//	        loadVehiclesFromFile();
//	    }
//	private void loadVehiclesFromFile() {
////		 try {
////
////	            File file = new File(fileName);
////
////	           
////	            if(!file.exists()) {
////
////	                return;
////	            }
////
////	            FileReader fr = new FileReader(file);
////
////	            BufferedReader br = new BufferedReader(fr);
////
////	            String line;
////
////	            while((line = br.readLine()) != null) {
////
////	                String[] data = line.split(",");
////
////	                int id = Integer.parseInt(data[0]);
////
////	                String name = data[1];
////
////	                String type = data[2];
////	                String number = data[3];
////
////	                long contact = Integer.parseInt(data[4]);
////
////	                Vehicle vehicle =
////	                        new Vehicle(id, name, type,number,contact);
////
////	                vehicles.add(vehicle);
////	            }
////
////	            br.close();
////	        }
////
////	        catch(Exception e) {
////
////	            System.out.println("Error Loading Vehicles");
////	        }
////		
//	}
//	public void add() {
//		try {
//		System.out.println("enter vehicle id:");
//		int id=sc.nextInt();
//		//sc.nextLine();
//		if(vehicles.containsKey(id)) {
//			System.out.println("user already exist.....");
//			return ;
//		}
//		
//	
//		sc.nextLine();
//		System.out.println("enter vehicle  name:");
//		String name=sc.nextLine();
//		System.out.println("enter vehicle type:");
//		String type=sc.nextLine();
//		System.out.println("enter vehicle number:");
//		String vnumber=sc.nextLine();
//		System.out.println("enter contact number:");
//		long contact=sc.nextLong();
//		sc.nextLine();
//		Vehicle v=new Vehicle(id,name,type,vnumber,contact);
//		vehicles.put(id,v);
//		saveVehiclesToFile();
//		//System.out.println("vehicle added successfully..........");
//		}
//		catch(Exception e) {
//			System.out.println("invalid input");
//			sc.nextLine();
//		}
//		
//	}
//    private void saveVehiclesToFile() {
//    	 try {
//
//             FileWriter fw = new FileWriter(fileName);
//
//             BufferedWriter bw = new BufferedWriter(fw);
//
//             for(Vehicle v : vehicles.values()) {
//
//                 String data =
//                         v.getVehicleId() + ","
//                         + v.getVehicleName() + ","
//                         + v.getVehicleType();
//
//                 bw.write(data);
//
//                 bw.newLine();
//             }
//
//             bw.close();
//         }
//
//         catch(Exception e) {
//
//             System.out.println("Error Saving Vehicles");
//         }
//		
//	}
//	public void delete() {
//		try {
//    	
//    	System.out.println("enter vehicle id to delete:");
//    	int id=sc.nextInt();
//    	if(vehicles.containsKey(id)) {
//    		vehicles.remove(id);
//			saveVehiclesToFile();
//			System.out.println("vehicles deleted successfully....");
//			return;
//    	}else {
//    		System.out.println("user not found");
//    		return;
//    	}
//    		
//    	}catch(Exception e) {
//    		System.out.println(e.getMessage());
//    	}
////    	boolean found=false;
////    	for(Vehicle v:vehicles) {
////    		if(v.getVehicleId()==id) {
////    			
////    			found=true;
////    			break;
////    			
////    		}
////    		
////    	}
////    	if(!found) {
////    		System.out.println("vehicle not found");
////    	}
//	
//    }
//    public void update() {
////    	try {
////    	  System.out.println("enter vehicle id to update:");
////    	  int id=sc.nextInt();
////    	  sc.nextLine();
////    	  boolean found=false;
////    	  for(Vehicle v:vehicles) {
////    		  if(v.getVehicleId()==id) {
////    			  System.out.println("enter vehicle new  name:");
////    				String name=sc.nextLine();
////    				v.setVehicleName(name);
////    				System.out.println("enter new vehicle type:");
////    				String type=sc.nextLine();
////    				v.setVehicleType(type);
////    				System.out.println("enter new vehicle number:");
////    				String vnumber=sc.nextLine();
////    				v.setVehicleNumber(vnumber);
////    				System.out.println("enter new contact number:");
////    				long contact=sc.nextLong();
////    				v.setContactNumber(contact);
////    				//sc.nextLine();
////    				saveVehiclesToFile();
////    				System.out.println("vehicle updated successfully");
////    				found=true;
////    			  
////    		  }
////    	  }
////    	  if(!found) {
////    		  System.out.println("vehicle not found...........");
////    	  }
////    	}
////    	catch(Exception e) {
////    		System.out.println("invalid indput");
////    	}
//    	  
//	
//    }
//    public void view() {
////    	if(vehicles.isEmpty()) {
////    		System.out.println("no vehicles found");
////    	}
////    	else {
////    		for(Vehicle v:vehicles) {
////    			System.out.println(v.displayVehicleDetails());
////    		}
////    	}
//	
//    }
//    public void search() {
////    	System.out.println("enter vehicle id to search");
////    	int id=sc.nextInt();
////    	boolean found=false;
////    	for(Vehicle v:vehicles) {
////    		if(v.getVehicleId()==id) {
////    			System.out.println("vehicle found successfully.............");
////    			System.out.println(v.displayVehicleDetails());
////    			found=true;
////    			
////    		}
////    	}
////    	if(!found) {
////    		System.out.println("vehicle not found...........");
////    	}
////    	
//    }
//}

package com.corejavaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleService implements Service {

Map<Integer, Vehicle> vehicles = new HashMap<>();

Scanner sc = new Scanner(System.in);

String fileName = "vehicles.txt";

public VehicleService() {

    loadVehiclesFromFile();
}

private void loadVehiclesFromFile() {

    try {

        File file = new File(fileName);

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

            String vehicleNumber = data[3];

            long contact = Long.parseLong(data[4]);

            Vehicle v = new Vehicle(
                    id,
                    name,
                    type,
                    vehicleNumber,
                    contact);

            vehicles.put(id, v);
        }

        br.close();
    }
    catch(Exception e) {

        System.out.println("error loading vehicles");
    }
}

private void saveVehiclesToFile() {

    try {

        FileWriter fw = new FileWriter(fileName);

        BufferedWriter bw = new BufferedWriter(fw);

        for(Vehicle v : vehicles.values()) {

            String data =
                    v.getVehicleId() + "," +
                    v.getVehicleName() + "," +
                    v.getVehicleType() + "," +
                    v.getVehicleNumber() + "," +
                    v.getContactNumber();

            bw.write(data);

            bw.newLine();
        }

        bw.close();
    }
    catch(Exception e) {

        System.out.println("error saving vehicles");
    }
}

@Override
public void add() {

    try {

        System.out.println("enter vehicle id:");

        int id = sc.nextInt();

        if(vehicles.containsKey(id)) {

            System.out.println("vehicle already exists");

            return;
        }

        sc.nextLine();

        System.out.println("enter vehicle name:");

        String name = sc.nextLine();

        System.out.println("enter vehicle type:");

        String type = sc.nextLine();

        System.out.println("enter vehicle number:");

        String vehicleNumber = sc.nextLine();

        System.out.println("enter contact number:");

        long contact = sc.nextLong();

        Vehicle v = new Vehicle(
                id,
                name,
                type,
                vehicleNumber,
                contact);

        vehicles.put(id, v);

        saveVehiclesToFile();

       System.out.println("vehicle added successfully");
    }
    catch(Exception e) {

        System.out.println("invalid input");

        sc.nextLine();
    }
}

@Override
public void delete() {

    try {

        System.out.println("enter vehicle id to delete:");

        int id = sc.nextInt();

        if(vehicles.containsKey(id)) {

            vehicles.remove(id);

            saveVehiclesToFile();

            System.out.println("vehicle deleted successfully");
        }
        else {

            System.out.println("vehicle not found");
        }
    }
    catch(Exception e) {

        System.out.println("invalid input");

        sc.nextLine();
    }
}

@Override
public void update() {

    try {

        System.out.println("enter vehicle id to update:");

        int id = sc.nextInt();

        sc.nextLine();

        if(vehicles.containsKey(id)) {

            Vehicle v = vehicles.get(id);

            System.out.println("enter new vehicle name:");

            String name = sc.nextLine();

            System.out.println("enter new vehicle type:");

            String type = sc.nextLine();

            System.out.println("enter new vehicle number:");

            String vehicleNumber = sc.nextLine();

            System.out.println("enter new contact number:");

            long contact = sc.nextLong();

            v.setVehicleName(name);

            v.setVehicleType(type);

            v.setVehicleNumber(vehicleNumber);

            v.setContactNumber(contact);

            saveVehiclesToFile();

            System.out.println("vehicle updated successfully");
        }
        else {

            System.out.println("vehicle not found");
        }
    }
    catch(Exception e) {

        System.out.println("invalid input");

        sc.nextLine();
    }
}

@Override
public void view() {

    if(vehicles.isEmpty()) {

        System.out.println("no vehicles found");

        return;
    }

    for(Vehicle v : vehicles.values()) {

        System.out.println("----------------------");

        System.out.println(v.displayVehicleDetails());
    }
}

@Override
public void search() {

    try {

        System.out.println("enter vehicle id to search:");

        int id = sc.nextInt();

        if(vehicles.containsKey(id)) {

            System.out.println("vehicle found");

            System.out.println(
                    vehicles.get(id)
                            .displayVehicleDetails());
        }
        else {

            System.out.println("vehicle not found");
        }
    }
    catch(Exception e) {

        System.out.println("invalid input");

        sc.nextLine();
    }
}


}

