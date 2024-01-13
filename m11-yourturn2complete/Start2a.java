package yourturn2complete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Start2a {
    public static void main(String[] args) {
        // instantiate two RegularMembers and on PlatinumMembers

        RegularMember member1 = new RegularMember("member1", "email1");
        RegularMember member2 = new RegularMember("member2", "email2");
        PlatinumMember member3 = new PlatinumMember("member3", "email3");

        // add the three members that we just instantiated to an array. What type will
        // we have to make our array in order to add both Regular Members and Platinum
        // Members? ---Member (the parent class)

        // What programming principle allows us to do this? ---Polymorphism

        System.out.println("Array of Members:");
        Member[] arrayMembers = { member1, member2, member3 };

        for (Member member : arrayMembers) {
            System.out.println(member.getEmployeeScriptForMemberPickup());
        }

        //Create an ArrayList and add our members to it.  Now go ahead print out the customer service script for each one in the list
        System.out.println("\nArrayList of Members:");
        ArrayList<Member> arrayListMembers = new ArrayList<Member>();
        arrayListMembers.add(member1);
        arrayListMembers.add(member2);
        arrayListMembers.add(member3);
        for (Member member : arrayListMembers) {
            System.out.println(member.getEmployeeScriptForMemberPickup());
        }

        
        
        
        // Create a stackOfMembers and push our three members into it. How can we
        // retrieve these members in reverse order? Go ahead and do that.

        // It turms out that we could also have used a plain old loop to loop through
        // the elements in the stack and print them out in regular order. How is it we
        // can do that in a Stack? --- Because Stack inherits from Vector which
        // implements List which implements Collections, which implements Iterable

        System.out.println("\nStack of Members:");
        Stack<Member> stackOfMembers = new Stack<>();
        stackOfMembers.push(member1);
        stackOfMembers.push(member2);
        stackOfMembers.push(member3);

        while (!stackOfMembers.isEmpty()) {
            System.out.println(stackOfMembers.pop().getEmployeeScriptForMemberPickup());
        }

        //Create a Queue and add our members to it.  Now go ahead print out the customer service script for each one in the list.
         
        System.out.println("\nQueue of Members:");
        Queue<Member> queueOfMembers = new LinkedList<>();		////
        queueOfMembers.offer(member1);
        queueOfMembers.offer(member2);
        queueOfMembers.offer(member3);

        while (!queueOfMembers.isEmpty()) {
            System.out.println(queueOfMembers.poll().getEmployeeScriptForMemberPickup());
        }
    }
}
