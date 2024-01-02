package Thread.second;

public class Racing {
	
	public int balance;
	
	public int getBalance() {
		
		return balance;
	}
	
	
	

	public void setBalance(int b) {
		
		this.balance=b;
	}

	
	public  void Deposit(String s,int a) {
		int b=getBalance()+a;
		setBalance(b);
		System.out.println(s+"new balance"+b);
	}
}
