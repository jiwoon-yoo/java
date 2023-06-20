package assign1;

public class Customer {

	private String firstName; 
	private String lastName; 
	private int customerID = 0; 
	public static int nextAvailableID = 0; //??
	private BirthdayMonth birthdayMonth; 
	private String emailAddress; 
	
	
	//constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, BirthdayMonth birthdayMonth, String emailAddress) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.birthdayMonth = birthdayMonth; 
		this.emailAddress = emailAddress; 
		this.customerID = nextAvailableID; 
		nextAvailableID++;
		
	}
	
	//setter()
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setBirthdayMonth(BirthdayMonth birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	//getter()
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getCustomerID() {
		return customerID;
	}
	public BirthdayMonth getBirthdayMonth() {
		return birthdayMonth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public static int getNextAvailableID() {
		return nextAvailableID;
	}
	
	
	
}
