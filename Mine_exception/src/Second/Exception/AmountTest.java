package Second.Exception;

public class AmountTest {
	
	public static void main(String[] args) {
		double balance=2000;
		
		
		try {
			if(balance<5000) {
				throw new Amount();
			}else {
				System.out.println("sufficient");
			}
		} catch (Amount e) {
			e.printStackTrace();
		}
	}

}
