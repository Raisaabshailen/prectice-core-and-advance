package Lastthred;

public class Jointhread extends Thread{
	public Jointhread(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(500);
		}catch(Exception e){
			
			
		}
	}
	public static void main(String[] args) {
		Jointhread t=new Jointhread("shailendra");
		Jointhread t1=new Jointhread("shaildra");
		Jointhread t2=new Jointhread("shailen");
		
		
		
		
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			
		}
		t1.start();
		t.start();
	}
	

	
	  
}
