package yourturn1;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Treasure
{
   private int goldCoin;
   private Treasure nextTreasure;
   private Treasure prevTreasure;

   public Treasure (int goldCoin)
   {
      this.goldCoin = goldCoin;
   }

   public void setNextTreasure (Treasure nextTreasure)
   {
      this.nextTreasure = nextTreasure;
   }

   public void setPrevTreasure (Treasure prevTreasure)
   {
      this.prevTreasure = prevTreasure;
   }

   public int getGoldCoin ()
   {
      return goldCoin;
   }

   public Treasure getNextTreasure ()
   {
      return nextTreasure;
   }

   public Treasure getPrevTreasure ()
   {
      return prevTreasure;
   }
}
