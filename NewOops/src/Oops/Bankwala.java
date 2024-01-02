package Oops;

public class Bankwala {
	
	public double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double b) {
		this.balance=b;
	}
	public void Deposit(double amount) {
		balance=amount+balance;
		System.out.println(balance);
	}
	
	public void Withdrawl(double amount) {
		if(balance>2000) {
			balance=balance-amount;
			System.out.println(balance);
		}else {
			System.out.println("nanga");
		}
	}
}
