package com.task.inheritance1;
class Shape{
	public double calculateArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public  double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculateCircleArea() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public  double calculateArea() {
		return length*width;
	}
	public double calculateRectangleArea() {
		return length*width;
	}
	
}
class Triangle extends Shape{
	double base;
	double height;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	public  double calculateArea() {
		return 0.5*base*height;
	}
	public  double calculateTriangleArea() {
		return 0.5*base*height;
	}
}

public class ShapeHierarchy {

	public static void main(String[] args) {
		System.out.println("============circle==============");
		Shape circle=new Circle(5);
		System.out.println(circle.calculateArea());
		Circle c=(Circle)circle;
		System.out.println(c.calculateCircleArea());
		System.out.println("=======================rectangle=========================");
		Shape rectangle=new Rectangle(4,6);
		System.out.println(rectangle.calculateArea());
		Rectangle rec=(Rectangle)rectangle;
		System.out.println(rec.calculateRectangleArea());
		System.out.println("=======================triangle================");
		Shape triangle=new Triangle(3,7);
		System.out.println(triangle.calculateArea());
		Triangle tri=(Triangle)triangle;
		System.out.println(tri.calculateTriangleArea());

	}

}
