package yourturn1b;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
/*
 * Test your code from 1a by writing a class with a main method in yourturn1b.
 *
 * Instantiate an Animal object...Remember, Animal isn't in this package so we
 * have to import it!
 *
 * Your Turn 1b:
 * In the yourturn1b package, make two classes named after your favourite kinds
 * of animals (for instance, Lion and Dog) Your class should be named after the
 * KIND of animal it represents. For instance, Lion, Tiger, Dog etc.
 * Make these two classes inherit from Animal - Whoops...what do we have to do
 * to the access modifiers in our Animal class? How can we see the Animal class
 * that's in the yourturn1a package from this code which is in the yourturn1b
 * package?
 * In the Start class with the main method, instantiate one of each kind of
 * these animals in the main method and prove that the makeNoise and eat methods
 * work!
 *
 * YourTurn 1c:
 * Override the makeNoise method in each class so that the Object makes the
 * correct kind of noise. For instance, a Lion should ROAR! A Dog should BARK!
 * uh oh...why can't you see name from the makeNoise method? How can you fix it?
 * YourTurn 1d:
 * Now, add a constructor to the Animal class so that you can set the name,
 * numberOfLegs, and favFood through constructor injection.
 * Make changes to your main method in the Start class to allow your code to use
 * 'constructor injection'
 * Uh oh...what went wrong? Why? Can you fix it?
 *
 * Hmmm....in our Animal class, we don't know what kind of animal it will be so
 * we need to pass in numberOfLegs to the constructor. However, if we Make a Dog
 * class that extends animal, we know that dogs have four legs so we should make
 * our Dog constructor only need the name and favFood passed to it. However, our
 * Animal class still expects 3 arguments to be passed to it. How can we do
 * this?
 *
 * YourTurn 1e:
 * Make Animal abstract and make makeNoise an abstract method - Now, make a
 * third Class that inherits from Animal called Snake. Do what you need to do in
 * order to get Snake to work correctly.
 * */
public class Start1b
{
   public static void main (String[] args)
   {

   }
}
