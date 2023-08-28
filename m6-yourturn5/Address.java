package yourturn5complete;

/** *************************************************
 * Type your name here:
 ************************************************** */
public class Address
{
   /*
    * Address contains:
    * - three private String instance variables called streetAddress, city, and postalCode
    * - a constructor that accepts three Strings that are used to set streetAddress and city and postalCode instance variables
    * - getters and setters for all instance variables
    */
   private String streetAddress;
   private String city;
   private String postalCode;

   public Address (String streetAddress, String city, String postalCode)
   {
      this.streetAddress = streetAddress;
      this.city = city;
      this.postalCode = postalCode;
   }

   public String getStreetAddress ()
   {
      return streetAddress;
   }

   public void setStreetAddress (String streetAddress)
   {
      this.streetAddress = streetAddress;
   }

   public String getCity ()
   {
      return city;
   }

   public void setCity (String city)
   {
      this.city = city;
   }

   public String getPostalCode ()
   {
      return postalCode;
   }

   public void setPostalCode (String postalCode)
   {
      this.postalCode = postalCode;
   }




}
