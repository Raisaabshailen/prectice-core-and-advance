
public class Testpriorty {
	
	public static void main(String[] args) {
		PriortyThread t1=new PriortyThread("t1 case shaielndr");
		PriortyThread t2=new PriortyThread("t2 case shaielndr");
		PriortyThread t3=new PriortyThread("t3case shaielndr");
		
		t1.setPriority(2);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
