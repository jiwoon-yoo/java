package midterm;

public abstract class CreditCard implements CCFunctions{
	
	protected String name; 
	protected double balance; 
	protected double creditLimit;	
	
	//constructor 
	public CreditCard(String name, double balance, double creditLimit) {
		this.name = name;
		this.balance = balance;
		this.creditLimit = creditLimit;
	}
	
	//setter() 
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter() 
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	
	
	//method() 
	public abstract double calcBonusPoints(); 
	
	public String addPurchase(double purchase) {	//
		if(purchase + this.balance > this.creditLimit) {
			return "Purchase Declined - Over Credit Limit"; 
		}else {
			this.balance = purchase + this.balance; 
			return "Purchase Approved!";
		}
		
	}
	
	public void makePayment(double payment) {		//
		if(this.balance < payment) {
			this.balance = 0; 			////
			System.out.println("you made a payment more than the balance. so I will give you back" + (payment - this.balance) + "$");
		}
		this.balance -= payment; 
		
	}
	
	
	
}
