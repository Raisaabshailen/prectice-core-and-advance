package last.oop;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Coustomer c=new Coustomer("shailendra");
		Coustomer c1=(Coustomer) c.clone();
		c1.name="kaal";
		c1.account.balance=500;
		
		
		System.out.println(c.name);
		System.out.println(c.account.balance);
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
	}

}
