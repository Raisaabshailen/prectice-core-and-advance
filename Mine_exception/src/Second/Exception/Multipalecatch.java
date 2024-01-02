package Second.Exception;

import First.exception.Arthmetic;

public class Multipalecatch {
	
	public static void main(String[] args) {
		 int a=20;
		 int b=0;
		 String name=null;
		 
		 
		 try {
			 int c=a/b;
			 System.out.println(c);
			 System.out.println(name.length());
			 System.out.println(name.charAt(2));
		 }catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			 System.exit(0);
		}catch (NullPointerException e) {
			System.out.println("nullpointer");
		}catch (IndexOutOfBoundsException e) {
		  System.out.println("le ye bhi");
		  System.exit(0);
		}
		 
		 finally {
			 System.out.println("me hu giyan");
		 }
	}

}
