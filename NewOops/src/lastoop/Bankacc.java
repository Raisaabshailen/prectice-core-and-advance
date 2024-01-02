package lastoop;

public class Bankacc implements Cloneable{
	
	public double balance;
	public Bankacc(double balance) {
		this.balance=balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
