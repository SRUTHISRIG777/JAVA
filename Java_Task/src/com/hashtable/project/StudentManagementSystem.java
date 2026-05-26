package com.hashtable.project;

import java.util.Hashtable;
import java.util.Scanner;

class Student{
	private int student_id;
	private String studentName;
	Student(){
		
	}
	public Student(int student_id, String studentName) {
		super();
		this.student_id = student_id;
		this.studentName = studentName;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String display() {
		return "Student [student_id=" + student_id + ", studentName=" + studentName + "]";
	}
	
	
}
class StudentService{
	Hashtable<Integer,String> student=new Hashtable<>();
	Student s;
	Scanner sc=new Scanner(System.in);
	public void addStudent() {
		try {
			System.out.println("enter student id:");
			int id=sc.nextInt();
			sc.nextLine();
			if(student.containsKey(id)) {
				throw new Exception("student already exists");
			}
			System.out.println("enter student name:");
			String name=sc.nextLine();
			if(name==null||name.equals(" ")) {
				throw new Exception("please enter valid name");
				
			}
			s=new Student();
			
//			s.setStudent_id(id);
//			s.setStudentName(name);
			student.put(id, name);
			System.out.println("student added successfully...");
			
		}
		catch(Exception e) {
			System.out.println("inavalid input");
			//System.out.println(e);
		}
		
	}
	public void displayStudent() {
		//System.out.println(student);
		if(student.isEmpty()) {
			System.out.println("student list is empty");
			return;
		}
		student.forEach((k,v)->System.out.println(k+":"+v));
	}
	public void searchStudent() {
		try {
			System.out.println("enter student id to search");
			int id=sc.nextInt();
			if(student.containsKey(id)) {
				System.out.println("student found souccessfully....");
				System.out.println("student details");
				System.out.println(id+":"+student.get(id));
			}
			else {
				System.out.println("student not found........");
			}
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
	}
	public void updateStudent() {
		try {
			System.out.println("enter student id to update");
			int id=sc.nextInt();
			sc.nextLine();
			if(student.containsKey(id)) {
				System.out.println("enter new student name:");
				String name=sc.nextLine();
				if(name==null||name.equals(" ")) {
					throw new Exception("please enter valid name");
					
				}
				student.put(id, name);
				System.out.println("student updated successfully...");
				
				//System.out.println(id+":"+student.get(id));
			}
			else {
				System.out.println("student not found........");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleteStudent() {
		try {
			System.out.println("enter student id to delete");
			int id=sc.nextInt();
			if(student.containsKey(id)) {
				student.remove(id);
				System.out.println("student deleted successfully....");
				
			}
			else {
				System.out.println("student not found........");
			}
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		
	}
	public void displayTotalNumberOfStudents() {
		System.out.println("total number of students :"+student.size());
	}
	
}

public class StudentManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService s=new StudentService();
		boolean status=true;
		do {
			System.out.println("1.add student");
			System.out.println("2.search student");
			System.out.println("3.update");
			System.out.println("4.remove ");
			System.out.println("5.display all student");
			System.out.println("6.display student details");
			System.out.println("7.exit");
			System.out.println("select option");
			int option=sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1:
				s.addStudent();
				break;
			case 2:
				s.searchStudent();
				break;
			case 3:
				s.updateStudent();
				break;
			case 4:
				s.deleteStudent();
				break;
			case 5:
				s.displayStudent();
				break;
			case 6:
				s.displayTotalNumberOfStudents();
				break;
			case 7:
				status=false;
				System.out.println("thank you........");
				break;
			default:
				System.out.println("enter valid option");
			}
		}while(status);
	
		
		

	}

}
