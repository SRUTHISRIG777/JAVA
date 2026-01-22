package com.oops.all;
abstract class Employee{
	private String empId;
	private String name;
	
	Employee(String empId,String name){
		this.empId=empId;
		this.name=name;
	}
	
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmpId() {
		return this.empId;
	}
	public String getName() {
		return this.name;
	}
	
	
	
	abstract double calculateSalary();
	abstract void displayDetails();
	protected void printBasicInfo() {
		System.out.println("ID: "+getEmpId());
		System.out.println("name: "+getName());
		
	}
}
class FacultyMember extends Employee{
	private int departmentcode;
	private int yearsOfService;
	FacultyMember(String empId,String name,int departmentcode,int yearsOfService){
		super(empId,name);
		this.departmentcode=departmentcode;
		this.yearsOfService=yearsOfService;
		
	}
	public double calculateSalary() {
		double baseSal=50000;
		double expBonus=this.yearsOfService*1000;
		return baseSal+expBonus;
	}
	public void displayDetails() {
		System.out.println("employee details:");
		super.printBasicInfo();
		System.out.println("department code: "+this.departmentcode);
		System.out.println("years of service: "+this.yearsOfService);
		System.out.println("monthly salary: "+calculateSalary());
	}
	
	
}
class StaffMember extends Employee{
	private String designation;
	private double overtimeHours;
	StaffMember(String empId,String name,String designation,double overtimeHours){
		super(empId,name);
		this.designation=designation;
		this.overtimeHours=overtimeHours;
	}
	public double calculateSalary() {
		double baseSalary=40000;
		double overtimepay=this.overtimeHours*25;
		return baseSalary+overtimepay;
	}
	public void displayDetails() {
		System.out.println("employee details:");
		super.printBasicInfo();
		System.out.println("designation: "+this.designation);
		System.out.println("over time hours:"+this.overtimeHours);
		System.out.println("monthly salary: "+calculateSalary());
		
	}
	
}


public class UniversityManagementSystem {

	public static void main(String[] args) {
		Employee faculty=new FacultyMember("F001","Riya",101,5);
		faculty.displayDetails();
		
		Employee staff=new StaffMember("S001","Anshu","administrator",20);
		staff.displayDetails();
		
		

	}

}
