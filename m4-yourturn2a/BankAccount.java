package yourturn2a;

public abstract class BankAccount implements IAccount{

	protected double balance; 
	protected AccType accountType; 
	protected int accNumber; 
	protected static int nextAccNumber; 		//주의 
	
	
	//constructor 
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(double balance) {
		this.accNumber = this.nextAccNumber;		//주의 
		this.balance = balance;
		this.nextAccNumber++;						//
	}

	
	
	//getter, setter 
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public AccType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccType accountType) {
		this.accountType = accountType;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public static int getNextAccNumber() {
		return nextAccNumber;
	}

	public static void setNextAccNumber(int nextAccNumber) {
		BankAccount.nextAccNumber = nextAccNumber;
	}

	
	
	//method 
	@Override
	public void deposit(double inMoney) {
		
		this.balance += inMoney; 
	}

	@Override
	public void withdraw(double outMoney) {
		
		this.balance -= outMoney; 
	}

	
	public abstract void addInterest(); 
}
