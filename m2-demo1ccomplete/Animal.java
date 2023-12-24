package demo1ccomplete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Animal
{
   private AnimalType animalType;

   public Animal (AnimalType type)
   {
      this.animalType = type;
   }

   public AnimalType getAnimalType ()
   {
      return animalType;
   }

   public void setAnimalType (AnimalType animalType)
   {
      this.animalType = animalType;
   }


}
