package com.college.model;

public class Person {
	private String name;
	private int age;
	private long contactNumber;
	public Person(String name,int age,long contactNumber) {
	
		this.name=name;
		this.age=age;
		this.contactNumber=contactNumber;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	//why packages are important?
	//to organize our java project
	//by importing packages we can reuse the code logic in other classes
	
	
	//why fields must be private and why we use getters and setter
	//ans) to provide security to the data
	//getters and setters methods are public by using these we can get and set the private variables
	
	//how student inherit properites from person?
	//student is child class and Person is Parent class
	//student extends the Person class to acquire the properites like name,age,contact number
	
	//why constructors are required to initialize objects?
	//constructors are used to initialize the objects
	//with constructors we can directly give the values to objects
	//there is default constructor. when object created it automatically initializes the object.

	
	//why business logic is written in a separate class
	//business logic class contains the logic  that logic can be used in any class
	//it does not have main method.
	//it provides reusability
	
	//why scanner is used instead of hard coded values?
	//with the scanner we can read the input from the user
	//with this we can provied different values at run time.
	
	

	
	//REFLECTION QUESTIONS:
	//1.What is encapsulation and where is it used in this assignment?
	//it binds the data into single unit
	//it has the private fields and provieds the public getters and setters methods to to access and modify the data
	//2. Why did we create a Person class as a parent class?
	//because person may be student or teacher both have same properties like name,age,contact number
	//so any class like student or teacher can extends the person class and acquires the properties.
	
	//3. How does inheritance reduce code duplication?
	//inheritance reduces the code duplication 
	//with this we don't need to write same methods and fields again and again because some classes have IS A relationship  like same behavior
	
	//4. Why should we not hard code values inside programs?
	//to read the input from the user 
	//every time values may be changed
	//there are number of students they have different data.
	
	
	//5.Why is project structure important in Java?
	//for readability purpose project structure is important.
	//it reduces the conflicts
	//it contains different packages 
	//packages contains the different classes.
	
	
	
}
