package yourturn2a;

public class InvestmentAcct extends BankAccount{
	//constructor 
	public InvestmentAcct(double balance) {
		super(balance);
		this.accountType = accountType.INVESTMENT; 
	}
	
	@Override
	public void addInterest() {
		
		this.balance *= 1.07; 
	}

}
