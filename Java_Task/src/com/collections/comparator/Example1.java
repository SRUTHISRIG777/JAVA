//package com.collections.comparator;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Student implements Comparable<Student>{
//	int age;
//
//	public Student(int age) {
//		super();
//		this.age = age;
//	}
//	public int compareTo(Student s) {
//		return this.age-s.age;
//	}
//	@Override
//	public String toString() {
//		return "Student [age=" + age + "]";
//	}
//	
//	
//}
//class AgeComparator implements Comparable<Student>{
//	public int compareTo(Student s) {
//		return ;
//	}
//}
//
//public class Example1 {
//
//	public static void main(String[] args) {
//		ArrayList<Student>s=new ArrayList<>();
//		s.add(new Student(22));
//		s.add(new Student(20));
//		s.add(new Student(4));
//		//System.out.println(compareTo(s));
//		Collections.sort(s);
//		System.out.println(s);
//		
//		
//
//	}
//
//}
