package yourturn8complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public  class Person
{
    private String name;
    private Location location;

    public Person (String name, Location location)
    {
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
    public void sing (String song)
    {
        System.out.println (this.name+ " is singing '"+song+"' at "+this.location);
    }
    public String toString() {
        return this.getName() +" is at: " + this.getLocation();
    }
}
