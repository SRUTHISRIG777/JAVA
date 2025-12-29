package com.oops.inheritance;

public class Manager extends Employee{
	int bonus=20000;
	

	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println("employee salary: "+m.salary);
		System.out.println("bonus: "+m.bonus);
		System.out.println("total salary :"+(m.bonus+m.salary));
		

	}

}
