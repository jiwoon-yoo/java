package yourturn1bcomplete;
import yourturn1acomplete.CellPhone;
import yourturn1acomplete.HomePhone;
import yourturn1acomplete.PayPhone;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {
      HomePhone h1 = new HomePhone(7777777);
      CellPhone c1 = new CellPhone();
      Person p1 = new Person("Rich", h1, c1);
      PayPhone payPhone = new PayPhone();
      p1.makeCallWithPayPhone(payPhone, 555);
      p1.makeCallWithHomePhone(333);
      p1.makeCallWithCellPhone(444);
      p1.makeHeartWork();

      //Make an array of 5 Persons called people that all share a HomePhone and a CellPhone
      //Have each Person in the array make a call with these phones

      System.out.println("Array of Persons");
      Person[] people = {new Person("Bart", h1, c1), new Person("Lisa", h1, c1),
         new Person("Millhose", h1, c1), new Person("Homer", h1, c1), new Person("Krusty", h1, c1)};

      for (int i = 0; i < people.length; i++) {
         people[i].makeCallWithHomePhone(111);
         people[i].makeCallWithCellPhone(444);
      }
   }
}
