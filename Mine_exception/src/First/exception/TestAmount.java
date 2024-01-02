package First.exception;

public class TestAmount  {
	
	 public static void main(String[] args) {
		double balance=1000;
		
		
		try {
			if(balance<3000) {
				throw new Amount("insufficient balance");
			}else {
				System.out.println("sufficient balance");
			}
		}catch (Exception a) {
			a.printStackTrace();
			//System.out.println(a.getMessage());
			System.exit(18);
		}
		
		finally {
			System.out.println("me hu sbka baap rok ke dikhaao");
		}
	}

}
