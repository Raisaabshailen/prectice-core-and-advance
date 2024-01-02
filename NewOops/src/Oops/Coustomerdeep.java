package Oops;

public class Coustomerdeep implements Cloneable {
public String name;
public BankAccount account;

public Coustomerdeep(String n) {
	name=n;
	
	account=new BankAccount(10);
}

@Override
protected Object clone() throws CloneNotSupportedException {
	Coustomerdeep c=(Coustomerdeep) super.clone();
	c.account=(BankAccount) account.clone();
	return c;
}


}
