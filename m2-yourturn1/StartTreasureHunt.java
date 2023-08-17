package yourturn1;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class StartTreasureHunt
{
   public static void main (String[] args)
   {
      Treasure t1 = new Treasure(3);
      Treasure t2 = new Treasure(5);
      Treasure t3 = new Treasure(6);
      Treasure t4 = new Treasure(1);
      Treasure t5 = new Treasure(2);
      t1.setNextTreasure(t2);
      t2.setPrevTreasure(t1);
      t2.setNextTreasure(t3);
      t3.setPrevTreasure(t2);
      t3.setNextTreasure(t4);
      t4.setPrevTreasure(t3);
      t4.setNextTreasure(t5);
      t5.setPrevTreasure(t4);

      //First, draw the memory diagram of the program when just after line 21 runs

      System.out.println("\nWhat Prints?");   //uncomment the lines below, one line at a time.  What will happen when you run the code?
      System.out.println(t3);

      int coins = t4.getPrevTreasure().getGoldCoin() + t2.getNextTreasure().getPrevTreasure().getGoldCoin();
      System.out.println(coins);

      coins = t4.getNextTreasure().getPrevTreasure().getPrevTreasure().getGoldCoin();
      System.out.println(coins);

//      System.out.println(t1.getPrevTreasure().getGoldCoin());
      System.out.println(t1.getPrevTreasure());

      System.out.println(t1.getNextTreasure().getNextTreasure().getNextTreasure().getPrevTreasure().getGoldCoin());

   }
}
