package com.oops.inheritance.practice;

public class Teacher extends Person {
	int teacherId;
	String subject;
	double salary;
	
	public void setTeacherDetails(int teacherId,String subject,double salary) {
		this.teacherId=teacherId;
		this.subject=subject;
		this.salary=salary;
	}
	
	
	public void displayTeacherDetails() {
		
		System.out.println("teacher id: "+teacherId);
		System.out.println("subject: "+subject);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setTeacherDetails(201, "cyber security", 50000);
		t.setPersonDetails("maha", 30, "female");
		System.out.println("Teacher details: ");
		t.displayPersonDetails();
		t.displayTeacherDetails();
		
	}

}
