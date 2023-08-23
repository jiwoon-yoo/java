package yourturn3complete;



/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public abstract class Person 
{
    protected String name;
    protected Address address;

    public Person(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
    
    public void eat ()
    {
        System.out.println (name+ " is eating...Yumm!");
    }
    
    public abstract void doWork ();
    
}
