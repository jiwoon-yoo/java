package yourturn2complete;

public abstract class Member {
    private String name;
    private String email;
    protected MemberStatus memberStatus;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public abstract String getEmployeeScriptForMemberPickup();
   
}
