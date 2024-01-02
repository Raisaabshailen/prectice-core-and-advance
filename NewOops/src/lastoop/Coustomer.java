package lastoop;

public class Coustomer implements Cloneable{
	
	public String name;
	public BankAccount account;
	
	public Coustomer(String name) {
		this.name=name;
		account=new BankAccount(300);
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustomer c=(Coustomer) super.clone();
		c.account=(BankAccount) account.clone();
		return c;
	}

}
