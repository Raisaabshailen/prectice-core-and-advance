
public class Priortythreadd extends Thread{
	
	public Priortythreadd(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+":"+ getPriority());
	}
	
	public static void main(String[] args) {
		Priortythreadd p1=new Priortythreadd("shailendra");
		Priortythreadd p2=new Priortythreadd("rai");
		Priortythreadd p3=new Priortythreadd("kallu");
		
		p1.setPriority(2);
		p3.setPriority(10);
		
		p1.start();
		p2.start();
		p3.start();
	}
	

}
