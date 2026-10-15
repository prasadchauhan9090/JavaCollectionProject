package SetInCollectionsFrameWork;

import java.util.TreeSet;

public class TreeSetPrecticeDemo {


    public static void main(String args[])
    {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(102);
        ts.add(5);
        ts.add(22);
        ts.add(34);
        ts.add(42);
        ts.add(56);
        ts.add(78);
        ts.add(90);
        ts.add(91);

        System.out.println(ts);


        System.out.println(ts.subSet(5,92).remove(22));
        System.out.println(ts);





        System.out.println("=================");

        System.out.println("FIRST ELEMENT IN THE TREE SET IS  "+ts.first());
        System.out.println("LAST ELEMENT IN THE TREE SET IS   "+ts.last());


        System.out.println("=================");

        System.out.println("REMOVE THE FIST ELEMENT BY POLLFIRST  "+ts.pollFirst());
        System.out.println("REMOVE LAST ELEMENT IN THE TREE BY USING POLLLAST   "+ts.pollLast());


        System.out.println("=================");

        for(Integer i : ts)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("=================");

        System.out.println("FIRST ELEMENT IN THE TREE SET IS  "+ts.first());
        System.out.println("LAST ELEMENT IN THE TREE SET IS   "+ts.last());


        System.out.println("===============");



    }
}
