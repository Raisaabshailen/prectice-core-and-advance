package lastoop;

public class Coustomer2 implements Cloneable {
	
	public String name;
	
	public Bankaccount2 account;
	
	public Coustomer2(String name) {
		this.name=name;
		account= new Bankaccount2(500);
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustomer2 c=(Coustomer2) super.clone();
		c.account=(Bankaccount2) account.clone();
		return c;
	}

}
