package demo1ccomplete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class StartDemo1c
{
   public static void main (String[] args)
   {
      System.out.println("Instantiate a single Animal object and set its type to be a LION.  Call the reference variable a1\n"
              + "Then draw what the stack and heap will look like after this Animal object has been instantiated");
      Animal a1 = new Animal(AnimalType.LION);
      System.out.println("How can we print out what kind of Animal it is?");
      System.out.println(a1.getAnimalType());
      System.out.println("\nInstantiate a cage object and call the reference variable c1 and put the Animal  object that you just instantiated in it");
      Cage c1 = new Cage(a1);

      System.out.println("\nPrint out what animal is in the cage:  (do not use the reference variable a1");
      System.out.println(c1.getAnimal().getAnimalType());

      System.out.println("Part II:");

      System.out.println("\nCreate an array of Cage objects called zoo that can hold 5 Cage objects");
      Cage[] zoo = new Cage[5];
      System.out.println("\nPrint out the zoo variable...what is this?");
      System.out.println(zoo);

      System.out.println("\nPrint out what's in the first element of the zoo array");
      System.out.println(zoo[0]);

      System.out.println("\nPrint out the value of each array element using a loop");
      for (int i = 0; i < zoo.length; i++) {
         System.out.println("Element 0: " + zoo[i]);
      }

      System.out.println("\nCan we print out the kind of animal in the first Cage element of our zoo array? Why?");
//      System.out.println(zoo[0].getAnimal().getAnimalType()); //why didn't this work?
//No! Because floor 0 of the zoo array has a null in it.  We need to instantiate a Cage object and put it's address in zoo[0] and then we have to instantiate an Animal
//object and put it's address in the instance Variable called animal that is in the Cage object.  This will make more sense in the next section


      
      
      
      System.out.println("We would like to place an Animal that is an ELEPHANT in the first cage in our zoo array...\n"
              + "However, before we can put an animal in the Cage, we have to instantiate a Cage object into the first\n"
              + "element of the array");
      zoo[0] = new Cage();
//now zoo[0] holds the reference address of a Cage object so we can now access the Cage object methods.  However, we haven't instantiated an Animal object yet so:
      zoo[0].setAnimal(new Animal(AnimalType.ELEPHANT));
      //Now zoo[0] holds the address of the address of a Cage object and that Cage object has an instance variable called animal that holds the address of an Animal object
      System.out.println("Prove that the ELEPHANT is in the first Cage element");
      System.out.println(zoo[0].getAnimal().getAnimalType());

      System.out.println("Now add an Animal that is a TIGER to the second cage...but do it all with one line of code");
      zoo[1] = new Cage(new Animal(AnimalType.TIGER));
      System.out.println("Prove it!");
      System.out.println(zoo[1].getAnimal().getAnimalType());

      System.out.println("Next, add a MONKEY to the last Cage in the array");
      zoo[zoo.length - 1] = new Cage(new Animal(AnimalType.MONKEY));

      System.out.println("Now, loop through the array and print out what animal is in what cage\n"
              + "If a cage is empty, print out Empty Cage");

      System.out.println();
      for (int i = 0; i < zoo.length; i++) {
         if (zoo[i] != null) {
            System.out.println(zoo[0].getAnimal().getAnimalType());
         }
         else {
            System.out.println("Empty Cage");
         }
      }
      
      
      System.out.println("Part III:");

      System.out.println("Good Work...However, what if we want our zoo to have different sections?");
      System.out.println(" We would like to build a betterZoo that can have entire rows of Cages");
      System.out.println("Our betterZoo will have 3 rows with 5 cages in each row.");
      System.out.println("We want 3 rows of cages and we would like each row to hold 5 cages");

      //Uncomment each line one at a time and predict what is going to print
      Cage[][] betterZoo = new Cage[3][5];
      System.out.println(betterZoo.length); //this will tell us how many rows
      System.out.println(betterZoo[0]);  //hmmm....why isn't this null?  This is the address of the first row array
      System.out.println(betterZoo[0][0]); //that's more like it - This is the element at the 0 row and 0 column
      System.out.println(betterZoo[0].length); //this tells us how many columns in row 0

      System.out.println("Add three Cages with Animals in them to our betterZoo");
      betterZoo[0][0] = new Cage(new Animal(AnimalType.TIGER));
      betterZoo[1][3] = new Cage(new Animal(AnimalType.LION));
      betterZoo[2][4] = new Cage(new Animal(AnimalType.ELEPHANT));

      System.out.println("Print out all of our cages and what is in them");
      for (int row = 0; row < betterZoo.length; row++) {
         for (int column = 0; column < betterZoo[row].length; column++) {
            if (betterZoo[row][column] != null) {
               System.out.print(betterZoo[row][column].getAnimal().getAnimalType() + "\t");
            }
            else {
               System.out.print("Empty\t");
            }
         }
         System.out.println();
      }
   }
}
