package lastoop;

public class Shellotest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Bankaccount2 b1=new Bankaccount2(300);
		Bankaccount2 b2=(Bankaccount2) b1.clone();
		
		b2.balance=350;
		
		System.out.println(b1.balance);
		System.out.println(b2.balance);
	}

}
