package com.oops.encapsulation.emp;

public class Employee {
	private String empName;
	private int empId;
	private String empDesg;
	private double empSalary;
	
	public Employee(String empName,int empId,String empDesg,double empSalary) {
		this.empName=empName;
		this.empId=empId;
		this.empDesg=empDesg;
		this.empSalary=empSalary;
		System.out.println("employee object created successfully!");
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg=empDesg;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	

}
