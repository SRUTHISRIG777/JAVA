//package com.collections.comparator;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student1{
//	int age;
//	String name;
//	public Student1(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Student [age=" + age + ", name=" + name + "]";
//	}
//	
//}
//class NameComparator implements Comparator<Student1>{
//	public int compare(Student1 s1,Student1 s2) {
//		return s1.name.compareTo(s2.name);
//	}
//	
//}
//class AgeComparator implements Comparator<Student1>{
//	public int compare(Student1 s1,Student1 s2) {
//		return s1.age-s2.age;
//	}
//	
//}
//public class Example2 {
//
//	public static void main(String[] args) {
//		ArrayList<Student1>s=new ArrayList<>();
//		s.add(new Student1(2,"sweety"));
//		s.add(new Student1(20,"sruthi"));
//		s.add(new Student1(5,"mahi"));
//		Collections.sort(s,new NameComparator());
//		System.out.println(s);
//		
//		Collections.sort(s,new AgeComparator());
//		System.out.println(s);
//		
//
//	}
//
//}
