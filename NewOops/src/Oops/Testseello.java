package Oops;

public class Testseello {
	
public static void main(String[] args) throws CloneNotSupportedException {
	BankAccount b1= new BankAccount(200);
	BankAccount b2=(BankAccount) b1.clone();
	
	b2.Balance=300;
	System.out.println(b2.Balance);
	System.out.println(b1.Balance);
	
	
}

}
