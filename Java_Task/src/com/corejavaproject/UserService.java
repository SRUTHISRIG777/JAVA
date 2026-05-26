package com.corejavaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService implements Service {
	/**
	 * private int userId;
	private String userName;
	private String password;
	private String role;
	 */
	Map<Integer,User>users=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	String fileName="users.txt";
	public UserService() {
		loadUsersFromFile();
	}
	
	private void loadUsersFromFile() {
		try {
			File file=new File(fileName);
			if(!file.exists()) {
				return;
			}
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String[] data=line.split(",");
				int id=Integer.parseInt(data[0]);
				String name=data[1];
				String password=data[2];
				String role=data[3];
				User user=new User(id,name,password,role);
				users.put(id, user);
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println("error in loading file");
		}
		
		
	}

	public User login() {
		//sc.nextLine();
		System.out.println("enter user name:");
		String name=sc.nextLine();
		System.out.println("enter password:");
		String password=sc.nextLine();
		for(User u:users.values()) {
			if(u.getUserName().equals(name)&&u.getPassword().equals(password)) {
				System.out.println("login successful");
				return u;
			}
			
		}
		return null;
	}
	public void add() {
		try {
		System.out.println("enter user id");
		int id=sc.nextInt();
		sc.nextLine();
		if(users.containsKey(id)) {
			System.out.println("user already exists");
			return;
		}
		System.out.println("enter user name");
		String name=sc.nextLine();
		System.out.println(" enter password");
		String password=sc.nextLine();
		try {
			System.out.println("enter role");
			String role=sc.nextLine();
			if(!role.equalsIgnoreCase("admin")&&!role.equalsIgnoreCase("user")) {
				throw new Exception("role should be admin or user");
			}
			else {
			User u=new User(id,name,password,role);
			users.put(id, u);
			saveUsersToFile();
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		
		
		System.out.println("user created successfully..............");
		}
		catch(Exception e) {
			System.out.println("invalid input");
			sc.nextLine();
		}
		
			
		
		
		
	}
   private void saveUsersToFile() {
	try {
		FileWriter fw=new FileWriter(fileName);
		BufferedWriter bw=new BufferedWriter(fw);
		for(User u:users.values()) {
			String data=u.getUserId()+","+
		                u.getUserName()+","+
					    u.getPassword()+","+
		                u.getRole();
			bw.write(data);
			bw.newLine();
		}
		bw.close();
	}
	catch(Exception e) {
		System.out.println("error in file saving");
	}
		
	}

   public void delete() {
	   try {
	   System.out.println("enter user id to delete:");
	   int id=sc.nextInt();
	   
		if(users.containsKey(id)) {
			users.remove(id);
			saveUsersToFile();
			System.out.println("deleted successfully...........");
			return;
			
		}
		else {
			System.out.println("user not found......");
			return;
		}
	   }
	   catch(Exception e) {
		   System.out.println("invlid input");
		   sc.nextLine();
	   }
		
	}
   public void update() {
	   try {
	   System.out.println("enter user id to update:");
	   int id=sc.nextInt();
	   sc.nextLine();
	   if(users.containsKey(id)) {
		   User u=users.get(id);
		   System.out.println("enter new user name:");
		   String name=sc.nextLine();
		   System.out.println("enter new password:");
		   String password=sc.nextLine();
		   try {
		   System.out.println("enter new role:");
		   String role=sc.nextLine();
		   if(!role.equals("admin")&&!role.equals("user")) {
			   throw new Exception("invlid role");
		   }
		   else {
		   u.setRole(role);
		   }
		   }
		   catch(Exception e) {
			   System.out.println(e.getMessage());
			   sc.nextLine();
		   }
		   
		   u.setPassword(password);
		   
		   u.setUserName(name);
		   saveUsersToFile();
		   System.out.println("user updated successfully.....");
	   }
	   else {
		   System.out.println("user not found...........");
	   }
	   }
	   catch(Exception e) {
		   System.out.println("invlid input");
		   sc.nextLine();
	   }
	
   }
   public void view() {
	   if(users.isEmpty()) {
		   System.out.println("no users");
		   return;
	   }
	   for(User u:users.values()) {
		   System.out.println("------------------");
		   System.out.println(u.displayDetails());
	   }
	   
	
   }
   public void search() {
	   try {
	   System.out.println("enter user id to search:");
	   int id=sc.nextInt();
	   if(users.containsKey(id)) {
		   System.out.println("user found");
		   System.out.println(users.get(id).displayDetails());
	   }
	   else {
		   System.out.println("user not found");
	   }
	   }
	   catch(Exception e) {
		   System.out.println("invlid input");
		   sc.nextLine();
	   }
	   
	
   }

}
