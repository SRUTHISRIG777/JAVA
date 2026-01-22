package com.task.inheritance1;
class Animal{
	String name;
	String habitat;
	Animal(String name,String habitat){
		this.name=name;
		this.habitat=habitat;
	}
	public void displayHabitat() {
		System.out.println("habitat: "+this.habitat);
	}
}
class Mammal extends Animal{
	boolean isWarmBlooded;
	Mammal(String name,String habitat,boolean isWarmBlooded){
		super(name,habitat);
		this.isWarmBlooded=isWarmBlooded;
	}
	public void displayMammalInfo() {
		System.out.println("is warmblooded: "+this.isWarmBlooded);
	}
}
class Bird extends Animal{
	boolean canFly;
	Bird(String name,String habitat,boolean canFly){
		super(name,habitat);
		this.canFly=canFly;
	}
	public void displayBirdInfo() {
		System.out.println("can fly: "+this.canFly);
	}
}
class Reptile extends Animal{
	boolean isColdBlooded;
	Reptile(String name,String habitat,boolean isColdBlooded){
		super(name,habitat);
		this.isColdBlooded=isColdBlooded;
	}
	public void displayReptileInfo() {
		System.out.println("is cold blooded: "+this.isColdBlooded);
	}
}
public class AnimalHierarchy {

	public static void main(String[] args) {
		System.out.println("=============mammal===============");
	Animal mammal=new Mammal("lion","savannah",true);
	mammal.displayHabitat();
	Mammal m=(Mammal)mammal;
	m.displayMammalInfo();
	System.out.println("===========bird========================");
	Animal bird=new Bird("Eagle","forest",true);
	Bird b=(Bird)bird;
	bird.displayHabitat();
	b.displayBirdInfo();
	System.out.println("=======reptile================");
	Animal reptile=new Reptile("snake","desert",true);
	Reptile r=(Reptile)reptile;
	reptile.displayHabitat();
	r.displayReptileInfo();

	}

}
