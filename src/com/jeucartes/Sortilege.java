package com.jeucartes;

public class Sortilege extends Carte {
	/*
	 * Les sortilèges possèdent un nom et une explication sous forme de texte.
	 */
	private String name;
	private String description;
	public Sortilege(int cout,String name, String description) {
		super(cout);
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
