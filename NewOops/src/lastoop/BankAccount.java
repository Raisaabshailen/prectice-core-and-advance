package lastoop;

public class BankAccount implements Cloneable {
	

	public double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
