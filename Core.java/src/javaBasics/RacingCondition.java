package javaBasics;

public class RacingCondition extends Thread {
	public static Acount a = new Acount();
	
	public RacingCondition(String name) {
		super(name);
	
	}
	public void run() {
		for(int i = 0; i <5; i++) {
			a.deposit(getName(), 1000);
		}
	}

}
