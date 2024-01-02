package Oops;

public class TestDeepcloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1=new Customer("shailendra");
		Customer c2=(Customer) c1.clone();
		
		c2.name="balram";
		c2.acccount.blance=20000;
		
		System.out.println(c1.name);
		System.out.println(c1.acccount.blance);
		
		
		
		System.out.println(c2.name);
		System.out.println(c2.acccount.blance);
	
	   
	   
	
	
	}

}
