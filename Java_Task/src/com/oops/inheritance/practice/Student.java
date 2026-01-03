package com.oops.inheritance.practice;

public class Student extends Person {
	int studentId;
	String course;
	double cgpa;
	
	
	public void setStudentDetails(int studentId,String course,double cgpa) {
	    this.studentId=studentId;
	    this.course=course;
	    this.cgpa=cgpa;
	
	}
	public void displayStudentData() {
		System.out.println("student id: "+studentId);
		System.out.println("course: "+course);
		System.out.println("cgpa: "+cgpa);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setStudentDetails(1, "cyber security",8.5);
		s.setPersonDetails("maheedhar",20,"male");
		System.out.println("student details:");
		s.displayPersonDetails();
		s.displayStudentData();
	}
	
	
	

}
