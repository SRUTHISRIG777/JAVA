package com.corejavaproject;

import java.util.Scanner;

public class VehicleServiceManagementSystem {

	public static void main(String[] args) {
		UserService uservice=new UserService();
		VehicleService v=new VehicleService();
		ServiceRecordService ss=new ServiceRecordService();
		AdminService ad=new AdminService(ss,v,uservice);
		Scanner sc=new Scanner(System.in);
		boolean status=true;
		do {
			try {
			System.out.println("====================vehicle service management system==========");
			System.out.println("1.register");
			System.out.println("2.login");
			System.out.println("3.exit");
			System.out.println("select option:");
			
			int option=sc.nextInt();
			
			
			switch(option) {
			case 1:uservice.add();
			break;
			case 2:
				User loggedInUser=uservice.login();
				if(loggedInUser!=null) {
					if(loggedInUser.getRole().equalsIgnoreCase("admin")) {
						boolean adminMenu=true;
					
					do {
						System.out.println("=========admin menu===========");
						System.out.println("1.view all users");
						System.out.println("2.view all vehicles");
						System.out.println("3.view all service records");
						System.out.println("4.delete user");
						System.out.println("5.update user");
						System.out.println("6.update service record");
						System.out.println("7.generate report");
						System.out.println("8.logout");
						System.out.println("select option:");
						int adminOption=sc.nextInt();
						switch(adminOption) {
						case 1:
							ad.viewAllUsers();
							
							break;
						case 2:
							ad.viewAllVehicles();
							break;
						case 3:
							ad.veiwAllServiceRecords();
							break;
						case 4:
							ad.deleteUser();
							break;
						case 5:
							ad.updateUser();
							break;
						case 6:
							ad.updateServiceRecord();
							break;
						case 7:
							ad.generateReport();
							break;
						case 8:
							adminMenu=false;
							break;
						default:
							System.out.println("invalid option");
							break;
						}
					
					}while(adminMenu);
					
				
					
				}
					else {
						boolean userMenu=true;
						do {
							try {
							System.out.println("===============user menu============");
							System.out.println("1.add vehilce");
							System.out.println("2.delete vehicle");
							System.out.println("3.search vehicle");
							System.out.println("4.veiw vehicles");
							System.out.println("5.update vehicle");
							System.out.println("6.add service record");
							System.out.println("7.view service records");
							System.out.println("8.search service record");
							System.out.println("9.logout");
							System.out.println("select option:");
							int userOption=sc.nextInt();
							switch(userOption) {
							case 1:
								v.add();
								break;
							case 2:
								v.delete();
								break;
							case 3:
								v.search();
								break;
							case 4:
								v.view();
								break;
							case 5:
								v.update();
								break;
							case 6:
								ss.add();
								break;
							case 7:
								ss.view();
								break;
							case 8:
								ss.search();
								break;
							case 9:
								userMenu=false;
								break;
							default:
								System.out.println("invalid option");
								break;
							}
							}
							catch(Exception e) {
								System.out.println("invlaid option");
							}
							
							
						}while(userMenu);
					}
			}
				else {
					System.out.println("invalid user name or password");
				}
				break;
			case 3:
				status=false;
				System.out.println("thank you.....");
				break;
			default:
				System.out.println("please select correct option");
		
		}
			
			}
			catch(Exception e) {
				System.out.println("invlaid option");
				sc.nextLine();
			}
			
		
		

		
	}while(status);
		
		
		
	

}
}
