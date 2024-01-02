package lastoop;

public class Coustom implements Cloneable {
	
	public String name;
	public Bankacc account;
	
	public Coustom(String name) {
		this.name=name;
		account=new Bankacc(5000);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustom c=(Coustom) super.clone();
		c.account=(Bankacc) account.clone();
		return c;
	}

}
