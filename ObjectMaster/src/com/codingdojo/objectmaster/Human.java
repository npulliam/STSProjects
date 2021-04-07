package com.codingdojo.objectmaster;

public class Human {
	private int health;
	private int strength;
	private int intelligence;
	private int stealth;
	public Human() {
		this.setHealth(100);
		this.setStrength(3);
		this.setIntelligence(3);
		this.setStealth(3);
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	// other methods
	public void attack(Human target) {
		target.setHealth(target.getHealth()-this.getStrength());
	}
	public void displayStats() {
		System.out.println("Health: " + this.getHealth() + " Strength: " + this.getStrength() + " Stealth: " + this.getStealth() + " Intelligence: " + this.getIntelligence());
	}
}
