
public class WaitThred extends Thread {
	
	public WaitThred(String name) {
		super(name);
	}
	
	public void run() {
	synchronized (this) {
		
		System.out.println(getName());
		
		
		try {
			Thread.sleep(200);
		}catch (Exception e) {
				// TODO: handle exception
			}
	}	
		
			
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		WaitThred w=new WaitThred("shailendra");
		WaitThred w1=new WaitThred("rai");
		w1.start();
		w.start();
	w.wait();
		try {
			
			w.notify();
			//w.start();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	}


