package First.exception;

public class Arraysindex {
	
	public static void main(String[] args) {
		int[] a=new int[5];
		
		try {
			System.out.println(a[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		    e.printStackTrace();
		}
		
		finally {
			System.out.println("hmko rok kr dikhaao");
		}
	}

}
