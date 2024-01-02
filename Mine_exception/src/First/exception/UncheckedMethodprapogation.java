package First.exception;

public class UncheckedMethodprapogation {
	
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		System.out.println("dad vali");
		
		try {
			mom();
			
		}catch (Uncheck e) {
			System.out.println("Caught by dad , raised by son");
			System.out.println(e.getMessage());
		}
		
	}

	private static void mom() {
		System.out.println("mom chali");
		son();
		
	}

	private static void son() {
		Uncheck u = new Uncheck();
		throw u;
		
	}

}
