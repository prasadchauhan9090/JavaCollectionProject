package SetInCollectionsFrameWork;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {



    public static void main(String args[])
    {


    Set<Integer> hs = new HashSet<>();


    hs.add(2);
    hs.add(39);
    hs.add(44);
    hs.add(139);
    hs.add(90);
    hs.add(19);


//removal
    System.out.println(hs.remove(19));

//print all data
    System.out.println(hs);


    //check the data present or not
        System.out.println(hs.contains(45));



        //data retrival
        for(Integer elemment: hs)
        {
            System.out.print(elemment + "  ");
        }





    }


}
