
public class LinkedList {
	Node head = null; 
	int size = 0; 
	
	//method()
	
	//accept customer
	//will insert the Customer into the list alphabetically

	public void addCustomer(Customer cm){
		if(size == 0) {
			Node newNode = new Node(cm, this.head);	
			this.head = newNode;
		}else if(size == 1) {
			Node newNode = new Node(cm);
			Node pointer = this.head; 
			if(newNode.getPayload().isAlphabeticallyBefore(pointer.getPayload())) {
				newNode.setNextNode(pointer);
				this.head = newNode; 
			}else {
				newNode.setNextNode(null);
				pointer.setNextNode(newNode);
				
			}
		}else if(size == 2) {	
			Node newNode = new Node(cm);
			Node pointer1 = this.head;
			Node pointer2 = pointer1.getNextNode();
			if(newNode.getPayload().isAlphabeticallyBefore(pointer1.getPayload())) {
				newNode.setNextNode(pointer1);
				this.head = newNode; 
			}else if(pointer1.getPayload().isAlphabeticallyBefore(newNode.getPayload())) {
				pointer1.setNextNode(newNode);
				newNode.setNextNode(null);
			}else {
				pointer1.setNextNode(newNode);
				newNode.setNextNode(pointer2);			
			}
		}else { 
			Node newNode = new Node(cm);
			Node pointer1 = this.head;
			Node pointer2 = pointer1.getNextNode(); //??
			Node pointer3 = this.head; 
			
			while(pointer3.getNextNode() != null) {
				pointer3 = pointer3.getNextNode();
			}
		
			
			if(newNode.getPayload().isAlphabeticallyBefore(pointer1.getPayload())) {
				newNode.setNextNode(pointer1);
				this.head = newNode; 
			}else if(pointer3.getPayload().isAlphabeticallyBefore(newNode.getPayload())) {	////
			
				pointer3.setNextNode(newNode);
				newNode.setNextNode(null);
			}else {
			
				while(pointer2 != null) {
					if(pointer1.getPayload().isAlphabeticallyBefore(newNode.getPayload())
							&& newNode.getPayload().isAlphabeticallyBefore(pointer2.getPayload())) 
					{
						newNode.setNextNode(pointer1.getNextNode());
						pointer1.setNextNode(newNode);
					}
					pointer1 = pointer1.getNextNode();
					pointer2 = pointer2.getNextNode(); 
				}
			}
			
			
		}
		size++; 
	}
	
	
	
	
	public String toString() {
		String names = "";
		
		Node shuttle = this.head; 	//
		while(shuttle != null) {	//
			names += shuttle.getPayload().getName() + "\n"; 
			shuttle = shuttle.getNextNode(); 
		}
		
		return "List of All Customers: " + "\n" + names; 
	}

	
	
	
	public void printBirthdayCardsForSpecifiedMonth(int inputMonth){
		Node shuttle = this.head; 
		while(shuttle != null) {
			if(shuttle.getPayload().getBirthdayMonth() == inputMonth) {
				System.out.printf("Happy Birthday %s\r\n" + 
						"Please accept our coupon for $10 off of your next purchase of more than $100,000\r\n", shuttle.getPayload().getName());
			}
			shuttle = shuttle.getNextNode(); 
		}
		System.out.println();
		
	}
	
	
	
	public void reverse() {
		
		
		Node shuttle = this.head; 	
		int number = shuttle.getPayload().getNextCustomerID();
		String[] reverse = new String[number];
		int i = 0; 
		while(shuttle != null) {	
			reverse[i] = shuttle.getPayload().getName(); 
			i++;
			shuttle = shuttle.getNextNode(); 
		}
		System.out.println("Bonus Question - The names in reverse:");
		for(int j = number - 1; j >= 0; j--) {
			System.out.println(reverse[j]);
		}
		
	
	}
	
	
	
}
