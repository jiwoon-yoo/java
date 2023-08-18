package yourturn5;

import yourturn5complete.MovieTicket;
import yourturn5complete.TicketType;

/** *************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ************************************************** */
public class StartYourTurn5
{
   public static void main (String[] args) throws Exception
   {
      //add the following line directly underneath the line package yourturn3 at the top of this class:        import yourturn3.MovieTicket;  --this will allow us to access the MovieTicket class that you completed in yourturn3, even though it's in a different package.  We'll learn more about packages later in the course.
	  	   
      //Create an array of 5 movie tickets.  Make some of them for adults, some for seniors and some for child
	   MovieTicket[] tickets = {
	         new MovieTicket("Avengers", TicketType.ADULT, 11),
	         new MovieTicket("Spiderman", TicketType.SENIOR, 3),
	         new MovieTicket("Star Wars", TicketType.CHILD, 10),
	         new MovieTicket("The Simpson's Movie", TicketType.ADULT, 5),
	         new MovieTicket("Star Wars", TicketType.SENIOR, 10)		   
	   }; 
	   
      //loop through the array and print out ticket information for all tickets in the array
	   for(int i = 0 ; i < tickets.length; i++) {
	   
		   System.out.println(tickets[i].getTicketInfo());
	   }
	   
	   
      //next, loop through the array but only print out ticket info for tickets that were sold to SENIORS
	   for(int i = 0 ; i < tickets.length; i++) {
		   
		   if(tickets[i].getType() == TicketType.SENIOR) {
			   System.out.println(tickets[i].getTicketInfo());
		   }

	   }
	   
	   
	   
	   
      //next, loop through the array and print out only tickets for theater number 10
	   for(int i = 0 ; i < tickets.length; i++) {
		   
		   if(tickets[i].getTheaterNumber() == 10) {
			   System.out.println(tickets[i].getTicketInfo());
		   }

	   }
	   
	   
	   
      //figure out how many tickets are for CHILD
	   int childTicketCount = 0; 
	   for(int i = 0 ; i < tickets.length; i++) {
		   
		   if(tickets[i].getType() == TicketType.CHILD) {
			   childTicketCount++; 
		   }
	   }
	   System.out.println(childTicketCount);
	   
	   
      //uh oh...the projector in theater number 10 is broken.  Change all tickets that were theater 10 to be theater 2. Hmmm....it seems like you're going to need a setter in the MovieTicket class to do this.  While you're at it, write the code to throw an exception if someone tries to set the theaterNumber to a negative number.   Print out all tickets to make sure you did it correctly!ange all tickets that were theater 10 to be theater 2.  Print out all tickets to make sure you did it correctly!
	   for(int i = 0 ; i < tickets.length; i++) {
		   
		   if(tickets[i].getTheaterNumber() == 10) {
			   tickets[i].setTheaterNumber(2);
		   }
	   }
   
   }
}
