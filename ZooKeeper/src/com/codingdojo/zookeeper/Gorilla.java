package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla threw something!");
		super.setEnergy(super.getEnergy() - 5);
	}
	public void eatBanana() {
		System.out.println("Gorilla eat banana, grow strong.");
		super.setEnergy(super.getEnergy() + 10);
	}
	public void climb() {
		System.out.println("Gorilla climb tree, see world.");
		super.setEnergy(super.getEnergy() - 10);
	}
}
