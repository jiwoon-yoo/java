package yourturn5;
/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class MovieTicket
{
   private String movieName;
   private TicketType type;
   private int theaterNumber;

   public MovieTicket (String movieName, TicketType type, int theaterNumber)
   {
      this.movieName = movieName;
      this.type = type;
      this.theaterNumber = theaterNumber;
   }

   public void setTheaterNumber (int theaterNumber) throws Exception
   {
	   if(theaterNumber < 0) {
		   
		   throw new Exception("wrong theater number"); 
	   }
      this.theaterNumber = theaterNumber;
   }

   public String getMovieName ()
   {
      return movieName;
   }

   public TicketType getType ()
   {
      return type;
   }

   public int getTheaterNumber ()
   {
      return theaterNumber;
   }

   public String getTicketInfo ()
   {
      String returnValue = "Movie Name: " + this.movieName + "\n";
      returnValue += "Theater Number: " + this.theaterNumber + "\n";
      switch (this.type) {
         case CHILD:
            returnValue += "Cost: $9.99";
            break;
         case ADULT:
            returnValue += "Cost: $16.99";
            break;
         case SENIOR:
            returnValue += "Cost: $14.99";
            break;
         default:
            returnValue += "Cost: free!";
            break;
      }
      return returnValue;
   }
}
