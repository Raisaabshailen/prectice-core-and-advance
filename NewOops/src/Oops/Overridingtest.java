package Oops;

public class Overridingtest extends Overridingex {
	@Override
	public void sum(int a,int b) {
		System.out.println(a+b);
		
		
		
	}
	
	public static void main(String[] args) {
		Overridingtest o=new Overridingtest() ;
		
		o.sum(20, 30);
			
		
	}

}
