package lastoop;

public class Bankk  implements Cloneable{
	
	public double balance;
	  public Bankk(double balance) {
		  this.balance=balance;
	  }
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
