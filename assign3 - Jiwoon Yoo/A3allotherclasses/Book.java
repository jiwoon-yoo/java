package A3allotherclasses;
import A3startclass.Start;

public class Book {
	private String title; 
	private Genre genre; 
	
	//contructor
	public Book(String title, Genre genre) {
		super();
		this.title = title;
		this.genre = genre;
	}


	//getter()
	public String getTitle() {
		return title;
	}
}
