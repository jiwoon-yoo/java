package yourturn2;

import yourturn2acomplete.Cake;

/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {
	      Cake c1 = new Cake();  //c1 is local and reference -stored in the current stack frame and stores the address of a Cake object
	      c1.numberOfCandles = 5;
	      c1.icingFlavour = "Chocolate";
	      c1.message = "Happy Birthday";

	      Cake c2 = new Cake();//c2 is local and reference -stored in the current stack frame and stores the address of a Cake object
	      c2.numberOfCandles = 50;
	      c2.icingFlavour = "Vanilla";
	      c2.message = "Congratulations";
	      
	      
	      System.out.println(c1.describeCake());
	      System.out.println(c2.describeCake());
	   
   }
}
