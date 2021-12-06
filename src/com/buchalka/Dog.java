package com.buchalka;

public class Dog extends Animal {
	private int teeth;
	private int legs;
	private int tail;
	private int eyes;
	private String coat;
	
	public Dog(String name, int size, int weight, int teeth,int legs, int eyes, int tail, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.tail = tail;
		this.legs = legs;
		this.teeth = teeth;
		this.coat = coat;
	}
	private void chew() {
		System.out.println("Dog.chew() is called");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog.chew()");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk()");
		move(15,3);
	}
	public void run() {
		System.out.println("Dog.run()");
	}
	
	
}
