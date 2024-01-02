package Oops;

public class Bankaccountdeep implements Cloneable{
	
	public double blance;
	
	
	public Bankaccountdeep(double b) {
		blance=b;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

}
