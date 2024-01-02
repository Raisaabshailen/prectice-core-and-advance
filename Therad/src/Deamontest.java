
public class Deamontest {

	
	public static void main(String[] args) {
		Demonthread t=new Demonthread();
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException x) {
			
		}
		
		System.out.println("main method se bahar");
		System.out.println("now jvm will exist");
	}
}
