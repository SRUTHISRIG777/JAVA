package com.oops.encapsulation.emp;

public class Manager {
	private String managerName;
	public Manager(String managerName) {
		this.managerName=managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName=managerName;
	}
	public String getManagerName() {
		return managerName;
	}
	
	public void checkEmployeeDetails(Employee emp) {
		System.out.println("Employee details: ");
		System.out.println("employee name: "+emp.getEmpName());
		System.out.println("employee id: "+emp.getEmpId());
		System.out.println("employee desg: "+emp.getEmpDesg());
		System.out.println("employee salary: "+emp.getEmpSalary());
		
		double salary=emp.getEmpSalary();
		if(salary>10000&&salary<=30000) {
			emp.setEmpSalary(salary+(salary*0.15));
		}
		else if(salary > 30000 && salary<=40000) {
			emp.setEmpSalary(salary+(salary*0.10));
		}
		else if(salary >40000) {
			emp.setEmpSalary(salary+(salary*0.05));
		}
		else {
			System.out.println("no increment in salary.");
			return;
		}
		System.out.println("updated  salary :"+emp.getEmpSalary());
	}

}
