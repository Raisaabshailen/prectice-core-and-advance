package Oops.in;

public class Testshel {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount b1=new BankAccount(10);
		BankAccount b2=(BankAccount) b1.clone();
		
		b2.Balance=20;
		
		System.out.println(b1.Balance);
		System.out.println(b2.Balance);
	}

}
