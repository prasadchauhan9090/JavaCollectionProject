package CollectionsFrameWork;

import java.util.Vector;

public class VectorPractice {


    public static void main(String[] args) {


        Vector vc = new Vector();

        vc.add("LAXMAN");
        vc.add("JAMNI");


        Vector vc2 = new Vector();

        vc2.add("mangi");
        vc2.add("vaani");
        vc2.add("Hanka");


        System.out.println(vc);
        System.out.println(vc2);

        System.out.println("================================");

       /* for(int i=0;i<vc2.size();i++){

            vc.add(vc2.get(i));

        }*/

        System.out.println(vc);

   //adding elements into vc from vc2
        vc.addAll(vc2);

        System.out.println(vc);

   //removing elements from vc
        vc.remove(0);
        System.out.println(vc);

        System.out.println("============removing all method==================");

        vc.removeAll(vc2);
        System.out.println(vc);


        System.out.println("============clear all method==================");

      //  vc.clear();
      //  System.out.println(vc);


        System.out.println("============ VERIFICATION -> (CONTAINS AND CONTAINSALL)to check wether the elements are present in the one vector or in vector 2 ==================");

        System.out.println(vc.contains("JAMNI"));


        System.out.println("===========UPDATE THE ELEMENTS TO UPDATE WE HAVE SET METHOD-------------------");

        vc.add("LAXMAN");
        vc.add("JAMNI");

        System.out.println(vc);

        vc.set(0,"LACHU");

        System.out.println(vc);


        System.out.println("IF WE WANT TO FIND THE INDEX OF ANY ONE OF THE ELEMENTS IN THE LIST WE HAVE vc.indexOf(laxman)");

        System.out.println("INDEX OF THE LIST FOR THIS GIVEN ANY ELEMENT"+vc.indexOf("LACHU"));


        System.out.println(vc.lastElement());
        System.out.println(vc.firstElement());

    }
}
