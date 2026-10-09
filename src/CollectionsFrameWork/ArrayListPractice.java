package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {



        public static void main(String args[]) {


            Integer[] ar  = new Integer[] {100,200,300};

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(ar));

        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        al1.add(6);
        al1.add(7);
        al1.add(8);
        al1.add(9);
       // al1.add(0, 10);

    System.out.println(al1);


    System.out.println("====RETRIVAL METHOD==========");
    System.out.println(al1.get(5));

            System.out.println("====DELETION METHOD==========");
            System.out.println(al1.remove(5));

            System.out.println("====CONTAINS METHOD==========");
            System.out.println(al1.contains(5));

            System.out.println("====CONTAINS METHOD==========");
            System.out.println(al1.set(5, 3));

            System.out.println("====SIZE METHOD==========");
            System.out.println(al1.size());

            System.out.println("====ISEMAPTY METHOD==========");
            System.out.println(al1.isEmpty());


            System.out.println("====values repatation using for loop==========");
            for(int i=0;i<al1.size();i++)
            {
                System.out.print(al1.get(i)+"  ");
            }

            System.out.println();


            System.out.println("====AFTER CHANGES==========");
            System.out.println(al1);



    }
}