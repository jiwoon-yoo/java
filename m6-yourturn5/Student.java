package yourturn5complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Student extends Person
{
   public Student (String name, Address contact)
   {
      super(name, contact);
   }

   @Override
   public void doWork ()
   {
      System.out.println(this.name + " is studying!");
   }

}
