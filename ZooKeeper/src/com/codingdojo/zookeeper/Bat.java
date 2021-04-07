package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super.setEnergy(300);
	}
	public void fly() {
		System.out.println("Skreeeee!!");
		super.setEnergy(super.getEnergy() - 50);
	}
	public void eatHumans() {
		super.setEnergy(super.getEnergy() + 25);
	}
	public void attackTown() {
		System.out.println("GRrrRBBRBbBRBBRBRRRrrrhahh");
		super.setEnergy(super.getEnergy()-100);
	}
}
