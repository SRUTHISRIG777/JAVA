package com.task.inheritance1;
class Employee{
	String name;
	double baseSalary;
	public Employee(String name,double baseSalary) {
		this.name=name;
		this.baseSalary=baseSalary;
	}
	public double calculateAnnualSalary() {
//		double annualsal=this.baseSalary*12;
//		System.out.println("annual salary: "+annualsal);
		return this.baseSalary*12;
	}
}
class Manager extends Employee{
	int bonus;
	int numberOfEmployeesManaged;
	public Manager(String name,double baseSalary,int bonus,int numberOfEmployeesManaged ) {
		super(name,baseSalary);
		this.bonus=bonus;
		this.numberOfEmployeesManaged=numberOfEmployeesManaged;
	}
	public void calculateManagerSalary() {
		System.out.println("salary including bonus: "+(this.baseSalary+this.bonus));
	}
	
}
class Engineer extends Employee{
	int projectCount;
	public Engineer(String name,double baseSalary,int projectCount) {
		super(name,baseSalary);
		this.projectCount=projectCount;
	}
	public double calculateEngineerSalary() {
		return this.baseSalary*12;
	}
}
class SalesPerson extends Employee{
	double commissionRate;
	int totalSales;
	public SalesPerson(String name,double baseSalary,double commissionRate,int totalSales) {
		super(name,baseSalary);
		this.commissionRate=commissionRate;
		this.totalSales=totalSales;
	}
	public double calculateSalesPersonSalary() {
		return this.baseSalary*12;
	}
	
	
}


public class EmployeeHierarchy {

	public static void main(String[] args) {
		System.out.println("manager salary:");
		Employee manager=new Manager("john",50000,10000,5);
		System.out.println(manager.calculateAnnualSalary());
		Manager m=(Manager)manager;
		m.calculateManagerSalary();
		
		System.out.println("engineer salary:");
		Employee engineer=new Engineer("sruthi",70000,5);
		System.out.println(engineer.calculateAnnualSalary());
		Engineer eng=(Engineer)engineer;
		System.out.println(eng.calculateEngineerSalary());
		
		System.out.println("sales person salary:");
		Employee sales=new SalesPerson("mahee",80000,0.1,200000);
		System.out.println(sales.calculateAnnualSalary());
		SalesPerson s=(SalesPerson)sales;
		System.out.println(s.calculateSalesPersonSalary());

	}

}
