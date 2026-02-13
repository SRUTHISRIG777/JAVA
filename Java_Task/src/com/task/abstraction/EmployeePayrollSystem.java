package com.task.abstraction;
abstract class Employee{
	String empName;
	int id;
	Employee(String empName,int id){
		this.empName=empName;
		this.id=id;
	}
	public abstract void calculateSalary();
	public void applyLeave() {
		System.out.println("Leave applied successfully.");
	}
	public void getDetails() {
		System.out.println("employee name: "+empName);
		System.out.println("employee id: "+id);
		
	}
}
class FullTimeEmployee extends Employee{
	int basePay;
	int benifits;
	public FullTimeEmployee(String empName, int id, int basePay, int benifits) {
		super(empName, id);
		this.basePay = basePay;
		this.benifits = benifits;
	}
	public void calculateSalary() {
		System.out.println("calculating salary: "+(basePay+benifits));
	}
	
}
class PartTimeEmployee extends Employee{
	int hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String empName, int id, int hourlyRate, int hoursWorked) {
		super(empName, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public void calculateSalary() {
		System.out.println("calculating salary: "+(hourlyRate*hoursWorked));
	}
}
class FreeLancer extends Employee{
	int projectPayment;

	public FreeLancer(String empName, int id, int projectPayment) {
		super(empName, id);
		this.projectPayment = projectPayment;
	}
	public void calculateSalary() {
		System.out.println("calculating salary: "+projectPayment);
	}
}

public class EmployeePayrollSystem {

	public static void main(String[] args) {
		Employee e1=new FullTimeEmployee("sruthi",797,80000,10000);
		Employee e2=new PartTimeEmployee("maheedhar",123,20,15);
		Employee e3=new FreeLancer("riya",955,50000);
		System.out.println("==========fulltime employee=========");
		e1.getDetails();
		e1.calculateSalary();
		e1.applyLeave();
		
		System.out.println();
		System.out.println("==========parttime employee=========");
		e2.getDetails();
		e2.calculateSalary();
		e2.applyLeave();
		
		System.out.println();
		System.out.println("==========freelancer=========");
		e3.getDetails();
		e3.calculateSalary();
		e3.applyLeave();
		

	}

}
