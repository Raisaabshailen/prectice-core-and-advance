
public class Armstong {
	
	public static void main(String[] args) {
		int a=153;
		int t=a;
		int r;
		int sum=0;
		
		while(t!=0) {
		r=t%10;
		t=t/10;
		sum=sum+(r*r*r);
		}
		if(sum==a) {
			System.out.println("armstong number");
		}else {
			System.out.println("nhi he");
		}
	}
	
}
