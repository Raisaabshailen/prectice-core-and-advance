package Thread.second;

public class Testracing extends Thread{
	
	public Testracing(String name) {
		super(name);
	}
	
	public static Racing r= new Racing();
	
	public void run() {
		
		for(int i=0; i<=5; i++) {
			r.Deposit(getName(), 1000);
		}
	}
	
	public static void main(String[] args) {
		Testracing t1=new Testracing("shailendra");
		Testracing t2=new Testracing("raisaab");
		t1.start();
		t2.start();
	}

}
