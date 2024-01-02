package Thread.second;

public class Threadhello   implements Runnable{
	
	
	public String name;
	
	public Threadhello(String name) {
		this.name=name;
	}
	
	public void run() {
		for(int i=0; i<=40; i++) {
			System.out.println(i+":"+ name);
		}
	}
	
	public static void main(String[] args) {
		Threadhello t1=new Threadhello("hsaiolendra");
		Threadhello t2=new Threadhello("shailendra");
		
		Thread t=new Thread(t1);
		t.start();
		
		/*
		 * t1.start(); t.start();
		 */
	}
	

}
