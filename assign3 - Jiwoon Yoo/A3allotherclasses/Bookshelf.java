package A3allotherclasses;
import A3startclass.Start;

public class Bookshelf {
	private Book[] books = new Book[10];
	private static int bookNumInBookshelf = 0; 
		
	//method()
	public void addBookToBookshelf(Book book) {
		books[bookNumInBookshelf] = book; 
		bookNumInBookshelf++; 
		//여기서 aggregation 이루어져야함. 근데 어디 칸에 넣어야하는겨?
	}
	
	public Book retrieveBookFromBookshelf(String title) {
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle() == title) {
				Book tempBook = books[i];
				books[i] = null; 
				return tempBook; 
			}
		}
		return null;	// 
	}
	
	public void displayBooks() {
		if(bookNumInBookshelf == 0) {
			System.out.println("Displaying Bookshelf : The bookshelf is empty");
		}else {
			System.out.print("Displaying Bookshelf : ");
			
			for(int i = 0; i < 10; i++) {
				if(books[i] != null) {
					System.out.print(books[i].getTitle() + ", ");
				}
			}
			System.out.println();
		}
		
	}
	
		 
	public int howManyBooks() {
		int count = 0; 
		int i = 0; 
		
		while(books[i] != null) {
			count++; 
			i++; 
		}
		return count; 
	}
	
}
