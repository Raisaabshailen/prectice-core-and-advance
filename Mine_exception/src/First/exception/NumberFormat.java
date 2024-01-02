package First.exception;

public class NumberFormat {

	
	 public static void main(String[] args) {
		String name="shailendra";
	try {	
		int a=Integer.parseInt(name);
		System.out.println(a);
	}catch (NumberFormatException e) {
		e.printStackTrace();
		
	}
}
	 }
