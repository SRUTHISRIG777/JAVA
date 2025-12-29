package com.task.student;

public class StudentResult {
	private String studentName;
	private int studentId;
	private String courseName;
	private double totalMarks;
	 public StudentResult(String studentName,int studentId,String courseName,double totalMarks) {
		 this.studentName=studentName;
		 this.studentId=studentId;
		 this.courseName=courseName;
		 this.totalMarks=totalMarks;
		 
	 }
	 public void addMarks(double marks) {
		 if(marks<=0) {
			 System.out.println("invalid marks enetered");
		 }
		 else {
		 totalMarks+=marks;
		 System.out.println("marks are updated successfully.");
		 System.out.println("updated marks: "+totalMarks);
		 }
		 
	 }
	 public void  calculateGrade() {
		 if(totalMarks==0) {
			 System.out.println("No marks available to calculate grade");
		 }
		 else {
			 if(totalMarks>=90) {
				 System.out.println("total marks :"+totalMarks);
				 System.out.println("obtained grade :"+'A');
			 }
			 else if(totalMarks>=80 && totalMarks<=89) {
				 System.out.println("total marks :"+totalMarks);
				 System.out.println("obtained grade :"+'B');
				 
			 }
			 else if(totalMarks>=70 && totalMarks<=79) {
				 System.out.println("total marks :"+totalMarks);
				 System.out.println("obtained grade :"+'C');
				 
			 }
			 else if(totalMarks>=60 && totalMarks<=69) {
				 System.out.println("total marks :"+totalMarks);
				 System.out.println("obtained grade :"+'D');
				 
			 }
			 else if(totalMarks<60) {
				 System.out.println("total marks :"+totalMarks);
				 System.out.println("fail");
				 
			 }
			 
			 
		 }
		 
	 }
	 public void viewTotalMarks() {
		 System.out.println("total marks: "+totalMarks);
	 }

}
