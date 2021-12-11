package com.jeucartes;

import com.buchalka.Car;

public class Test {

	public static void main(String[] args) {
		Carte carte = new Carte();
		
		Carte terrain = new Terrain();
		
		Terrain ter = (Terrain) terrain;
		
		Carte cart = terrain;
		
		Double a = 2.9;
		
		int b = 1;
		
		a = (double) b;

		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
