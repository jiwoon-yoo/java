package yourturn6;

/**
 @Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args)
   {
      ParkingLot p1 = new ParkingLot("Joe's Parking");
      p1.printStatus();
      System.out.println(p1.parkCar(new Car("Ford Mustang", "Blue", "ABC001")));
      System.out.println(p1.parkCar(new Car("Audi S5", "Grey", "ABC123")));
      System.out.println(p1.parkCar(new Car("Lexus RSX", "Blue", "XYZ001")));
      System.out.println(p1.parkCar(new Car("VW Bug", "Red", "ABC999")));
      System.out.println(p1.parkCar(new Car("Hummer O2", "Red", "ABC333")));
      System.out.println(p1.parkCar(new Car("Audi A8", "Blue", "XYZ999")));
      p1.printStatus();
      Car retreivedCar = p1.retrieveCar("ABC123");
      System.out.println(retreivedCar.getModel() + " retrieved!!!");
      p1.printStatus();
   }
}
