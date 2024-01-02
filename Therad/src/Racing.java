
public class Racing {

	
	private int balance=0;

	public int getBalance() {
		Delay();
		return balance;
	}

	

	public void setBalance(int balance) {
		
		Delay();
		this.balance = balance;
	}
	
	public  void Depopsit(String s,int a) { 
		synchronized(this) {
		int b=getBalance()+a;
		setBalance(b);
		System.out.println(s+"new balance"+ b);
		}
	}
	
	private void Delay() {
	try {
		Thread.sleep(200);
		
	}catch(Exception e) {
		
	}
		
	}
	
}
