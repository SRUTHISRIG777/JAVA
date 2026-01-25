package com.task.inheritance;

import java.util.Scanner;

class Staff{
	String staffName;
	int staffID;
	String baseShift;
	public Staff(String staffName, int staffID, String baseShift) {
	
		this.staffName = staffName;
		this.staffID = staffID;
		this.baseShift = baseShift;
	}
	
	
}
class DepartmentStaff extends Staff{
	
	String departmentName;
	String respLevel;
	public DepartmentStaff(String staffName, int staffID, String baseShift, String departmentName, String respLevel) {
		super(staffName, staffID, baseShift);
		this.departmentName = departmentName;
		this.respLevel = respLevel;
		System.out.println("staff profile has been created.");
	}
	public void updateREsponsibilityLevel(String resLevel) {
		if(resLevel==null||resLevel.equals("")) {
			System.out.println("please enter valid level");
		}
		else {
			this.respLevel=resLevel;
		}
		
	}
	public void updateDepartmentName(String depName) {
		if(depName==null||depName.equals("")) {
			System.out.println("please enter valid level");
		}
		else {
			this.departmentName=depName;
		}
		
	}
	public void viewProfile() {
		System.out.println("staff name:"+staffName);
		System.out.println("staffID:"+staffID);
		System.out.println("base shift:"+baseShift);
		System.out.println("department name:"+departmentName);
		System.out.println("responsibility level:"+respLevel);
		
	}

	
	
}

public class HotelManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter staff id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter department name:");
		String depname=sc.nextLine();
		System.out.println("enter responsibility level:");
		String res=sc.nextLine();
		System.out.println("enter shift:");
		String shift=sc.nextLine();
		DepartmentStaff d1=new DepartmentStaff(name,id,shift,depname,res);
		boolean a=true;
		while(a) {
			System.out.println("1.update responsibility");
			System.out.println("2.update department");
			System.out.println("3.view profile");
			System.out.println("4.exit");
			System.out.println("enter any option: ");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter responsibility level:");
				String level=sc.nextLine();
				d1.updateREsponsibilityLevel(level);
				break;
			case 2:
				System.out.println("enter department name:");
				String dpname=sc.nextLine();
				d1.updateDepartmentName(dpname);
				break;
			case 3:
				d1.viewProfile();
				break;
			case 4:
				a=false;
				System.out.println("thank you");
				break;
			default:
				System.out.println("enter valid option");
			}
			
		}
		

	}

}
