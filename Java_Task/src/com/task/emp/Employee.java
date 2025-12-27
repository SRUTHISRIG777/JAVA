package com.task.emp;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empDesg;
	private int performanceRating;
	
	//no Parameterized constructor
	public Employee() {}
	
	//Constructor overloading
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=20000;
		this.empDesg="SE";
		this.performanceRating=2;
		
	}
	
	
	//Parameterized constructor
	public Employee(int empId,String empName,double empSalary,String empDesg,int performanceRating) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDesg=empDesg;
		this.performanceRating=performanceRating;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public void promoteEmployee(String newDesignation) {
		if(performanceRating>=4) {
			empSalary+=(empSalary*20/100);
			empDesg=newDesignation;
			System.out.println("salary is hiked");
			System.out.println("updated salary :"+empSalary);
			System.out.println("new designation : "+empDesg);
		}
		else {
			System.out.println("no promotion");
		}
	}
	

}
