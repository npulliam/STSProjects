package com.codingdojo.zookeeper;

public class Mammal {
	private int energy;
	public Mammal() {
		this.energy = 100;
	}
	// getters and setters
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	//other methods
	public int displayEnergy() {
		System.out.println("Energy: " + this.energy);
		return this.energy;
	}
}
