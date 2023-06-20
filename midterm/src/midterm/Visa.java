package midterm;

public class Visa extends CreditCard{

	private double bonusPoint;
	
	//constructor
	public Visa(String name, double balance, double creditLimit) {//
		super(name, balance, creditLimit);
	}

	//method() 

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double getCreditLimit() {
		return this.creditLimit; 
	}

	@Override
	public String getName() {
		return this.name; 
	}

	@Override
	public double calcBonusPoints() {		///////
		this.bonusPoint = this.balance * 0.005;
		return this.bonusPoint;
	}
	
	

}
