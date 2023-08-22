package yourturn2a;

public class SavingsAcct extends BankAccount {
	//constructor 
	public SavingsAcct(double balance) {
		super(balance);
		this.accountType = accountType.SAVINGS; 
	}
	
	@Override
	public void addInterest() {
		
		this.balance *= 1.03; 
	}
}
