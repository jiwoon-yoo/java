package assign1;

public class CRM {
	private Customer[] customers = new Customer[20];
	private int numCustomers; 

	
	public void addCustomer(Customer c) {
		customers[numCustomers] = c; 
		numCustomers++; 
	}
	
	
	public String getAllCustomerEmails() {
		String cusAddList = ""; 
	
		for(int i = 0; i < numCustomers; i++) {
			cusAddList += customers[i].getEmailAddress() + "; "; 
		}
		return cusAddList; 
		
	}
	
	public void printBirthdayCards(BirthdayMonth birthdayMonth) {
		for(int i = 0 ; i < numCustomers; i++) {
			if(customers[i].getBirthdayMonth() == birthdayMonth) {
				System.out.printf("Dear <Customer%d>,\r\n" + 
						"Happy Birthday!  In honour of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000!\r\n" + 
						"Best Regards,\r\n" + 
						"Jiwoon Yoo\n", i + 1);
			}
		}
	}
	
	
}
