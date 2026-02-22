package com.arrays.task5;
class Course{
	String courseName;
	int[] marks;
	public Course(String courseName, int[] marks) {
		super();
		this.courseName = courseName;
		this.marks = marks;
	}
	public double getCourseAverage() {
		double sum=0;
		for(int i:marks) {
			sum+=i;
			
			
		}
		return sum/marks.length;
	}
	
}
class Student{
	int rollNo;
	String name;
	Course[] courses;
	public Student(int rollNo, String name, Course[] courses) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.courses = courses;
	}
	public double getOverallAverage() {
		double sum=0;
		for(Course c:courses) {
			sum+=c.getCourseAverage();
		}
		return sum/courses.length;
	}
	public void displayStudentPerformance() {
		System.out.println("student name: "+name);
		System.out.println("student performance: "+getOverallAverage());
	}
	
	
}

public class CollegeGradingSystem {

	public static void main(String[] args) {
		Course c1=new Course("java",new int[] {95,99,98,99});
		Course c2=new Course("python",new int[] {80,85,75,99});
		Course c3=new Course("cyber security",new int[] {90,95,98,99});
		Course[] c= {c1,c2,c3};
		Student s1=new Student(1,"sruthi",c);
		
		Course c4=new Course("java",new int[] {96,99,97,90});
		Course c5=new Course("python",new int[] {80,86,73,98});
		Course c6=new Course("cyber security",new int[] {96,88,97,99});
		Course[] course= {c4,c5,c6};
		Student s2=new Student(2,"maheedhar",course);
		
		Student[] s= {s1,s2};
		for(Student i:s) {
			System.out.println("========================");
			i.displayStudentPerformance();
		}
		
		
		
	

	}

}
