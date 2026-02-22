package com.arrays.task4;

import java.util.Arrays;

class Employee{
	int empId;
	String empName;
	double[] monthlySalaries;
	public Employee(int empId, String empName, double[] monthlySalaries) {
		
		this.empId = empId;
		this.empName = empName;
		this.monthlySalaries = monthlySalaries;
	}
	public double calculateAnnualSalary() {
		double sum=0;
		for(double i:monthlySalaries) {
			sum+=i;
		}
		return sum;
	}
	
	public String displayDetails () {
		return "Employee [empId=" + empId + ", empName=" + empName + ", total salaries="
				+ calculateAnnualSalary() + "]";
	}
	
	
}

public class Main1 {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"sruthi",new double[] {2000,45678,123455,12344,2467,78900,12345,12234,1234,12456,8765,49595});
		Employee e2=new Employee(2,"mahi",new double[] {2000,45678,123455,12344,2467,78900,12345,12234,1234,12456,8765,49595});
		Employee e3=new Employee(3,"riya",new double[] {2000,45678,123455,12344,2467,78900,12345,12234,1234,12456,8765,49595});
		Employee[] emp= {e1,e2,e3};
		for(Employee e:emp) {
			System.out.println(e.displayDetails());
		}
	}

}
