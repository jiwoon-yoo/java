package A3allotherclasses;
import A3startclass.Start;

public class Person {
	private String name; 
	private Book book; 
	private final Heart heart = new Heart(44, HeartBeat.PITTERPATTER);
	//Composition between Person and Heart
	
	//contructor 
	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, Book book) {
		super();
		this.name = name;
		this.book = book;
	}
	
	//getter()
	public String getName() {
		return name;
	}
	public Book getBook() {
		return book;
	}
	
	//setter()
	public void setBook(Book book) {
		this.book = book;	
		//Aggregation between Person and Book 
	}
	
	//method() 
	public void putBookOnBookshelf(Bookshelf shelf) {
		shelf.addBookToBookshelf(this.book);
		//Dependency between Person and Bookshelf 
		book = null; 
	}
	
	public void retrieveBookFromBookshelf(String title, Bookshelf shelf) {
		this.book = shelf.retrieveBookFromBookshelf(title);
		
	}
	
	public String whatBookDoIHave(){
		if(book == null) {
			return this.name + " has no book";
		}else {
			return this.book.getTitle();	
		}	
	}
	
	public void makeHeartPump() {
		heart.oneMinute();
	}
}
