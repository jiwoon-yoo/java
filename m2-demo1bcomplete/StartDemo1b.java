package demo1bcomplete;

/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class StartDemo1b
{
   public static void main (String[] args)
   {
//      Animal a1 = new Animal ("goldfish");  //won't work because the constructor expects a AnimalType type.
      Animal a1 = new Animal(AnimalType.ELEPHANT);


      System.out.println("Instantiate a single Animal object and set its type to be a LION.  Name the reference variable a1\n"
              + "Now draw what the stack and heap will look like after this Animal object has been instantiated");
      Animal a2 = new Animal(AnimalType.LION);
      System.out.println("How can we print out what kind of Animal it is?");
      System.out.println(a2.getAnimalType());
      System.out.println("\nInstantiate a Cage object, name the reference variable c1 \nand put the Animal  object that you just instantiated in it");
      Cage c1 = new Cage(a1);

      System.out.println("\nPrint out what animal is in the cage:  (do not use the reference variable a1)");
      System.out.println(c1.getAnimal().getAnimalType());

   }
}
