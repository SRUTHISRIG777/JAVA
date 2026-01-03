package com.oops.inheritance.practice;

public class Person {
	String name;
	int age;
	String gender;
	
	
	public void setPersonDetails(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void displayPersonDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
	}

}
