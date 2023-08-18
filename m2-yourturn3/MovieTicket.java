package yourturn3;

public class MovieTicket {

	private String movieName; 
	private TicketType type; 
	private int theaterNumber; 
	
	//constructor 
	public MovieTicket() {
		// TODO Auto-generated constructor stub
	}

	public MovieTicket(String movieName, TicketType type, int theaterNumber) {
		this.movieName = movieName;
		this.type = type;
		this.theaterNumber = theaterNumber;
	}

	
	//getter, setter 
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public TicketType getType() {
		return type;
	}

	public void setType(TicketType type) {
		this.type = type;
	}

	public int getTheaterNumber() {
		return theaterNumber;
	}

	public void setTheaterNumber(int theaterNumber) {
		this.theaterNumber = theaterNumber;
	}
	
	
	//method 
	public String getTicketInfo() {
		
	     String returnValue="Movie Name: "+this.movieName+"\n";
	        returnValue+="Theater Number: "+ this.theaterNumber+"\n";
	        
        switch (this.type)
        {
            case CHILD:
                returnValue += "Cost: $9.99";
                break;
            case ADULT:
                returnValue +="Cost: $16.99";
                break;
            case SENIOR:
                returnValue +="Cost: $14.99";
                break;
            default :
                returnValue+="Cost: free!";
                break;
        }
        
        return returnValue;
	}
	
	
	
}
