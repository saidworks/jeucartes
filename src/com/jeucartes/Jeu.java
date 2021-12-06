package com.jeucartes;

import com.jeucartes.*;
import java.util.*;

public class Jeu {
	
	private static int cardNb = 10;
		
	/*  Créez de plus une classe Jeu pour représenter un jeu de cartes, c'est-à-dire une collection de telles cartes. 
	    Cette classe devra avoir une méthode permettant d'ajouter une carte au jeu.
		On supposera qu'un jeu comporte au plus 10 cartes. 
		Le jeu comportera également une méthode permettant de jouer une carte.
		Pour simplifier, on jouera les cartes dans l'ordre où elles sont stockées dans le jeu,
		et on mettra la carte jouée à null dans le jeu de cartes.
		Dans la méthode main, constituez un jeu contenant divers types de cartes et faites afficher le jeu grâce à une méthode afficher propre à cette classe.
		
		
		Exemple d'exécution du programme :
		
		On change de main
		
		Un nouveau terrain.
		
		Une nouvelle créature.
		
		Un sortilège de plus.
		
		Là, j'ai en stock :
		
		Un terrain bleu
		
		Une créature Golem 4/6
		
		Un sortilège Croissance Gigantesque
		
		Je joue une carte...
		
		La carte jouée est : */
		
		public static void main(String[] args) {
			//player 1
			Terrain t1 = new Terrain(); 
			Creature c1 = new Creature(10, "Gandolph", 1, 100);
			Sortilege s1 = new Sortilege(10, "Ultimate knife", "Attack");
			// Player 2
			Terrain t2 = new Terrain(); 
			Creature c2 = new Creature(10, "Golem", 1, 100);
			Sortilege s2 = new Sortilege(10, "Ultimate bite", "Attack");
			//blanc('B'), bleu ('b'), noir ('n'), rouge ('r') et vert ('v')
			Jeu game = new Jeu();
			game.joue(t1,t2,c1,c2,s1,s2);
			

		}
		
		public static void joue(Terrain t1,Terrain t2,Creature c1,Creature c2,Sortilege s1,Sortilege s2) {
			for(int i=0;i < cardNb;i++) {
				if( t1.getColor() == "vert" || t1.getColor() == "blanc") {
					c1.setDamage(100);
					c2.setDamage(0);
					System.out.println("Player 1 won used his " + s1.getName() + " "+ s1.getDescription());
					break;
				}
				else if(t2.getColor() == "rouge" || t2.getColor() == "noir"){
					c1.setDamage(0);
					c2.setDamage(100);
					System.out.println("Player 2 won used his " + s2.getName()+ " " + s2.getDescription());
					break;
				}
				else if((t2.getColor() == "rouge" || t2.getColor() == "noir") && ( t1.getColor() == "vert" || t1.getColor() == "blanc")) {
					c1.setDamage(50);
					c2.setDamage(50);
					System.out.println("Player 2's damage is : "+ c2.getDamage());
					System.out.println("Player 1's damage is : "+ c1.getDamage());
					System.out.println("it is a draw");
					break;

				}
				else {
					c1.setDamage(100);
					c2.setDamage(100);
					System.out.println("Player 2's damage is : "+ c2.getDamage());
					System.out.println("Player 1's damage is : "+ c1.getDamage());
					System.out.println("GAME OVER for both players");
					break;
				}
				
			}
		}
}
