
public class Account {

	int balance;

	public void deposit(int b, String msg) {
		synchronized (this) {
		int bal = b + getBalance();
		setBalance(bal);
		System.out.println(msg + "-" + balance);
		}
	}

	public int getBalance() {
        delay();
		return balance;
	}

	public void setBalance(int balance) {
		delay();
		this.balance = balance;
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
