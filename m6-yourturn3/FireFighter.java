package yourturn3complete;
/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public class FireFighter extends Person
{
    public FireFighter(String name, Address address)
    {
        super(name, address);
    }

    @Override
    public void doWork()
    {
        System.out.println(this.name+" is putting out a fire!");
    }
}
