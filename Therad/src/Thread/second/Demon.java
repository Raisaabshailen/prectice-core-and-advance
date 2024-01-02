package Thread.second;

public class Demon extends Thread {
	
	
	public void run() {
		System.out.println("run method stratred"+Thread.currentThread().isDaemon());
		
		while(true) {
			try {
				Thread.sleep(200);
				System.out.println("demon jaaga");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}  
	
	public static void main(String[] args) {
		System.out.println("main strated");
		
		Demon d=new Demon();
		
		d.setDaemon(true);
		d.start();
		
		try {
			Thread.sleep(4000);
			System.out.println("inside main");
		}catch(Exception e) {
			
		}
		
		System.out.println("leving main thread");
	}

}
