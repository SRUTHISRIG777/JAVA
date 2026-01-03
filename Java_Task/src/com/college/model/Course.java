package com.college.model;

public class Course {
	private int courseCode;
	private String courseTitle;
	private double courseFee;
	
	public Course(int courseCode,String courseTitle,double courseFee) {
		this.courseCode=courseCode;
		this.courseTitle=courseTitle;
		this.courseFee=courseFee;
	}
	public Course() {
		
	}

	public int getCourseCode() {
		return courseCode;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public double getCourseFee() {
		return this.courseFee;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	

}
