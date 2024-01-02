
public class Racing extends Thread {

	public static Account a = new Account();

	public Racing(String n) {
		super(n);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			a.deposit(1000, getName());

		}
	}

	public static void main(String[] args) {
		Racing r = new Racing("ram");
		Racing r1 = new Racing("shyam");
		r.start();
		r1.start();

	}
}
