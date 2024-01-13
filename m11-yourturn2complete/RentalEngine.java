package yourturn2complete;

import java.util.LinkedList;
import java.util.Queue;

public class RentalEngine {
    private Queue<Member> platinumQueue = new LinkedList<>();
    private Queue<Member> regularQueue = new LinkedList<>();


    public boolean addMemberToQueue (Member member)
    {
        if (member.getMemberStatus() == MemberStatus.PLATINUM) {
            return platinumQueue.add(member);
        } else {
            return regularQueue.add(member);
        }
    }
    
    public Member getNextMemberInQueue()
    {
        if (!platinumQueue.isEmpty()) {
            return platinumQueue.poll();
        }
        return regularQueue.poll();
    }

    

}
