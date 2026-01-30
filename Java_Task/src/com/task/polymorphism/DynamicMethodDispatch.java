package com.task.polymorphism;
class Shape{
	public void draw() {
		System.out.println("drawing shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("drawing circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("drawing square");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Shape s1=new Circle();
		Shape s2=new Square();
		s1.draw();
		s2.draw();

	}

}
