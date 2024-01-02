package Perctise.method;

import java.util.ArrayList;

public class Testequalll {
	
	public static void main(String[] args) {
		Equalhashcodee e1=new Equalhashcodee("shailendra", "r104", 89);
		Equalhashcodee e2=new Equalhashcodee("shailendra", "r104", 89);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.Hashcode());
		System.out.println(e2.Hashcode());
				
				
	}

}
