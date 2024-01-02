package String;

public class Revese {
	
	
	public static void main(String[]args) {
		
	 String s="saas";
	 String rev="";
	 
	 for(int i=s.length()-1; i>=0; i--) {
		 rev=rev+s.charAt(i);
	 }
		 System.out.println(rev);
		 
		 if(s.equals(rev)) {
			 System.out.println("this is plandrome");
		 }else {
			 System.out.println("nhi he");
		 }
			 
			 
		 
	 
				
		}
	}


