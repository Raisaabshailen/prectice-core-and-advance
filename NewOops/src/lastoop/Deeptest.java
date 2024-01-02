package lastoop;

public class Deeptest {
public static void main(String[] args) throws CloneNotSupportedException {
	Coustomer2 c=new Coustomer2("shailendra");
	Coustomer2 c1=(Coustomer2) c.clone();
	
	c1.name="kaal";
	c1.account.balance=560;
	
	System.out.println(c.name);
	System.out.println(c.account.balance);
	
	System.out.println("clone objects");
	
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
}
}
