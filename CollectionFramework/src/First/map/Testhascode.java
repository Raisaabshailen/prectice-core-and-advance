package First.map;

import java.util.ArrayList;

public class Testhascode {
	
	public static void main(String[] args) {
		Equalhashcode e1=new Equalhashcode("shailendra","r102",90);
		Equalhashcode e2=new Equalhashcode("shail","r103",90);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.Hashcode());
		System.out.println(e2.Hashcode());
		
	}

}
