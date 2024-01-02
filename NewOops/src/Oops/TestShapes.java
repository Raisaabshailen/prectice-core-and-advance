package Oops;

public class TestShapes {
	public static void main(String[] args) {
		
	
	Shape[] s=new Shape[2];
	s[0]=new Circles();
	s[1]=new Reactangle();
	
	Circles c=(Circles) s[0];
	Reactangle r=(Reactangle) s[1];
	
	c.setRedius(50);
	r.setlength(15);
r.setwidth(50);


  double sum=0;
  
  
  for(int i=0; i<s.length; i++) {
	  sum=sum+s[i].area();
	  
  }System.out.println(sum);
}
	}
