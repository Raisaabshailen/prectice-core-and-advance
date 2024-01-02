package Oops;

public class Testbank {
	
	public static void main(String[] args) {
		BankAcc b=new BankAcc();
		Person p=new Person();
		
		p.setBlance(20000);
		p.setAmount(12000);
		
		System.out.println(p.Deposit());
		System.out.println(p.Withdrawl());
		System.out.println(p.Withdrawl());
		
		
	}

}
