package demo1ecomplete;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class StartDemo1e
{
   public static void main (String[] args)
   {
      //Make a ragged array called raggedZoo with 3 rows. Row 0 will have 2 Cages, row 1 will have 3 Cages and row 2 will have 1 Cage
      Cage[][] raggedZoo = new Cage[3][];
      raggedZoo[0] = new Cage[2];
      raggedZoo[1] = new Cage[3];
      raggedZoo[2] = new Cage[1];

      System.out.println("What is in the raggedZoo variable?");
      System.out.println("address: " + raggedZoo);
      System.out.println("How many rows in raggedZoo?");
      System.out.println(raggedZoo.length);
      System.out.println("What does raggedZoo[0] hold?");
      System.out.println(raggedZoo[0] + "<-- the address of the row 0 Cage array ");
      System.out.println("What is the value of raggedZoo[0][0]");
      System.out.println("Null " + raggedZoo[0][0]);
      System.out.println("----------How many columns are in row 0?  In row 2?------------------------");
      System.out.println(raggedZoo[0].length);
      System.out.println(raggedZoo[2].length);


      Cage[][] raggedZoo2 = {
         {new Cage(new Animal(AnimalType.TIGER)), new Cage(new Animal(AnimalType.LION))},
         {new Cage(new Animal(AnimalType.MONKEY)), new Cage(new Animal(AnimalType.ELEPHANT)), new Cage(new Animal(AnimalType.BEAR))},
         {(new Cage(new Animal(AnimalType.LION)))}
      };
      System.out.println("--------Print out the length of each row of the ragged array---------------------------------");
      for (int i = 0; i < raggedZoo2.length; i++) {
         System.out.println(raggedZoo2[i].length);
      }
      System.out.println("--------Print out what type of animal is in each Cage in the ragged array --------------------------------");
      for (int row = 0; row < raggedZoo2.length; row++) {
         System.out.print("Row " + row + ":  ");
         for (int column = 0; column < raggedZoo2[row].length; column++) {
            if (raggedZoo2[row][column] != null && raggedZoo2[row][column].getAnimal() != null) {
               System.out.print(raggedZoo2[row][column].getAnimal().getAnimalType() + "\t");
            }
         }
         System.out.println();
      }
   }
}
