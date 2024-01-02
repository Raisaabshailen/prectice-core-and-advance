package lastoop;

public class TestDeep {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Coustomer c=new Coustomer("shailendra");
		Coustomer c1=(Coustomer) c.clone();
		
		c1.name="jay ho";
		c1.account.balance=300;
		
		System.out.println(c.name);
		System.out.println(c.account.balance);
		
		
		System.out.println("clone object");
		
		System.out.println(c1.name);
		
		System.out.println(c1.account.balance);
		
		System.out.println(c.equals(c1));
	}

}
