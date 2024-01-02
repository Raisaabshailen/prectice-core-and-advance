
public class Testracing extends Thread {
	
	public String name;
	public Testracing(String name) {
		this.name=name;
	}
	
	public static Racing r=new Racing();
	
	public void run() {
		for(int i=0; i<5; i++) {
			r.Depopsit(name, 1000);
		
		}
	}
	public static void main(String[] args) {
		
		Testracing t1=new Testracing("shailendra");
				Testracing t2=new Testracing("shaile");
				
				t1.start();
				t2.start();
		
	}

}
