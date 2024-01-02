package Thread.second;

public class RunnableThread  implements Runnable{

	
	public String name;
	
	public RunnableThread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+":"+name);
		}
		
	}
	
	public static void main(String[] args) {
		RunnableThread r=new RunnableThread("shailendra");
		RunnableThread r1=new RunnableThread("rai");
		
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.start();
		t1.start();
	}

}
