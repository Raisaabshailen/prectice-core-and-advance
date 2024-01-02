package lastoop;

public class Deep {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Coustom c=new Coustom("shailendra");
	Coustom c1=(Coustom) c.clone();
	
	c1.account.balance=400;
	c1.name="bhaii";
	
	System.out.println(c.name);
	System.out.println(c.account.balance);
	System.out.println("deep");
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	}
}
