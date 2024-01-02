package Thread.second;

public class Test {
	
	public static void main(String[] args) {
		Threadwitht t=new Threadwitht("shailendra");
		Threadwitht t2=new Threadwitht("raisaab");
		
		t.start();
		t2.start();
	}

}
