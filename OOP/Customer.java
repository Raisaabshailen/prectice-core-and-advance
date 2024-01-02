package com.oop;

public class Customer implements Cloneable {

	public String name = null;
	public BankAccount account = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(54000);

	}

	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Customer c1 = new Customer("Vishu");
		Customer c2 = (Customer) c1.clone();

		c2.name = "Vineet";
		c2.account.balance = 65000;
	 
		//original
		System.out.println("Name:"+ c1.name);
		System.out.println("Balance:"+ c1.account.balance);
		
		//AFTER CLONING
		System.out.println("Name:"+ c2.name);
		System.out.println("Balance:"+ c2.account.balance);

	}

}
