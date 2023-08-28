package yourturn8complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Car extends Vehicle {
  

    public Car(String licensePlate, Location location) {
        super(licensePlate, location);
    }

    @Override
    public void honk() {
        System.out.println("BUS: "+getLicensePlate()+" is honking... Beep Beep!");
    }

    public void addDriver(Driver driver) throws Exception
    {
        if (driver.getLicenseType() != LicenseType.BUS&& driver.getLicenseType()!=LicenseType.CAR) {
            throw new Exception("Need to have a CAR or BUS  license to operate a CAR");
        }
       super.addDriver(driver);
    }

    public void addPassengerToVehicle(Person passenger) throws Exception {
        if (getPassengers().size() > 4) {
            throw new Exception("Bus is full.  No room for more passengers");
        }
        super.addPassengerToVehicle(passenger);
    }
    
    public void passengerDepart (Person passenger)
    {

    }

    @Override
    public String driveTo(Location destination) throws Exception {
        if (getDriver()==null) {
            throw new Exception ("There is no driver!  Can't drive this vehicle");
        }
        if (getDriver().getLicenseType()!=LicenseType.BUS) {
            throw new Exception("The driver does not have the correct license type to drive this vehicle");
        }
        
        return  super.driveTo(destination);
     }

    
}

