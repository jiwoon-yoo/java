package midterm;

public class Start {

	public static void main(String[] args) {
		//only printout here 
		
		CreditCard[] creditCard = {new Visa("Rich", 1999.99, 2000), new Visa("Lori", 100.22, 1500), new VisaGold("Aiko", 900.43, 1000)};
		
		
		for(int i = 0; i < creditCard.length; i++) {
			if(100 + creditCard[i].getBalance() > creditCard[i].getCreditLimit()) {
				System.out.println("The Follwing people are over their limit :");
				System.out.println(creditCard[i].getName());
			}
		}
		System.out.println();
		
		
		System.out.println("Accounts report : ");
		for(int i = 0; i < creditCard.length; i++) {
			System.out.println("Card belongs to : " + creditCard[i].getName());
			System.out.println("Current balance owing : " + creditCard[i].getBalance());	// 
			System.out.println("Bonus Points : " + creditCard[i].calcBonusPoints());
			System.out.println("Making purchase for $100: " + creditCard[i].addPurchase(100));
			System.out.println("Paying off credit card");
			System.out.println("New Balance : " + creditCard[i].getBalance());	//
			System.out.println();
		}

	}

}
