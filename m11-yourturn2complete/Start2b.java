package yourturn2complete;

public class Start2b {
    public static void main (String [] args)
    {
        RentalEngine rental = new RentalEngine();
        rental.addMemberToQueue(new RegularMember("Bart", "bart@cromulus.com"));
        rental.addMemberToQueue(new RegularMember("Lisa", "lisa@cromulus.com"));
        rental.addMemberToQueue(new PlatinumMember("Ralph", "ralph@cromulus.com"));
        rental.addMemberToQueue(new RegularMember("Millhouse", "millhouse@cromulus.com"));

        System.out.println(rental.getNextMemberInQueue().getEmployeeScriptForMemberPickup());
        System.out.println(rental.getNextMemberInQueue().getEmployeeScriptForMemberPickup());
        System.out.println(rental.getNextMemberInQueue().getEmployeeScriptForMemberPickup());
        System.out.println (rental.getNextMemberInQueue().getEmployeeScriptForMemberPickup());


    }
}
