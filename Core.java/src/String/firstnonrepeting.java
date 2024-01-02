package String;

public class firstnonrepeting {
	
	public static void main(String[] args) {
		String name="AASSDDBBHHKMK";
		char[] ch=name.toCharArray();
		int length=0;
		
		for(int i=0; i<ch.length; i++) {
			boolean uniqe=true;
			for(int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j]&&i!=j) {
					uniqe=false;
				}
				
				
			}if(uniqe) {
				System.out.println(ch[i]);
				break;
			}
		}
			
		}
	}


