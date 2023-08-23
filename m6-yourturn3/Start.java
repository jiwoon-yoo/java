package yourturn3complete;
/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public class Start 
{
    public static void main(String[] args)
    {
         /*
         You have been given the abstract Person Class. There is an aggregation relationship between Person and Address
         
         Build the Address class as the instructions in that file
         
         Build concrete FireFighter, PoliceOfficer and Baker Classes that all inherit from Person.
         
         Build a 'polymorphic' array and populate it with PoliceOfficer, Baker, and FireFighter objects. (What type do you need to make this array?)
         
         Note that:
         - when the Baker is doing work, we print out "<name> is baking bread"
         - when the PoliceOfficer is doing work, we print out "<name> is protecting the city"
         - when the FireFighter is doing work, we print out "<name> is putting out a fire"
         
         Loop through that array, making each object eat and doWork and printing out the city that each live in:
            Bob, the FireFighter lives in Ottawa
            Bob is eating...yumm!
            Bob is puting out a fire
         
         Why did we write the eat method in the abstract class but the doWork method in each of the concrete classes?
            - the eat method is the same for all three concrete objects so it makes sense to write it only once in the parent class and let each of the children take advantage of it
            - the doWork method needs to be different for each child so we have to override that method in each child class
         
         Can we instantiate a Person object?  No!  Person is abstract so it can't be instantiated.  However, we can still inherit from it!
         
         What kind of relationship exists between the Baker and the Address?   Aggregation
         
         */
        
        
        Address address1 = new Address ("123 First St", "Brampton","L21 4T6");
        Person [] people = {
            new FireFighter ("Rich", address1),
            new Baker ("Lori", address1),
            new PoliceOfficer ("Aiko",address1)
        };
        
        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].getName() + " lives in " + people[i].getAddress().getCity());
            people[i].eat();
            people[i].doWork();
            System.out.println ();
        }
    }
}
