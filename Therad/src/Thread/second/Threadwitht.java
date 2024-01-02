package Thread.second;

public class Threadwitht extends Thread{

	
	public String name;
	public Threadwitht(String name) {
		this.name=name;
		
	}
	
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(i+":"+name);
		}
	}
}
