package yourturn2complete;

public class PlatinumMember extends Member{

    public PlatinumMember(String name, String email) {
        super(name, email);
        this.memberStatus = MemberStatus.PLATINUM;
    }

    @Override
    public String getEmployeeScriptForMemberPickup() {
        return this.getName()+":  Our consierge will take you to your car.  Thank you for your business.";
    }
    
}
