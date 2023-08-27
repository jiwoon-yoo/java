package yourturn4complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class MilitaryClock extends Clock
{
   public MilitaryClock (int hours, int minutes, boolean pm)
   {
      super(hours, minutes, pm);
   }

   @Override
   public String getTime ()
   {
      int militaryHours = this.hours;
//      if (this.pm) {	
//         militaryHours += 12;
//      }
      
      if (!this.pm && this.hours == 12) {
          militaryHours = 0; // 오전 12시는 24시간 형식에서 0시로 표현됨
      } else if (this.pm && this.hours != 12) {
          militaryHours += 12;
      }
      
      
      String time = String.format("%02d:%02d", militaryHours, this.minutes);
      return time;
   }
}
