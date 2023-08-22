package yourturn2a;

public class ChequingAcct extends BankAccount{

	//constructor 
	public ChequingAcct(double balance) {
		super(balance);
		this.accountType = accountType.CHEQUING; 
	}
	
	@Override
	public void addInterest() {
		
		this.balance *= 1.005; 
	}

}
