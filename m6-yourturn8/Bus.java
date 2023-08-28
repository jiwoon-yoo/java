package yourturn8complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Bus extends Vehicle {

    public Bus(String licensePlate, Location location) {
        super(licensePlate, location);
    }

    @Override
    public void honk() {
        System.out.println("BUS: " + getLicensePlate() + " is honking... AHHWWOOOGGGAAAA!");
    }

    public void addDriver(Driver driver) throws Exception {
        if (driver.getLicenseType() != LicenseType.BUS) {
            throw new Exception("Need to have a BUS license to operate a BUS");
        }
        super.addDriver(driver);
    }

    public void addPassengerToVehicle(Person passenger) throws Exception {
        if (getPassengers().size() > 20) {
            throw new Exception("Bus is full.  No room for more passengers");
        }
        super.addPassengerToVehicle(passenger);
    }

    @Override
    public String driveTo(Location destination) throws Exception {
        if (this.getDriver() == null) {
            throw new Exception("There is no driver!  Can't drive this vehicle");
        }
        if (this.getDriver().getLicenseType() != LicenseType.BUS) {
            throw new Exception("The driver does not have the correct license type to drive this vehicle");
        }
        return super.driveTo(destination);
    }

}
