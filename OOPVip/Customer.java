package com.oopVip;

// Deep Cloning example

public class Customer implements Cloneable {

	public String name;
	public BankAccount account;
	
	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	Customer c = (Customer) super.clone();
	c.account = (BankAccount) account.clone();
	return c;
}
}
