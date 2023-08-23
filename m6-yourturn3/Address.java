package yourturn3complete;
/***************************************************
 * @Rich Smith - ZenOfProgramming.com *
 ***************************************************/
public class Address 
{
    protected String streetAddress;
    protected String city;
    protected String postalCode;

    public Address(String address, String city, String postalCode)
    {
        this.streetAddress = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getAddress()
    {
        return streetAddress;
    }

    public void setAddress(String address)
    {
        this.streetAddress = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
    
    @Override
    public String toString ()
    {
        String returnValue= this.streetAddress+",\n"+this.city+"\n"+this.postalCode;
        return returnValue;
    }
}
