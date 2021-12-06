package com.jeucartes;

public class Creature extends Carte{
	/*Les créatures possèdent un nom, 
	un nombre de points de dégâts et un nombre de points de vie.*/
	private String name;
	private int damage;
	private int life_points;
	public Creature(int cout, String name, int damage, int life_points) {
		super(cout);
		this.name = name;
		this.damage = damage;
		this.life_points = life_points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getLife_points() {
		return life_points;
	}
	public void setLife_points(int life_points) {
		this.life_points = life_points;
	}
	
	
}
