package com.task.emp;

public class EmployeeProcessor {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee(1,"sruthi" ,100000,"SD", 4);
		System.out.println("employee ID: "+emp1.getEmpId());
		System.out.println("employee Name: "+emp1.getEmpName());
		System.out.println("employee salary: "+emp1.getEmpSalary());
		System.out.println("employee designation: "+emp1.getEmpDesg());
		System.out.println("employee Performance Rating: "+emp1.getPerformanceRating());
		emp1.promoteEmployee("SE");
		
		Employee emp2=new Employee();
		emp2.setEmpId(2);
		emp2.setEmpName("Maheedhar");
		emp2.setEmpSalary(30000);
		emp2.setEmpDesg("Associate Software");
		emp2.setPerformanceRating(3);
		System.out.println();
		System.out.println("===============employee-2========================");
		System.out.println("employee ID: "+emp2.getEmpId());
		System.out.println("employee Name: "+emp2.getEmpName());
		System.out.println("employee salary: "+emp2.getEmpSalary());
		System.out.println("employee designation: "+emp2.getEmpDesg());
		System.out.println("employee Performance Rating: "+emp2.getPerformanceRating());
		emp2.promoteEmployee("SE");
		
		Employee emp3=new Employee(3,"Riya");
		System.out.println();
		System.out.println("===============employee-3========================");
		System.out.println("employee ID: "+emp3.getEmpId());
		System.out.println("employee Name: "+emp3.getEmpName());
		System.out.println("employee salary: "+emp3.getEmpSalary());
		System.out.println("employee designation: "+emp3.getEmpDesg());
		System.out.println("employee Performance Rating: "+emp3.getPerformanceRating());
		emp2.promoteEmployee("SE");
		
		
		
		

	}

}
