package Thread.second;

public class Priorty extends Thread{
	public String name;
	public Priorty(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println(name+":"+getPriority());
	}
	
	
	public static void main(String[] args) {
		Priorty p=new Priorty("mera");
		Priorty p1=new Priorty("sera");
		Priorty p2=new Priorty("tera");
		
		p1.setPriority(10);
		p2.setPriority(2);
		
		p.start();
		p1.start();
		p2.start();
	}

}
