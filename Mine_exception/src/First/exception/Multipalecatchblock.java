package First.exception;

public class Multipalecatchblock {
	
	public static void main(String[] args) {
		String name=null;
		int a=30;
		int b=0;
		try {
			int c=a/b;
			
			
			System.out.println(name.length());
			System.out.println(name.charAt(3));
			System.out.println(c);
		}catch (NullPointerException e) {
			
			System.out.println("null waali aayi he");
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("lo String outof bound vali aayi he");
		}catch(ArithmeticException e) {
			System.out.println("arthmetic exception aayi he");
		}
		
		
		finally {
			System.out.println("ye to chalega");
		}
	}

}
