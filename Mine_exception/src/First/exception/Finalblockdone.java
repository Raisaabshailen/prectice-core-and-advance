package First.exception;

public class Finalblockdone {
	
	public static void main(String[] args) {
		String name=null;
		
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(3));
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			
			System.exit(10);
		}
		finally {
			System.out.println("sanantani me hu");
		}
	}

}
