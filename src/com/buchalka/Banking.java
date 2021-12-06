package com.buchalka;

public class Banking {
	private int accountNumber;
	private String name;
	private double balance;
	private String email;
	private String phoneNumber;
	
	public Banking() {
		this(222222,"Default Name",0000000.000,"email@email.com","0655555555");
		System.out.println("default class values");
	}
	
	public Banking(int accountNumber,String name,double balance,String email,String phoneNumber) {
		System.out.println("Empty Constructor");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void setAccountNumber(int account_number) {
		this.accountNumber = account_number;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void deposit(double sum) {
		this.balance += sum;
	}
	public void withdraw(double sum) {
		if(this.balance >= sum){
			this.balance -= sum;
		}
		else {
			System.out.println("vous avez une solde insuffisante");
		}
	}
	
}
