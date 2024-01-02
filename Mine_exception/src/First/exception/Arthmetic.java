package First.exception;

public class Arthmetic {
	
	public static void main(String[] args) {
		int a=20;
		int b= 0;
		try {
		int c=a/b;
		System.out.println(c);
		
		
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("ram");
			
		}
		}

}
