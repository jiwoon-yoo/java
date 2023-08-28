package yourturn8complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start {
  public static void main(String[] args) throws Exception {
    System.out.println("Instantiating a Person named Ned  who is at the train station");
    Person ned = new Person("Ned", Location.MALL);
    System.out.println(ned.toString());

    System.out.println("\nInstantiating a Bus Driver named Otto who is at the mall");
    Driver otto = new Driver("Otto", Location.TRAINSTATION, LicenseType.BUS, 40);
    System.out.println(otto.toString());

    System.out.println("\nInstantiating a Car Driver named Moe who is at the DOWNTOWN");
    Driver moe = new Driver("Moe", Location.DOWNTOWN, LicenseType.CAR, 45);
    System.out.println(moe.toString());

    System.out.println("\nInstantiating a Bus that is at the TRAINSTATION");
    Bus bus = new Bus("XYZ123", Location.TRAINSTATION);
    bus.honk();
    System.out.println(bus.toString());
    System.out.println("Otto is going to drive the bus");
    bus.addDriver(otto);
    System.out.println(bus.toString());
    bus.startEngine();
    System.out.println(bus.driveTo(Location.MALL));

    System.out.println("\nNed is getting on the bus:");
    bus.addPassengerToVehicle(ned);
    System.out.println(bus.getListOfPassengerNames());
    bus.driveTo(Location.DOWNTOWN);
    bus.addPassengerToVehicle(moe);
    System.out.println(bus.getListOfPassengerNames());
    bus.driveTo(Location.TRAINSTATION);

    otto.sing("Dazed and Confused");
    ned.sing("Smoke on the Water");
    moe.sing("Fire on the Mountain");

    System.out.println(ned.toString());
    System.out.println(otto.toString());
    System.out.println(moe.toString());

    System.out.println("Moe is getting off of the bus");
    bus.passengerDisembarkFromVehicle(moe);
    System.out.println(bus.getListOfPassengerNames());
    bus.driveTo(Location.MALL);

    System.out.println(ned.toString());
    System.out.println(otto.toString());
    System.out.println(moe.toString());

    Car car = new Car("ABC987", Location.TRAINSTATION);
    car.addDriver(moe);
    System.out.println("this");
    System.out.println(car.getListOfPassengerNames());
    car.startEngine();



  }
}
