
public class PriortyThread extends Thread {
	
	
	public String name;
	
	public PriortyThread(String n) {
		this.name=n;
	}
	
	public void run() {
		
			System.out.println(":"+name+getPriority());
	
	}
	
	

}
