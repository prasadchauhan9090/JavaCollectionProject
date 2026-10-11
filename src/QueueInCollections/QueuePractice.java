package QueueInCollections;

import java.util.PriorityQueue;

public class QueuePractice {


    public static void main(String args[])
    {
       //Declaring the QUEUE
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Adding the queue
        pq.offer(8);
        pq.offer(2);
        pq.offer(5);
        pq.offer(7);
        pq.offer(1);


        System.out.println(pq);


        //retrieval the elements
        System.out.println(pq.peek());
        System.out.println(pq);

        //Removal the queue
        System.out.println(pq.poll());
        System.out.println(pq);


        System.out.println(pq.poll());
        System.out.println(pq);


        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
