
public class Demonthread extends Thread{

	@Override
	public void run() {
		System.out.println("Daemon T started"+Thread.currentThread());
		
		
		
		//infiniteloop
		
		while(true) {
			try {
				Thread.sleep(500);
				
				System.out.println("Deamon jaag gyaa");
			}
			catch(InterruptedException x){
				
			}
		}
	}
	
	

}
