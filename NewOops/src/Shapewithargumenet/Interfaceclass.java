package Shapewithargumenet;

public class Interfaceclass implements Interfaceee{

	@Override
	public void add() {
		System.out.println(10+20);	
	
		System.out.println(Interfaceee.NAME);
	}
	public static void main(String[] args) {
		Interfaceclass c=new Interfaceclass();
		
		c.add();
	}

	
	

}
