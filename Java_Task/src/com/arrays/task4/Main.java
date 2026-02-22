package com.arrays.task4;

class Student{
	int rollNumber;
	String name;
	int[] marks;
	public Student(int rollNumber, String name, int[] marks) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	public double calculateavg(int[] marks) {
		double sum=0;
		for(int i:marks) {
			sum+=i;
		}
		return (sum/marks.length);
	}
	public void displayDetails() {
		System.out.println("student name: "+name);
		System.out.println("roll number: "+rollNumber);
		System.out.println("marks average: "+calculateavg(marks));
	}
}
public class Main {
  public static void main(String[] args) {
	 Student st1=new Student(1,"sruthi",new int[] {99,91,98,95,99});
	 Student st2=new Student(2,"Riya",new int[] {100,92,93,95,99});
	 Student st3=new Student(3,"Joshitha",new int[] {96,99,92,95,93});
	 Student[] st= {st1,st2,st3};
	 for(Student s:st) {
		 System.out.println("==================");
		 s.displayDetails();
	}
}
}
