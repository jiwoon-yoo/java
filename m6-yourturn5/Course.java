package yourturn5complete;

/** *************************************************
 * Type your name here:
 ************************************************** */
public class Course implements ICoursable
{

   private Person[] people = {
      new Professor("Rich", new Address("1 First Street", "Brampton", "L3E4D2")),
      new Student("Bart", new Address("742 Evergreen Terrage", "Springfield", "P3U4T2")),
      new Student("Lisa", new Address("742 Evergreen Terrage", "Springfield", "P3U4T2")),
      new Student("Maggie", new Address("742 Evergreen Terrage", "Springfield", "P3U4T2"))};

   /* Course needs to implement the interface ICoursable -- Read the comments in ICoursable for
    * more information about these methods */

   @Override

   public void listPeopleByCity (String city)
   {
      System.out.println("Listing all people from " + city);
      for (int i = 0; i < people.length; i++) {
         if (people[i].getContact().getCity().equals(city)) {
            System.out.println(people[i].getName() + "\t" + people[i].contact.getStreetAddress() + "\t"
                    + people[i].contact.getCity() + "\t" + people[i].contact.getPostalCode());
         }
      }
   }

   @Override
   public void makeEveryoneWork ()
   {
      for (int i = 0; i < people.length; i++) {
         people[i].doWork();
      }
   }


}
