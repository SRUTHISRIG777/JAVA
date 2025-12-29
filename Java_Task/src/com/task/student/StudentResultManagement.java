package com.task.student;
import java.util.Scanner;
public class StudentResultManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name: ");
		String name=sc.next();
		System.out.println("enter student id: ");
		int id=sc.nextInt();
		System.out.println("enter course name: ");
		String courseName=sc.next();
		System.out.println("enter first subject marks: ");
		double marks=sc.nextDouble();
		
		
		StudentResult s1=new StudentResult(name,id,courseName,marks);
		System.out.println("student records created successfully.");
		while(true) {
			System.out.println();
			System.out.println("1.add more subject marks");
			System.out.println("2.calculate grade");
			System.out.println("3.view total marks");
			System.out.println("4.exit");
			System.out.println("enter any options [1-4]");
			int option=sc.nextInt();
			if(option==4) {
				System.out.println("thank you! result processing completed");

				break;
			}
			System.out.println();
			switch(option) {
			case 1:
				System.out.println("enter marks to add");
				double mar=sc.nextDouble();
				s1.addMarks(mar);
				break;
			case 2:
				s1.calculateGrade();
				break;
			case 3:
				s1.viewTotalMarks();
				break;
			default:
				System.out.println("please enter valid option");
			
			}
		}
		sc.close();

	}

}
