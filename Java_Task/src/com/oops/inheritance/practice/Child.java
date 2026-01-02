package com.oops.inheritance.practice;

public class Child extends Parent {
	public void getData() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		//Child b=new Child();
//		   System.out.println(b.num);
//		   b.printData();
//		   b.getData();
			
//			Parent a=new Parent();
//		    System.out.println(a.num);
//		    a.printData();
		    //a.getData();==>error:with this reference we can not access child class properties into child class
		
			//Parent a=new Child();//we can store child class object into parent reference variable
			//System.out.println(a.num);//we can access parent class properties into child class
			//a.printData();
			//a.getData(); error:with this reference we can not access child class properties into child class
		
		//Child ch=new Parent();//we can not store parent class object into child class reference variable
		
		//Child ch=(Child) new Parent();//we can down cast to the parent object but we have to face the run time exception 
		Parent a=new Child();
		Child b=(Child) a;//no error
		System.out.println(b.num);
		b.printData();
		b.getData();
		
		//a.getData();//error
			

	}

}
