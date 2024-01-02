package lastoop;

public class Cousto implements Cloneable {
  public String name;
  public Bankk account;
  public Cousto(String n) {
	  this.name=n;
	  account=new Bankk(300); 
	  
  }
@Override
protected Object clone() throws CloneNotSupportedException {
	Cousto c=(Cousto) super.clone();
	c.account=(Bankk) account.clone();
	return c;
}
}
