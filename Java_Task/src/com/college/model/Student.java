package com.college.model;

public class Student  extends Person{
	private int studentId;
	private String department;
	private String courseName;
	
	public Student(int studentId,String department,String courseName) {
	   
		this.studentId=studentId;
		this.department=department;
		this.courseName=courseName;
		
	}
	public Student() {
		
	}


	public int getStudentId() {
		return studentId;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	 public void displayStudentDetails(String name,int age,long contactNumber,int studentId,String department,String courseName){
		 
	 
		 System.out.println("student name: "+name);
		 System.out.println("age: "+age);
		 System.out.println("contact number: "+contactNumber);
		 System.out.println("student id: "+studentId);
		 System.out.println("department: "+department);
		 System.out.println("courseName: "+courseName);
	 }
	 
	

}
