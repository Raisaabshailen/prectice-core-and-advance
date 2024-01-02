import java.util.ArrayList;
import java.util.Comparator;

public class Secondhighest {
	
	public static void main(String[] args) {
		 ArrayList<Employe> l=new ArrayList();
		 
		 l.add(new Employe("shailendra", 15000));
		 l.add(new Employe("shaile", 150600));
		 l.add(new Employe("shailen", 150080));
		 l.add(new Employe("shailendra", 150000));
		 l.add(new Employe("shailena", 150002));
		 
	double d=	l.stream().map(e -> e.salary).distinct().sorted(Comparator.reverseOrder())
			.skip(1).findFirst()
			.orElse(0.0);
	System.out.println(d);
		 
	}

}
