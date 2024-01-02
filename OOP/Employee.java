package com.oop;

public class Employee extends Personn {
	
	String designation = null;
	
	public Employee() {
	}
	
	public Employee ( String Firstname, String Lastname , String des) {
		super(Firstname , Lastname);
		designation=des;
		System.out.println("calling parent class constructor");
		}

	public static void main(String[] args) {
		 Employee E = new Employee("Vijay","Chauhan", "Devloper");
				 
	}
}
