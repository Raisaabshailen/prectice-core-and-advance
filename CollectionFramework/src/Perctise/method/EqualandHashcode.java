package Perctise.method;

public class EqualandHashcode {
	
	int id;
	
	public EqualandHashcode(int id) {
		this.id=id;
	}
	
	public int Hashcode() {
		final int prime=31;
	int	result=1;
	
	result=prime*result+id;
	
	return result;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		if(getClass()!=obj.getClass()) {
			return false;
		}return true;
	}

}
