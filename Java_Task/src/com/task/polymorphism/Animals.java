package com.task.polymorphism;
class Animal{
	public void makeSound() {
		System.out.println("animal make sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("bark");
	}
}

public class Animals {

	public static void main(String[] args) {
		Animal a=new Dog();
		Animal a1=new Animal();
		a1.makeSound();
		//Dog d=new Dog();
	
		a.makeSound();
		

	}

}
