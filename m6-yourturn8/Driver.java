package yourturn8complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Driver extends Person {
    private LicenseType licenseType;

    public Driver(String name, Location location, LicenseType licenseType, int age) throws Exception {
        super(name, location);
        this.licenseType = licenseType;
        if (age < 16) {
            throw new Exception("You must be at least 16 to be a driver");
        }
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    @Override
    public String toString() {
        return this.getName() + " is a " + licenseType + " driver and is at:" + this.getLocation();
    }
}
