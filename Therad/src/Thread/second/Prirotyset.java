package Thread.second;

public class Prirotyset  extends Thread {

	
	
	
	public Prirotyset(String name) {
		super(name);
	}
	
	
	public void run() {
		System.out.println(getName()+"="+getPriority());
	}
	
	public static void main(String[] args) {
		
		
		Prirotyset p1=new Prirotyset("shailendra");
		Prirotyset  p2=new Prirotyset("rai");
		Prirotyset  p3=new Prirotyset("saab");
		p1.setPriority(10);
		p2.setPriority(2);
		
		p1.start();
		p2.start();
		p3.start();
		
		
	}
}
