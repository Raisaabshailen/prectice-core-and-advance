package Lastthred;

public class Testracing extends Thread {

	public Testracing(String name) {
		super(name);
	}

	public static Racing r = new Racing();

	public void run() {
		for (int i = 1; i <= 5; i++) {
			r.Deposit(getName(), 1000);
		}
	}

	public static void main(String[] args) {

		Testracing t = new Testracing("shailendra");
		Testracing t1 = new Testracing("ramram");

		t.start();
		t1.start();

	}
}
