package lastoop;

public class LastTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cousto c=new Cousto("shailendra");
		Cousto c1=(Cousto) c.clone();
		
		c1.account.balance=600;
		c1.name="kaal";
		
		System.out.println(c.name);
		System.out.println(c.account.balance);
		System.out.println("deepclonning");
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
	}

}
