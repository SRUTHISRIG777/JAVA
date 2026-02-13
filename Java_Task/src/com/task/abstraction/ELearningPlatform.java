package com.task.abstraction;

import java.util.HashMap;
import java.util.Map;

abstract class User{
	String name,email;
	
	
	public User(String name, String email) {
		
		this.name = name;
		this.email = email;
	}
	public abstract void accessDashboard();
	public void login() {
	   System.out.println("Login successful.");	
	}
	public void logOut() {
		System.out.println("Logout successful.");
	}
	public void updateProfile() {
		System.out.println("Profile updated successfully.");
	}
}
class Student extends User{
	String[] enrolledCourse;
	int[] grades;
	public Student(String name, String email, String[] enrolledCourse, int[] grades) {
		super(name, email);
		this.enrolledCourse = enrolledCourse;
		this.grades = grades;
	}
	public void accessDashboard() {
		System.out.println("student dashboard:");
		System.out.println("enrolled courses: ");
		for(String s:enrolledCourse) {
			System.out.println(s);
		}
		System.out.println("grades:");
		for(int g:grades) {
			System.out.println(g);
		}
	}
	
}
class Instructor extends User{
	String[] createdCourses;
	Map<String,String[]> studentSubmissions;
	public Instructor(String name, String email, String[] createdCourses, Map<String, String[]> studentSubmissions) {
		super(name, email);
		this.createdCourses = createdCourses;
		this.studentSubmissions = studentSubmissions;
	}
	public void accessDashboard() {
		System.out.println("instructor dashboard:");
		System.out.println("created courses:");
		for(String c: createdCourses) {
			System.out.println(c);
		}
		System.out.println("student submissions:");
		System.out.println(studentSubmissions);
	}
}

public class ELearningPlatform {

	public static void main(String[] args) {
		User u1=new Student("sruthi","sruthi@.com",new String[] {"maths","science"},new int[] {90,80});
		Map<String,String[]> sub=new HashMap<>();
		sub.put("maths 101",new String[] {"submission-1","submission-2"});
		User u2=new Instructor("mahi","mahi@.com",new String[] {"maths","social"},sub);
		//u2.accessDashboard();
		

	}

}
