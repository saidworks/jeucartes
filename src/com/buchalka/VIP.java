package com.buchalka;

public class VIP {
	private String name;
	private double creditLimit;
	private String address;
	
	public VIP() {
		this("name",10000, "address");
	}
	public VIP(String name,double creditLimit) {
		this(name,creditLimit,"default address");
	}
	public VIP(String name,double creditLimit,String address) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.address = address;
	}
}
