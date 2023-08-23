package yourturn3complete;
/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public class Baker extends Person
{

    public Baker(String name, Address address)
    {
        super(name, address);
    }

    @Override
    public void doWork()
    {
        System.out.println(this.name+ " is baking bread!");    }

}
