package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		super.setHealth(50);
		super.setIntelligence(8);
	}
	public void heal(Human target) {
		target.setHealth(target.getHealth() + this.getIntelligence());
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth() - (this.getIntelligence() * 3));
	}
}
