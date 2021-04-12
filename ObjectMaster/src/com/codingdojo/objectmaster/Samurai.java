package com.codingdojo.objectmaster;

public class Samurai extends Human {
	public static int numOfSamurai = 0;
	public Samurai() {
		super();
		numOfSamurai++;
		super.setHealth(200);
		
	}
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth() / 2);
	}
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
	}

}
