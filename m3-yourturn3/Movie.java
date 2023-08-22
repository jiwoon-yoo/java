package yourturn3;

public class Movie {

	private String title; 
	private Genre genre; 
	
	//constructor 
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, Genre genre) {
		this.title = title;
		this.genre = genre;
	}

	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
	
}
