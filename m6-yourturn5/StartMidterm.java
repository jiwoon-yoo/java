package yourturn5complete;

/** *************************************************
 * Type your name here:
 ************************************************** */
public class StartMidterm
{
   public static void main (String[] args)
   {
      Course course = new Course();
      System.out.println("People in Springfield:");
      /* correctly call the appropriate method in the Course object to print out name, streetAddress, city, and postalCode
       * for all people who live in Springfield */
    course.listPeopleByCity("Springfield");

      System.out.println("\nPeople in Brampton:");
      /* correctly call the appropriate method in the Course object to print out name, streetAddress, city, and postalCode
       * for all people who live in Brampton */
    course.listPeopleByCity("Brampton");
      System.out.println("\nMaking everyone do work!");
      /* correctly call the appropriate method in the Course object to make everybody do work */
      course.makeEveryoneWork();
      //What OOP principle allowed the JVM to know who is a professor and who is a student?
      //          Polymorphism
      //List an instance variable that 'holds a reference' to another object somewhere in your code
      //          address in Person
      //What is the relationship between Person and address?  Why
      //          Aggregation - because person 'holds a reference' to Address but they are not tied to the death together
      //          The Address object continue may exist even if the Person object is garbage collected.  Also the Address
      //          object is instantiated before the Person object.
   }
}
