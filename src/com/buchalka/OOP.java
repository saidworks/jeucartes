package com.buchalka;

public class OOP {
	public static void main(String[] args) {
	Car porche = new Car();
	Car holden = new Car();
	porche.setModel("Porche");
	
	System.out.println("Model is " + porche.getModel());
	
	Banking said = new Banking(111111,"Said ZITOUNI",000,"zitouni.sd@gmail.com","0655887814");
	
	said.deposit(1000);
	said.withdraw(10000);
	System.out.println(said.getEmail());
	System.out.println(said.getBalance());
	System.out.println(said.getName());
	Banking defaultValues = new Banking();
	Animal animal = new Animal("Animal",1,1,1,5);
	Dog yourki = new Dog( "Yourki", 0, 0, 0, 0, 0, 0, "cuir");
	animal.eat();
	yourki.eat();
	yourki.walk();
	}
	
	
	
}
