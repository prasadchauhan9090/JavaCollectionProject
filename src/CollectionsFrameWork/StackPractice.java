package CollectionsFrameWork;

import java.util.Stack;

public class StackPractice {


    public static void main(String args[])
    {


        Stack<String> books = new Stack<>();

        books.push("RED");
        books.add("BLACK");
        books.add(0, "White");


        //REMOVE METHOD
       // books.remove(0);

        //updatING METHOD IN STACK
        books.set(0,"PINK");

        //remove method
       // books.clear();

        //verification wether the elements present in the stack or not
        System.out.println(books.contains("PINK"));


        try {
            //retrival method
            System.out.println(books.get(5));
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }




        System.out.println(books);



        //EXACT STACK METHODS ARE
        //1 PUSH
        // 2 POP
        // 3 PEEK
        // 4 SEARCH








    }

}
