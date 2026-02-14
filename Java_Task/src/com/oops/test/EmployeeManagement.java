package com.oops.test;

import java.util.Arrays;
import java.util.Scanner;

class Employee{
	String empName;
	int empID;
	String department;
	public Employee(String empName, int empID, String department) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.department = department;
	}
	
	
}
class ProjectEmployee extends Employee{
	String projectName;
	String projectRole;
	int[] score=new int[3];
	public ProjectEmployee(String empName, int empID, String department, String projectName, String projectRole,
			int[] score) {
		super(empName, empID, department);
		this.projectName = projectName;
		this.projectRole = projectRole;
		this.score = score;
		System.out.println("employee profile is created successfully");
	}
	public void updateProjectRole(String projectRole) {
		if(projectRole==null||projectRole.equals(" ")) {
			System.out.println("please enter valid role");
		}
		else {
			this.projectRole=projectRole;
		}
	}
	public void updateProjectName(String projectName) {
		if(projectName==null||projectName.equals(" ")) {
			System.out.println("please enter valid project name");
		}
		else {
			this.projectName=projectName;
		}
	}
	public void viewEmployeeProfile() {
		System.out.println("name:"+empName);
		System.out.println("employee id:"+empID);
		System.out.println("department:"+department);
		System.out.println("project name:"+projectName);
		System.out.println("project role:"+projectRole);
		System.out.println("performance scores:"+(Arrays.toString(score)));
		
	}
	
	
}

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter employee name:");
		String name=sc.next();
		System.out.println("enter employee id:");
		int id=sc.nextInt();
		System.out.println("enter department:");
		String dep=sc.next();
		System.out.println("enter project name:");
		String proname=sc.next();
		System.out.println("enter projetc role:");
		String role=sc.next();
		System.out.println("enter 3 monthly performace scores:");
		int[] score=new int[3];
		for(int i=0;i<score.length;i++) {
			System.out.println("month-:"+(i+1));
			score[i]=sc.nextInt();
			
			
		}
		ProjectEmployee emp=new ProjectEmployee(name,id,dep,proname,role,score);
		boolean a=true;
		do {
			System.out.println("=========menu========");
			System.out.println("1.update project role");
			System.out.println("2.update project name");
			System.out.println("3.view employee profile");
			System.out.println("4.view average performance");
			System.out.println("5.exit");
			System.out.println("select any option");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter new role:");
				String newRole=sc.nextLine();
				emp.updateProjectRole(newRole);
				break;
			case 2:
				System.out.println("enter project name to update:");
				String projectName=sc.nextLine();
				emp.updateProjectName(projectName);
				break;
			case 3:
				emp.viewEmployeeProfile();
				break;
			case 4:
				System.out.println(Arrays.toString(score));
				break;
			case 5:
				System.out.println("thank you");
				a=false;
			default:
				System.out.println("please enter valid option");
			}
		}while(a);
		

	}

}
