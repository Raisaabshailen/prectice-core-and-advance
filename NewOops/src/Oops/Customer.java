package Oops;

public class Customer implements Cloneable {
	
	public String name;
	public Bankaccountdeep acccount;
	
	Bankaccountdeep b=new Bankaccountdeep(15000);

	public Customer(String n) {
		name=n;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c=(Customer) super.clone();
		c.acccount=(Bankaccountdeep) acccount.clone();
		return c;
		
	}
	
	

}
