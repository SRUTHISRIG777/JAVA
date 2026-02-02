package com.oops.abstraction;
abstract class Shape{
	public abstract void area();
 }
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public void area() {
		System.out.println("area of circle: "+(Math.PI)*radius*radius);
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	@Override
	public void area() {
		System.out.println("area of recatangle: "+(length*width));
		}
	}
public class Example1 {

	public static void main(String[] args) {
		Shape s1=new Circle(10);
		Shape s2=new Rectangle(10,20);
		s1.area();
	    s2.area();

	}

}
