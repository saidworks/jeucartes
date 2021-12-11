package com.buchalka.part2;

public class Car extends Vehicle{
	private int doors;
	private int engineCapacity;
	
	public Car(){
	}
	
	public Car(String name,int doors,int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}
}
