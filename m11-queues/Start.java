package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Start {
    public static void main (String [] args)
    {
        Queue<String> myQueue = new PriorityQueue<String>();
        myQueue.offer("zzz");
        myQueue.offer("hhh");
        myQueue.offer("aaa");
        myQueue.offer("bbb");

        while (!myQueue.isEmpty()) {
            System.out.println (myQueue.poll());
        }
       
    }
}
