package Lastthred;

public class Racing {

	public int balance;

	public int getBalance() {

		Delay();
		return balance;
	}

	public void setBalance(int b) {
		Delay();
		this.balance = b;
	}

	private void Delay() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public synchronized void Deposit(String s, int a) {
		int b = getBalance() + a;
		setBalance(b);
		System.out.println(s + ":" + "new balance" + ":" + b);

	}

}
