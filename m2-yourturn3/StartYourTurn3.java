package yourturn3;

import java.util.Scanner;

/**
 * *************************************************
 * 
 * @Rich Smith - ZenOfProgramming.com *
 */

/*
Take a look at yourturn3.jpg

Now, write the code in the order specified in the jpg so that the code below works as expected
*/

public class StartYourTurn3 {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("SpiderMan", TicketType.ADULT, 4);
        String ticketInfo = ticket1.getTicketInfo();
        System.out.println(ticketInfo);

        MovieTicket ticket2 = new MovieTicket("Avengers", TicketType.CHILD, 3);
        String ticket2Info = ticket2.getTicketInfo();
        System.out.println(ticket2Info);

        MovieTicket ticket3 = new MovieTicket("Avengers", TicketType.SENIOR, 3);
        String ticket3Info = ticket3.getTicketInfo();
        System.out.println(ticket3Info);
 
    }
}
