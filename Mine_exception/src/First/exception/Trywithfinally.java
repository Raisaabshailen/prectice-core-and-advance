package First.exception;

public class Trywithfinally {
	
	public static void main(String[] args) {
		String name="shail";
		
		try {
			System.out.println(name.charAt(9));
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("ye chalaoo");
		}
	}

}
