package Second.Exception;

public class Uncheckexception {
	
	public static void main(String[] args) {
		dad();
		
	}

	private static void dad() {
		try {
			mom();
		}catch(RuntimeException e) {
			System.out.println("sorry sorry sorry");
		}
		
	}

	private static void mom() {
		son();
		
	}

	private static void son() {
		RuntimeException r=new RuntimeException();
		throw r;
		
	}

}
