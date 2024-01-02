package Oops;

public class DeepTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Coustomerdeep c1=new Coustomerdeep("shailendra");
		Coustomerdeep c2=(Coustomerdeep) c1.clone();
		c2.name="kallu";
		c2.account.Balance=20;
		
		System.out.println(c1.name);
		System.out.println(c1.account.Balance);
		System.out.println(c1.hashCode());
		
		
		System.out.println(c2.name);
		System.out.println(c2.account.Balance);
		
		
		System.out.println(c1.hashCode());
	}

}
