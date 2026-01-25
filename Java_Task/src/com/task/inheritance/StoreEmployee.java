package com.task.inheritance;

import java.util.Scanner;

class SalesEmployee{
	String empName;
	int empID;
	SalesEmployee(String empName,int empID){
		this.empName=empName;
		this.empID=empID;
	}
	
}
class PerformanceEmployee extends SalesEmployee{
	int totalSales;
	int salesEntries;
	double avgSales;
	String performanceGrade;
	public PerformanceEmployee(String empName, int empID, int totalSales, int salesEntries, double avgSales,
			String performanceGrade) {
		super(empName, empID);
		this.totalSales = totalSales;
		this.salesEntries = salesEntries;
		this.avgSales = avgSales;
		this.performanceGrade = performanceGrade;
		System.out.println("performance profile created");
	}
	public void addSales(double amount) {
		if(amount<=0) {
			System.out.println("invalid sales amount");
		}
		else {
			this.totalSales+=amount;
		}
	}
	public void recalculatePerformance() {
		avgSales=totalSales/2.0;
		 if (avgSales >= 15000) {
	            performanceGrade = "Excellent";
	        } else if (avgSales >= 10000) {
	            performanceGrade = "Good";
	        } else {
	            performanceGrade = "Average";
	        }
		
	}
	 public void viewSummary() {
	        
	        System.out.println("Performance Summary");
	        System.out.println("Employee: " + empName);
	        System.out.println("Employee ID: " + empID);
	        System.out.println("Total Sales: " + totalSales);
	        System.out.println("Average Sales: " + avgSales);
	        System.out.println("Performance Grade: " + performanceGrade);
	    }
	
	
	
}
public class StoreEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee name:");
		String name=sc.nextLine();
		System.out.println("enter emp id:");
		int id=sc.nextInt();
		PerformanceEmployee emp1=new PerformanceEmployee("sruthi",797,0,0,0,null);
		boolean a=true;
		while(a) {
			System.out.println("========menu========");
			System.out.println("1.add sales");
			System.out.println("2.recalculate result");
			System.out.println("3.view summary");
			System.out.println("4.exit");
			System.out.println("enter any option");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter sales amount:");
				double amount=sc.nextDouble();
				emp1.addSales(amount);
				break;
			case 2:
				emp1.recalculatePerformance();
				break;
			case 3:
				emp1.viewSummary();
				break;
			case 4:
				a=false;
				break;
			default:
				System.out.println("enter valid option");
			}
		}
		

	}

}
