package lastoop;

public class Testshello {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount b=new BankAccount(200);
		BankAccount b1=(BankAccount) b.clone();
		
		b1.balance=300;
		
		System.out.println(b.balance);
		System.out.println(b.hashCode());
		System.out.println(b1.balance);
		System.out.println(b1.hashCode());
		System.out.println(b.equals(b1));
	}

}
