package QueueInCollections;

import java.util.ArrayDeque;

public class ArrayDequeu {


    public static void main(String args[])
    {


        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("APPLE");
        adq.addFirst("ORANGE");
        adq.addLast("BANANA");
        adq.offerFirst("CHERRY");
        adq.offerLast("WATERMILON");
        adq.offer("GRAPE");


        for(String ad : adq)
        {
            System.out.print(ad+"  ");
        }


    }
}
