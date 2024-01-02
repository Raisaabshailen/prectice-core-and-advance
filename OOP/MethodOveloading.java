package com.oop;

public class MethodOveloading {
	
	public void show( int  num1) {
		
		System.out.println("number1:" +" "+ num1);
		
	}
	
	public void show(int num1, int num2) {
		
		System.out.println(num1+num2);
		System.out.println("number1:"+" "+ num1+" "+"number2:" +" "+ num2);
		
	}
	
	public static void main(String[] args) {
		
		MethodOveloading mo = new MethodOveloading();
		mo.show(5);
		mo.show(15, 65);
	
		
	}

}
