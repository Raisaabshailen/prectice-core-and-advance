package Perctise.method;

public class Testequal {
	
	
public static void main(String[] args) {
	Equalhashcode e=new Equalhashcode("shailendra","r102",456);
	Equalhashcode e1=new Equalhashcode("kallu","r402",657);
	
	
	System.out.println(e.equals(e1));
	System.out.println(e.Hashcode());
	System.out.println(e1.Hashcode());
}

}
