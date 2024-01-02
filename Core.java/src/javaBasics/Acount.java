package javaBasics;

public class Acount {

	private double balance;

	public double getBalance() {
		delay();
		return balance;
	}

	private void setBalance(double bal) {
		delay();
		this.balance = bal;
	}

	public void deposit(String msg, double amt) {
		double bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + "=" + bal);
	}

	public void delay() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
