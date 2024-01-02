package lastoop;

public class Bankaccount2 implements Cloneable {
	public double balance;
	
	public Bankaccount2(double balance) {
		this.balance=balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
