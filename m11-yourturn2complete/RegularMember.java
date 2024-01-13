package yourturn2complete;

public class RegularMember extends Member {

    public RegularMember(String name, String email) {
        super(name, email);
        this.memberStatus = MemberStatus.REGULAR;
    }

    @Override
    public String getEmployeeScriptForMemberPickup() {
        return this.getName()
                + ":  You'll find your car is somewhere out in the parking lot.  Don't let the door hit you on the way out.";
    }
    
}
