package com.jeucartes;
import java.util.*;

public class Terrain extends Carte{
	private String color;
	
	private enum colors {
		blanc,
		bleu,
		noir,
		rouge,
		vert
	} 
	//blanc('B'), bleu ('b'), noir ('n'), rouge ('r') et vert ('v')
	public Terrain() {
		super(0);
		this.setColor();
	}
	
	public void setColor() {
		colors[] colorsValues = colors.values();
		int length = colorsValues.length;
		int randomIndex = new Random().nextInt(length);
		this.color = colorsValues[randomIndex].name();
	}
	
	public static void main(String[] args) {
		Terrain t = new Terrain();
		System.out.println(t.color);
	}

	public String getColor() {
		return this.color;
	}
	
	public void afficher() {
		System.out.println("lsjfdhjnfkl");
	}

	
}
