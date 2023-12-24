package demo1bcomplete;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Cage
{
   private Animal animal;

   public Cage (Animal animal)
   {
      this.animal = animal;
   }

   public Cage ()
   {
   }

   public Animal getAnimal ()
   {
      return animal;
   }

   public void setAnimal (Animal animal)
   {
      this.animal = animal;
   }

}
