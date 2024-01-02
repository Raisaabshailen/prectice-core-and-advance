package Oops;

public class Person extends BankAcc {
	
	public double Blance;
	public double Amount;
	

	public double getBlance() {
		return Blance;
	}

	public void setBlance(double blance) {
		Blance = blance;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	@Override
	public double Deposit() {
		Blance=Blance+Amount;
		
		return Blance;
	}

	@Override
	public double Withdrawl() {
		Blance=Blance-Amount;
		if(Blance<10000) {
			System.out.println("insuficient blance");
		}
		return Blance ;
	}
	

}
