package yourturn1bcomplete;
import yourturn1acomplete.CellPhone;
import yourturn1acomplete.Coin;
import yourturn1acomplete.Heart;
import yourturn1acomplete.HeartBeat;
import yourturn1acomplete.HomePhone;
import yourturn1acomplete.PayPhone;
import yourturn1acomplete.Power;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Person
{
   private String name;
   private HomePhone homePhone; //association - reference held but no ownership
   private CellPhone cellPhone; //aggregation - reference held, some ownership but separate lifespans
   private final Heart heart = new Heart(55, HeartBeat.PITTERPATTER); //composition - reference held, ownership and lifespans are intertwined

   public Person (String name, HomePhone homePhone, CellPhone cellPhone)
   {
      this.name = name;
      this.homePhone = homePhone;
      this.cellPhone = cellPhone;
   }

   public String getName ()
   {
      return name;
   }

   public void makeHeartWork ()
   {
      this.heart.pump();
   }

   public void makeCallWithCellPhone (int number)
   {
      System.out.println(this.name + " is making a call with a CellPhone");
      this.cellPhone.setPowerStatus(Power.ON);
      this.cellPhone.makeCall(number);
   }

   public void makeCallWithPayPhone (PayPhone phone, int number)
   {
      System.out.println(this.name + " is making a call with a PayPhone");
      phone.acceptCoin(Coin.QUARTER);
      phone.makeCall(number);
   }

   public void makeCallWithHomePhone (int number)
   {
      System.out.println(this.name + " is making a call with the HomePhone");
      this.homePhone.makeCall(number);
   }
}
