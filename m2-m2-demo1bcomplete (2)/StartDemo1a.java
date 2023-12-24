package demo1acomplete;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class StartDemo1a
{
   public static void main (String[] args)
   {
      Animal a1 = new Animal(AnimalType.BEAR);
      System.out.println(a1);
      System.out.println(a1.getAnimalType());

      Animal a2 = new Animal(AnimalType.LION); //this is better!  
      AnimalType typeOfAnimalThatIsInObjectA2 = a2.getAnimalType();
      System.out.println(typeOfAnimalThatIsInObjectA2);

      //can use == to compare enums instead of .equals for Strings
      if (a1.getAnimalType() == a2.getAnimalType()) {
         System.out.println("Same!");
      }
   }
}
