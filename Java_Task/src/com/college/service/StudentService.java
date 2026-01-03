package com.college.service;
//import com.college.model.Course;
import  com.college.model.Student;

public class StudentService extends Student  {
	
	public StudentService() {
	}

	public void calculateDiscountFee(String dep,double fee,double discountPercent) {
		
		if(dep.equals("IT")) {
			
			fee=fee-(fee*(discountPercent/100));
			System.out.println(fee);
			
			
		}
		else {
			System.out.println("no discount");
			
		}
	}

}
