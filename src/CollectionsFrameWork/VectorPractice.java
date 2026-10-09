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

        vc.clear();
        System.out.println(vc);

    }
}
