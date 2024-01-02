package last.oop;

public class Coustomer implements Cloneable {
  public String name;
  public Bankaccount account;
  
  public Coustomer(String name) {
	  this.name=name;
	  account=new Bankaccount(300.0);
	  
  }

@Override
protected Object clone() throws CloneNotSupportedException {
	Coustomer c=(Coustomer) super.clone();
	c.account=(Bankaccount) account.clone();
	return c;
}
}
