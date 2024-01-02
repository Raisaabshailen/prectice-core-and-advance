
public class HelloWithTheard extends Thread {
	
	
	public String name;
	
	
	public HelloWithTheard(String n) {
		this.name=n;
	}


	@Override
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.println(i+"#"+name);
	}
	
	
	}

}
