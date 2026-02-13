package com.task.abstraction;
abstract class GameCharacter{
	String name;
	int level;
	int healthPoints;
	
	public GameCharacter(String name, int level, int healthPoints) {
		super();
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}
	public abstract void attack();
	public void chooseTarget() {
		System.out.println("target selected");
	}
	public void animateAttack() {
		System.out.println("Attack animation played.");
	}
}
class Warrior extends GameCharacter{
	String weaponType;

	
	public Warrior(String name, int level, int healthPoints, String weaponType) {
		super(name, level, healthPoints);
		this.weaponType = weaponType;
	}
	public void attack() {
		System.out.println("Performing melee attack with Sword.");
	}

}
class Mage extends GameCharacter{
	String spellType;

	public Mage(String name, int level, int healthPoints, String spellType) {
		super(name, level, healthPoints);
		this.spellType = spellType;
	}

	public void attack() {
		System.out.println("casting spell: "+spellType);
	}
	
	
	
}
class Archer extends GameCharacter{
	String arrowType;

	public Archer(String name, int level, int healthPoints, String arrowType) {
		super(name, level, healthPoints);
		this.arrowType = arrowType;
	}
	public void attack() {
		System.out.println("shooting arrow: "+arrowType);
	}
}

public class GameCharacterAction {

	public static void main(String[] args) {
		GameCharacter g1=new Warrior("conan",5,100,"sword");
		GameCharacter g2=new Mage("gandalf",7,120,"fireball");
		GameCharacter g3=new Archer("Legolas",8,110,"elven arrow");
		System.out.println("==========warrior================");
         g1.attack();
         g1.chooseTarget();
         g1.animateAttack();
         System.out.println("==========Mage================");
         g2.attack();
         g2.chooseTarget();
         g2.animateAttack();
         System.out.println("==========Archer================");
         g3.attack();
         g3.chooseTarget();
         g3.animateAttack();
	}

}
