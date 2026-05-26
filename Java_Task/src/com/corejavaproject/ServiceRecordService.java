package com.corejavaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceRecordService implements Service {
/**
 * 
 * private int serviceId;
	private int vehicleId;
	private String problemDescription;
	private String serviceStatus;
	private String date;
 */
	Map<Integer,ServiceRecord> service=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	String fileName="service.txt";
	public ServiceRecordService() {
		loadServiceRecordsFromFile() ;
	}
	public void loadServiceRecordsFromFile() {

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

	            int serviceId =
	                    Integer.parseInt(data[0]);

	            int vehicleId =
	                    Integer.parseInt(data[1]);

	            String problem = data[2];

	            String status = data[3];

	            String date = data[4];

	            ServiceRecord s =
	                    new ServiceRecord(
	                            serviceId,
	                            vehicleId,
	                            problem,
	                            status,
	                            date);

	            service.put(serviceId, s);
	        }

	        br.close();
	    }

	    catch(Exception e) {

	        System.out.println("Error Loading File");
	    }
	}
	public void add() {
		try {
		System.out.println("enter service id:");
		int id=sc.nextInt();
		sc.nextLine();
		if(service.containsKey(id)) {
			System.out.println("service id already exists");
			return;
		}
		System.out.println("enter vehicle id:");
		int vid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter problem:");
		String problem=sc.nextLine();
		System.out.println("enter service status:");
		String status=sc.nextLine();
		System.out.println("enter date:");
		String date=sc.nextLine();
		ServiceRecord s=new ServiceRecord(id,vid,problem,status,date);
		service.put(id, s);
		saveServiceRecordsToFile();
		System.out.println("service added successfully.......");
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		
	}
    
    	public void saveServiceRecordsToFile() {

    	    try {

    	        FileWriter fw = new FileWriter(fileName);

    	        BufferedWriter bw = new BufferedWriter(fw);

    	        for(ServiceRecord s : service.values()) {

    	            String data =
    	                    s.getServiceId() + ","
    	                    + s.getVehicleId() + ","
    	                    + s.getProblemDescription() + ","
    	                    + s.getServiceStatus() + ","
    	                    + s.getDate();

    	            bw.write(data);

    	            bw.newLine();
    	        }

    	        bw.close();
    	    }

    	    catch(Exception e) {

    	        System.out.println("Error Saving File");
    	    }
    	}
		
	
	public void delete() {
		try {
    	System.out.println("enter service id to delete:");
    	int id=sc.nextInt();
    	if(service.containsKey(id)) {
    		service.remove(id);
    		saveServiceRecordsToFile();
    		
    		System.out.println("service record deleted successfully.....");
    	}
    	else {
    		System.out.println("service record not found....");
    	}
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		
	}
    public void update() {
    	try {
    	System.out.println("enter service id to update:");
    	int id=sc.nextInt();
    	sc.nextLine();
    	if(service.containsKey(id)) {
    		ServiceRecord s=service.get(id);
    		System.out.println("enter new problem description:");
    		String problem=sc.nextLine();
    		System.out.println("enter new status:");
    		String status=sc.nextLine();
    		System.out.println("enter new date:");
    		String date=sc.nextLine();
    		s.setDate(date);
    		s.setProblemDescription(problem);
    		s.setServiceStatus(status);
    		saveServiceRecordsToFile();
    		System.out.println("service record updated successfully......");
    	}
    	else {
    		System.out.println("service record  not found........");
    	}
    	}
    	catch(Exception e) {
    		System.out.println("invalid input");
    	}
	
    }
    public void view() {
    	try {
    	System.out.println("enter service id to view:");
//    	int id=sc.nextInt();
//    	sc.nextLine();
    	if(service.isEmpty()) {
    		System.out.println("service record is empty");
    		return;
    	}
    	for(ServiceRecord s:service.values()) {
    		System.out.println("-----------------------------");
    		System.out.println(s.displayServiceDetails());
    		
    	}
    	}
    	catch(Exception e) {
    		System.out.println("invlid input");
    	}
    	
	
    }
    public void search() {
    	
    	try {
     	System.out.println("enter service id to view:");
    	int id=sc.nextInt();
//    	sc.nextLine();
    	
    	if(service.containsKey(id)) {
    		System.out.println("service record found");
    		System.out.println(service.get(id).displayServiceDetails());
    	}
    	else {
    		System.out.println("not found.....");
    	}
    	}
    	catch(Exception e) {
    		System.out.println("invalid input");
    	}
	
    }
}
