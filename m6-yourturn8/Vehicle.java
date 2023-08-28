package yourturn8complete;

import java.util.ArrayList;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public abstract class Vehicle implements Honkable,
        Drivable {
    private Engine engine;
    private String licensePlate;
    private Location location;
    private Driver driver;
    private ArrayList<Person> passengers = new ArrayList<Person>();

    public Vehicle(String licensePlate, Location location) {
        this.engine = new Engine();
        this.licensePlate = licensePlate;
        this.location = location;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Location getLocation() {
        return location;
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public void startEngine() {
        this.engine.startEngine();
        System.out.println("VRRRrrrooom!");
    }

    public void addDriver(Driver driver) throws Exception {
        if (driver.getLocation() != this.location) {
            throw new Exception("Sorry, driver and bus are not in the same location");
        }
        this.driver = driver;
    }

    public String toString() {
        String returnValue = "Vehicle: " + licensePlate;
        returnValue += (driver == null) ? " has no driver " : "is being driven by " + driver.getName();
        returnValue += " and is currently at " + location;
        return returnValue;
    }

    public String getListOfPassengerNames() {
        if (passengers.size() == 0) {
            return "The vehicle is currently empty of passengers";
        }
        String returnValue = "Passengers: ";
        for (Person passenger : passengers) {
            returnValue += passenger.getName() + ", ";
        }
        return returnValue;
    }

    public void addPassengerToVehicle(Person passenger) throws Exception {
        if (passenger.getLocation() != this.location) {
            throw new Exception(passenger.getName() + " is not at the same location as the vehicle");
        }
        passengers.add(passenger);
        passenger.setLocation(this.location);
    }

    public void passengerDisembarkFromVehicle(Person passenger) throws Exception {
        if (!passengers.contains(passenger)) {
            throw new Exception(passenger.getName() + " isn't on the bus");
        }

        passengers.remove(passenger);
        passenger.setLocation(this.location);
        System.out.println(passenger.getName() + " has disembarked at " + this.location);
    }

    public String driveTo(Location destination) throws Exception {

        if (!this.engine.isEngineRunning()) {
            throw new Exception("The engine is not running.  Vehicle can't drive anywhere");
        }
        String returnValue = "BUS: " + licensePlate + " is departing from " + this.location + "....arriving at "
                + destination;
        this.location = destination;
        driver.setLocation(this.location);
        updatePassengersLocation(destination);
        return returnValue;
    }

    private void updatePassengersLocation(Location location) {
        for (Person passenger : passengers) {
            for (int i = 0; i < passengers.size(); i++) {
                passenger.setLocation(location);
            }
        }
    }
}
