package Lastthred;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		TotalEarning t=new TotalEarning();
		t.start();
		
		
		synchronized (t) {
			t.wait();
			
		}System.out.println("total earning:"+t.total+"in rs");
	}
	

}
