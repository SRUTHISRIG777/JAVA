package com.collections.arraylist.task;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("employee added successfully");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static boolean isDuplicate(ArrayList<Employee>list,int id) {
		boolean a=false;
		for(Employee l:list) {
			if(l.id==id) {
				a=true;
			}
			
		}
		return a;
	}
	
	
}

public class EmployeeManagementSystem {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee>emps=new ArrayList<>();
		boolean res=true;
		while(res) {
			
			System.out.println("1. Add Employee\r\n"
					+ "2. Display All Employees\r\n"
					+ "3. Find Highest Salary Employee\r\n"
					+ "4. Increase Salary by Percentage\r\n"
					+ "5. Exi");
			System.out.println("select any option:");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter id:");
				//int id=sc.nextInt();
//				for(int i=0;i<emps.size();i++) {
//					if(emps.get(i).id!=id) {
//						emps.get(i).setId(id);
//					}
//				
//				}
				int id=sc.nextInt();
				if(Employee.isDuplicate(emps,id)) {
					System.out.println("duplicate id");
					break;
					
					
					
				}
				
				
				System.out.println("enter name:");
				String name=sc.next();
				if(name==""||name.equals(" ")) {
					System.out.println("enter valid name");
					break;
				}
				System.out.println("enter salary:");
				double salary=sc.nextDouble();
				if(salary<0) {
					System.out.println("enter valid salary");
					break;
				}
				emps.add(new Employee(id,name,salary));
				break;
			case 2:
				for(int i=0;i<emps.size();i++) {
					System.out.println(emps.get(i));
				}
				break;
			case 3:
				double max=0;
				for(int i=0;i<emps.size();i++) {
					if(max<emps.get(i).salary) {
						max=emps.get(i).salary;
					}
				}
				System.out.println("max salary:"+max);
				break;
			case 4:
				System.out.println("enter percentage to increase salary");
				int per=sc.nextInt();
				for(int i=0;i<emps.size();i++) {
					double sal=emps.get(i).getSalary();
					emps.get(i).setSalary(sal+(sal*per)/100);
				}
				System.out.println("salary increased successfully");
				break;
			case 5:
				res=false;
				break;
			default:
				System.out.println("enter valid option");
			
				
				
				
			}
		}
	}

}
