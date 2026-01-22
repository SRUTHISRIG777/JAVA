package com.task.inheritance1;
 class Student{
	 String name;
	 String studentId;
	 Student(String name,String studentId){
		 this.name=name;
		 this.studentId=studentId;
	 }
	 public void displayStudentInfo() {
		 System.out.println("name: "+this.name);
		 System.out.println("student id :"+this.studentId);
	 }
 }
 class Undergraduate extends Student{
	 String major;
	 Undergraduate(String name,String studentId,String major){
		 super(name,studentId);
		 this.major=major;
	 }
	 public void displayUndergraduateInfo() {
		 System.out.println("major:"+this.major);
	 }
 }
 class Graduate extends Student{
	 String thesisTopic;
	 Graduate(String name,String studentId,String thesisTopic){
		 super(name,studentId);
		 this.thesisTopic=thesisTopic;
	 }
	 public void displayGraduateInfo() {
		 System.out.println("Thesis topic: "+this.thesisTopic);
	 }
 }
 class PhDStudent extends Student{
	 String researchArea;
	 PhDStudent(String name,String studentId,String researchArea){
		 super(name,studentId);
		 this.researchArea=researchArea;
	 }
	 public void displayPhDStudentInfo() {
		 System.out.println("reasearch area: "+this.researchArea);
	 }
 }
public class StudentHierarchy {

	public static void main(String[] args) {
		System.out.println("=========undergraduate==================");
       Student undergraduate =new Undergraduate("sruthi","U12345","CSE");
       undergraduate.displayStudentInfo();
       Undergraduate u=(Undergraduate)undergraduate;
       u.displayUndergraduateInfo();
       System.out.println("==============graduate===============");
       Student graduate=new Graduate("maheedhar","G6789","ML");
       graduate.displayStudentInfo();
       Graduate g=(Graduate)graduate;
       g.displayGraduateInfo();
       System.out.println("========phd student=========");
       Student phd=new PhDStudent("joshitha nehra","P11223","AI");
       phd.displayStudentInfo();
       PhDStudent p=(PhDStudent)phd;
       p.displayPhDStudentInfo();
       
	}

}
