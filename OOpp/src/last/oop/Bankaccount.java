package last.oop;

public class Bankaccount implements Cloneable{
public double balance;

public Bankaccount(double b) {
	this.balance=b;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}
	
	
}
