package QueueInCollections;

import java.util.Comparator;
import java.util.PriorityQueue;



public class QueuePractice {


    public static void main(String args[])
    {
       //Declaring the QUEUE
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //Adding the queue
        pq.offer(8);
        pq.offer(2);
        pq.offer(5);
        pq.offer(7);
        pq.offer(1);

        //using for each loop
        for(Integer i : pq)
        {
            System.out.print("  "+i);
        }
        System.out.println();


        System.out.println(pq);


        //retrieval the elements
        System.out.println(pq.peek());
        System.out.println(pq);

        //Removal the queue
//        System.out.println(pq.poll());
//        System.out.println(pq);


//        System.out.println(pq.poll());
//        System.out.println(pq);
//
//
//        System.out.println(pq.poll());
//        System.out.println(pq);


        //checking the number/element present or not present in the queue
        System.out.println("CONTAINSE METHOD GIVING RESULT THE VALUE IS PRESENT OR NOT -----> "+ pq.contains(7) );

        //I want to print exact order so far that we have a option while loop
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll()+"  ");
        }







    }
}
