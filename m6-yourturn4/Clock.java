package yourturn4complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Clock implements TimeKeeper
{
   protected int hours;
   protected int minutes;
   protected boolean pm;

   public Clock (int hours, int minutes, boolean pm)
   {
      this.hours = hours;
      this.minutes = minutes;
      this.pm = pm;
   }

   @Override
   public String getTime ()
   {
      String time = String.format("%02d:%02d", this.hours, this.minutes);
      time += (pm) ? " pm" : " am";
      return time;
   }

   @Override
   public void setTime (int hours, int minutes, boolean pm)
   {
      this.hours = hours;
      this.minutes = minutes;
      this.pm = pm;
   }
}
