package SetInCollectionsFrameWork;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {


    public static void main(String args[])
    {


        LinkedHashSet<Integer> lss = new LinkedHashSet<>();

        lss.add(2);
        lss.add(39);
        lss.add(4);
        lss.add(5);
        lss.add(6);
        lss.add(7);
        lss.add(8);

        System.out.print(lss);


        System.out.print("\n");


     for(Integer i : lss)
     {
         System.out.print(i+" ");
     }



    }
}
