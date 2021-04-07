package com.codingdojo.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		super.setStealth(10);
	}
	public void steal(Human target) {
		int healthStolen = this.getStealth();
		target.setHealth(target.getHealth() - healthStolen);
		this.setHealth(this.getHealth() + healthStolen);
	}
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}
	
}
