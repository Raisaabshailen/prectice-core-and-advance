package Oops;

public class BankAccount implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public double Balance=0;
	public BankAccount(double b) {
		Balance=b;
	}


}
