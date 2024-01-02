package Lastthred;

public class race {
	
	
	public int balance;
	
	
	public int getBalance() {
		delay();
		return balance;
		
	}public void setBalance(int b) {
		delay();
		
		this.balance=balance;
		
	}
	public void delay() {
		try {
			Thread.sleep(200);
		}catch(Exception e) {
			
		}
		
	}
	
	public  void deposit(String s,int a) {
	
		synchronized (this) {
		int b=getBalance()+a;
		setBalance(b);
		System.out.println(s+"new balance"+a);
	}
	}
}
