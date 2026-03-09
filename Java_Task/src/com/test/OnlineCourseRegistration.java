//package com.test;
//
//import java.util.Arrays;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//class Student{
//	private int studentId;
//	private String studentName;
//	private int[] marks=new int[3];
//	public Student(int studentId, String studentName, int[] marks) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.marks = marks;
//	}
//	public int getStudentId() {
//		
//		return studentId;
//	}
//	public void setStudentId(int studentId) {
//		
//		this.studentId = studentId;
//	}
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public int[] getMarks() {
//		return marks;
//	}
//	public void setMarks(int[] marks) {
//		this.marks = marks;
//	}
//	public  int calculateTotal() {
//		int sum=0;
//		for(int i=0;i<marks.length;i++) {
//			sum+=marks[i];
//		}
//		return sum;
//		
//	}
//	public double calculateAverage() {
//		return calculateTotal()/marks.length;
//	}
//	public void displayStudentDetails() {
//		System.out.println("student id: "+studentId);
//		System.out.println("student name: "+studentName);
//		System.out.println("marks: "+Arrays.toString(marks));
//		System.out.println("total: "+calculateTotal());
//		System.out.println("average: "+calculateAverage());
//		
//	}
//}
//interface EligibilityChecker{
//	boolean checkEligibility(double average);
//}
//
//public class OnlineCourseRegistration {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		try {
//			System.out.println("enter student-1 id:");
//			int id1=sc.nextInt();
//			System.out.println("enter student-1 name:");
//			String name1=sc.next();
//			
//			int[] marks1=new int[3];
//			System.out.println("enter marks:");
//			for(int i=0;i<marks1.length;i++) {
//
//				marks1[i]=sc.nextInt();
//				if(marks1[i]<=0||marks1[i]>100) {
//					throw new IllegalArgumentException("marks should be between 0 and 100");
//				}
//				
//				
//				
//			}
//			System.out.println("enter student-2 id:");
//			int id2=sc.nextInt();
//			System.out.println("enter student-2 name:");
//			String name2=sc.next();
//			
//			int[] marks2=new int[3];
//			System.out.println("enter marks:");
//			for(int i=0;i<marks2.length;i++) {
//
//				marks2[i]=sc.nextInt();
//				if(marks2[i]<=0||marks2[i]>100) {
//					throw new IllegalArgumentException("marks should be between 0 and 100");
//				}
//				
//				
//				
//			}
//			System.out.println("enter student-3 id:");
//			int id3=sc.nextInt();
//			System.out.println("enter student-3 name:");
//			String name3=sc.next();
//			
//			int[] marks3=new int[3];
//			System.out.println("enter marks:");
//			for(int i=0;i<marks3.length;i++) {
//
//				marks3[i]=sc.nextInt();
//				if(marks3[i]<=0||marks3[i]>100) {
//					throw new IllegalArgumentException("marks should be between 0 and 100");
//				}
//				
//				
//				
//			}
//			Student s1=new Student(id1,name1,marks1);
//			Student s2=new Student(id2,name2,marks2);
//			Student s3=new Student(id3,name2,marks3);
//			Student[] students= {s1,s2,s3};
//            for(Student s:students) {
//            	EligibilityChecker eligible=new EligibilityChecker() {
//    				public boolean checkEligibility(double avg) {
//    					avg=s.calculateAverage();
//    					return avg>=40;
//    				}
//    				
//    			};
//    			Predicate<Double> passCheck=avg->avg>=35;
//    			Function<Student,Character> grade=a->{
//    				if(a.calculateAverage()>=75) {
//    			
//    					return 'A';
//    				}
//    				else if(a.calculateAverage()>=60) {
//    				
//    					return 'B';
//    				}
//    				else if(a.calculateAverage()>=50) {
//    					
//    					return 'C';
//    				}
//
//    				else {
//    					return 'D';
//    				}
//    			};
//    			Consumer<Student>printDetails=b->{
//    				b.displayStudentDetails();
//    				if(passCheck.test(b.calculateAverage())) {
//    					System.out.println("Result:PASS ");
//    				}
//    				else {
//    					System.out.println("RESULT:FAIL");
//    				}
//    				System.out.println("grade: "+grade.apply(s));
//    				if(eligible.checkEligibility(s.calculateAverage())) {
//    					System.out.println("Eligibility: Eligible for certificate ");
//    				}
//    				else {
//    					System.out.println("Eligibility:not eligible for certificate ");
//    				}
//    				
//    				
//    				
//    			};
//    			
//    			printDetails.accept(s);
//				
//			}
//			
//			
//		}
//		catch(IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
//	
//		
//
//	}
//
//}
