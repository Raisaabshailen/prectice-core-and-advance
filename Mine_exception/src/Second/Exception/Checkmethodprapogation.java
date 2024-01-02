package Second.Exception;

public class Checkmethodprapogation {
	
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		try {
			mom();
		}catch(Check e) {
			System.out.println("sorry sorry");
			e.printStackTrace();
		}
		
	}

	private static void mom() throws Check {
		son();
		
	}

	private static void son() throws Check {
		Check c=new Check();
		throw c;
		
	}

}
