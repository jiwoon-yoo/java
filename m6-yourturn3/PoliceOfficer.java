package yourturn3complete;
/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public class PoliceOfficer extends Person   
{

    public PoliceOfficer(String name, Address address)
    {
        super(name, address);
    }

    @Override
    public void doWork()
    {
            System.out.println(this.name+" is protecting the city");
    }

}
