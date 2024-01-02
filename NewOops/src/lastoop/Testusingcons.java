package lastoop;

public class Testusingcons {
	
	public static void main(String[] args) {
		Shape1[] s=new Shape1[2];
		s[0]=new Circle1(15);
		s[1]=new Rectangle1(25,30);
		
		Circle1 c=(Circle1) s[0];
		Rectangle1 r=(Rectangle1) s[1];
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		double sum=0;
		for(int i=0; i<s.length; i++) {
			sum=sum+s[i].area();
			
			System.out.println(sum);
		}
	}

}
