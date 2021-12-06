package com.buchalka;

public class Car {
	public int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.contains("porche") || validModel.contains("holden")) {
			this.model = model;
		}
	}
	
	public String getModel() {
		return this.model;
	}
}
