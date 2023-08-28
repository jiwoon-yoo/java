package yourturn5complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public abstract class Person
{
   protected String name;
   protected Address contact;

   public Person (String name, Address contact)
   {
      this.name = name;
      this.contact = contact;
   }

   public String getName ()
   {
      return name;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public Address getContact ()
   {
      return contact;
   }

   public void setContact (Address contact)
   {
      this.contact = contact;
   }

   public abstract void doWork ();

}
