package assign1;
public class Start {

	public static void main(String[] args) {

		
		Customer[][] customers = {
				{new Customer("Jiwoon", "Yoo", BirthdayMonth.APR, "ireneuu77@gmail.com"), new Customer("James", "Yoo", BirthdayMonth.AUG, "james@gmail.com"), new Customer("kate", "Yoo", BirthdayMonth.FEB, "kate@gmail.com")},
				{new Customer("Jen", "Yoo", BirthdayMonth.APR, "jen@gmail.com"), new Customer("Lily", "Yoo", BirthdayMonth.MAY, "lily@gmail.com")}
		}; 
		

		for(int i = 0; i < customers.length; i++) {
			for(int j = 0; j < customers[i].length; j++) {
				System.out.printf("Customer%d : %s %s   ", j + 1, customers[i][j].getFirstName(), customers[i][j].getLastName());
			}
			System.out.println();
		}
		
		
		CRM crm1 = new CRM(); 
		crm1.addCustomer(customers[0][0]);
		crm1.addCustomer(customers[0][1]);
		crm1.addCustomer(customers[0][2]);
		crm1.addCustomer(customers[1][0]);
		crm1.addCustomer(customers[1][1]);
		crm1.printBirthdayCards(BirthdayMonth.APR);
		System.out.println(crm1.getAllCustomerEmails());
		
		
		
		
		
	}

}
