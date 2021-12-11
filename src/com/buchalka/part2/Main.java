package com.buchalka.part2;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("220","Dell","240",dimensions);
		Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		Monitor monitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

		PC thePC = new PC(theCase,monitor,motherboard);
		thePC.powerUp();
	}

}
