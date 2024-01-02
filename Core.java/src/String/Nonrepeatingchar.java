package String;

public class Nonrepeatingchar {
	
	/* ye bala samzna he */
	
	public static void main(String[] args) {
		
		String s="ASSBDC";
		
		char ch[] =s.toCharArray();
		/* System.out.println(ch); */
	for(int i=0; i<ch.length; i++ ) {
			/* System.out.println(i); */
		boolean uniqe=true;
		
		for(int j=0; j<ch.length; j++) {
			if(i!=j && ch[i]==ch[j]) {
				uniqe=false;
			}
		}
			if(uniqe) {
				
			
			System.out.println(ch[i]);
			break;
			}
			
	}
	}

}


