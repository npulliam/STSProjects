package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human guile = new Human();
		Human zangief = new Human();
		guile.attack(zangief);
		zangief.displayStats();
		guile.attack(zangief);
		guile.displayStats();
		Ninja shinobi = new Ninja();
		Wizard hermione = new Wizard();
		Samurai tomCruise = new Samurai();
		tomCruise.deathBlow(guile);
		tomCruise.displayStats();
		guile.displayStats();
		hermione.heal(guile);
		guile.displayStats();
		tomCruise.deathBlow(zangief);
		shinobi.steal(tomCruise);
		hermione.fireball(tomCruise);
		tomCruise.displayStats();
		shinobi.displayStats();
	}

}
