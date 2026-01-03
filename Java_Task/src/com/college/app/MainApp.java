package com.college.app;
import java.util.Scanner;
import com.college.model.*;
import com.college.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter student name: ");
	  String name=sc.next();
	  System.out.println("enter student age:");
	  int age=sc.nextInt();
	  System.out.println("enter student contact number:");
	  long contact=sc.nextLong();
	  System.out.println("enter student id:");
	  int id=sc.nextInt();
	  System.out.println("enter department:");
	  String dep=sc.next();
	  System.out.println("enter course code: ");
	  int code=sc.nextInt();
	  System.out.println("enter course name: ");
	  String coursename=sc.next();
	  System.out.println("enter course fee: ");
	  double fee=sc.nextDouble();
	  System.out.println("enter discount:");
	  int dis=sc.nextInt();
	  
	  Student s=new Student(id,dep,coursename);
	  Person p=new Person(name,age,contact);
	  Course c=new Course(code,coursename,fee);
	  StudentService st=new StudentService();
	  s.displayStudentDetails(name, age, contact, id, dep, coursename);
	  System.out.println("original fee: "+c.getCourseFee());
	  System.out.println("discount applied: "+dis+"%");
	  st.calculateDiscountFee(dep,fee, dis);
	  
	 
	  

	}

}
