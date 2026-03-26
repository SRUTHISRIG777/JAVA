package com.test;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	private int studentId;
	private String studentName;
	private int[] marks=new int[3];

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int index,int value) {
		if(value<0||value>100) {
			throw new IllegalArgumentException("marks should between 0 and 100");
		}
		marks[index]=value;
	}
	public int calculateTotal() {
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		return sum;
	}
	public double calculateAverage() {
		return calculateTotal()/marks.length;
	}
	public void displayStudentDetails() {
		System.out.println("student name: "+studentName);
		System.out.println("student id: "+studentId);
		System.out.println("student marks: "+Arrays.toString(marks));
		System.out.println("total marks: "+calculateTotal());
		System.out.println("average: "+calculateAverage());
		
		
	}
	
}
interface EligibilityChecker{
	boolean checkEligibility(double avg);
}


public class Test2 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student [] students=new Student[3];
		try {
			EligibilityChecker check=avg-> {
				return avg>=40;
			};
		Predicate<Double> passCheck=avg-> avg>=35;
		Function<Double,Character> grades=avg->{
			if(avg>=75) {
				return 'A';
			}
			else if(avg>=60) {
				return 'B';
			}
			else if(avg>=50) {
				return 'C';
			}
			else {
				return 'D';
			}
		};
		Consumer<Student> display=student->{
			student.displayStudentDetails();
			if(passCheck.test(student.calculateAverage())) {
				System.out.println("RESULT: PASS");
			}
			else {
				System.out.println("RESULT: FAIL");
			}
			System.out.println("grade: "+grades.apply(student.calculateAverage()));
			System.out.println((check.checkEligibility(student.calculateAverage()))?"Eligibility: YES":"Eligibility: NO");
			
		};
	
		for(int i=0;i<3;i++) {
			students[i]=new Student();
			System.out.println("enter student-"+(i+1)+" id:");
			students[i].setStudentId(sc.nextInt());
			System.out.println("enter student"+(i+1)+" name:");
			students[i].setStudentName(sc.next());
			System.out.println("enter student"+(i+1)+ "marks:");
		
			for(int j=0;j<3;j++) {
				int marks=sc.nextInt();
				students[i].setMarks(j, marks);
				}
		}
		for(Student s:students) {
			display.accept(s);
			System.out.println();
		}
		}
		catch(InputMismatchException e) {
			System.out.println("please enter correct type of data");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
		}
		}


