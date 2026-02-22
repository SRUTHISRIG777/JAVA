package com.arrays.task5;

import java.util.Arrays;

class Patient{
	int patientId;
	String name;
	double[] testResults;
	public Patient(int patientId, String name, double[] testResults) {
		
		this.patientId = patientId;
		this.name = name;
		this.testResults = testResults;
	}
	public double getAverageResults() {
		double sum=0;
		for(double i:testResults) {
			sum+=i;
			
		}
		return sum/testResults.length;
	}
	public boolean hasCriticalValues() {
		for(double t:testResults) {
			if(t<50) {
				return true;
			}
		}
		return false;
	}
	
	public String displayPatientReport() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", testResults=" + Arrays.toString(testResults)
				+ "]";
	}
	
	
}

public class HospitalManagementSystem {

	public static void main(String[] args) {
		Patient p1=new Patient(701,"john",new double[] {40,50,67,89.6,32});
		Patient p2=new Patient(702,"james",new double[] {70,59,67,85,78});
		Patient p3=new Patient(703,"peter",new double[] {68,52,90,89.6,89});
		Patient p4=new Patient(704,"harry",new double[] {67,50,67,89.6,32});
		Patient p5=new Patient(705,"novah",new double[] {90,95,87,20,85});
		Patient[] p= {p1,p2,p3,p4,p5};
		for(Patient i:p) {
			if(i.hasCriticalValues()) {
				System.out.println(i.displayPatientReport());
			}
		}
		

	}

}
