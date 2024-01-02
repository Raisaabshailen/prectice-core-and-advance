package First.exception;

public class CheckedExceptionprapogation {
	
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		try {
			mom();
		}catch (Check e) {
			System.out.println("Caught by dad , raised by son");
			System.out.println(e.getMessage());
		}
		
	}

	private static void mom()throws Check {
		son();
		
	}

	private static void son()throws Check {
		Check c=new Check();
		throw c;
		
		
	}

}
