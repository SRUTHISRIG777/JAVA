package com.oops.encapsulation.emp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter employee name: ");
	   String name=sc.next();
	   System.out.println("enter employee ID: ");
	   int id=sc.nextInt();
	   System.out.println("enter employee designation: ");
	   String desg=sc.next();
	   System.out.println("enter employee salary: ");
	   double salary=sc.nextDouble();
	   
	   Employee emp=new Employee(name,id,desg,salary);
	   
	   System.out.println("enter manager name: ");
	   String managerName=sc.next();
	   Manager mang=new Manager(managerName);
	   
	   mang.checkEmployeeDetails(emp);

	}

}
