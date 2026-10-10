package CollectionsFrameWork;

import java.util.Stack;

public class StackPractice {


    public static void main(String args[])
    {


        Stack<String> books = new Stack<>();

        books.push("RED");
        books.add("BLACK");
        books.add(0, "White");

        //updatING METHOD IN STACK
        books.set(0,"PINK");


        System.out.println(books);


    }

}
