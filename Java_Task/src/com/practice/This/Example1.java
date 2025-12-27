package com.practice.This;

class Student {
    private String name;
    private int age;
    
    public void setStudentData(String name, int age) {
        this.name = name; 
        this.age = age;   
    }
    public String getStudentData() {
        return "Student Name: " + this.name + ", Student Age: " + this.age;
    }

    public void showData() {
        System.out.println(getStudentData());
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Example1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentData("Maheedhar", 20);
        student1.showData();
    }
}
