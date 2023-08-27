package yourturn4complete;
import java.util.Random;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {
      Random rnd = new Random();
      System.out.println("Create 10 clocks in an array with random times and print out the time for each");
      Clock[] clocks = new Clock[10];
      for (int floor = 0; floor < clocks.length; floor++) {
         int hours = rnd.nextInt(12) + 1;
         int minutes = rnd.nextInt(60);
         boolean pm = rnd.nextBoolean();
         clocks[floor] = new Clock(hours, minutes, pm);
         System.out.println(clocks[floor].getTime());
      }

      System.out.println("\nMake a 2-dimensional array with 10 rows and a Clock and a Military clock on each floor, both set to the same time");
      // TimeKeeper[][] betterClocks = {
      //    {new Clock(11, 45, true), new MilitaryClock(11, 45, true)},
      //    {new Clock(1, 5, false), new MilitaryClock(1, 5, false)},
      //    {new Clock(12, 59, true), new MilitaryClock(12, 59, true)},};
      TimeKeeper[][] betterClocks = new TimeKeeper[10][2];
      for (int row = 0; row < betterClocks.length; row++) {
            int hours = rnd.nextInt(12) + 1;
            int minutes = rnd.nextInt(60);
            boolean pm = rnd.nextBoolean();
            betterClocks[row][0] = new Clock(hours, minutes, pm);
            betterClocks[row][1] = new MilitaryClock(hours, minutes, pm);
      }

      System.out.println("Print out the time of each clock:");
      for (int floor = 0; floor < betterClocks.length; floor++) {
         for (int position = 0; position < betterClocks[floor].length; position++) {
            System.out.print(betterClocks[floor][position].getTime() + "   ");
         }
         System.out.println();
      }
   }
}
