package com.task.polymorphism;
class Person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class Student extends Person{
	public void display() {
		System.out.println("I am a student");
	}
}

public class OverrideingWithAM {

	public static void main(String[] args) {
		Person p1=new Student();
		p1.display();

	}

}
