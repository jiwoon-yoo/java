package yourturn5complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Professor extends Person
{

   public Professor (String name, Address contact)
   {
      super(name, contact);
   }

   @Override
   public void doWork ()
   {
      System.out.println(this.name + " is teaching!");
   }

}
