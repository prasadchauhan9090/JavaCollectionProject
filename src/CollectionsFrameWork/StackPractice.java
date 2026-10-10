package CollectionsFrameWork;

import java.util.Stack;

public class StackPractice {


    public static void main(String args[])
    {


        Stack<String> books = new Stack<>();

      /*  books.push("RED");
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




        System.out.println(books); */



        //ABOVE ARE VECTOR METHODS ARE ALSO APPLICABLE IN THE STACK

        //EXACT STACK METHODS ARE
        //1 PUSH -> ADD
        // 2 POP -> REMOVE AT LAST ELEMENTS
        // 3 PEEK -> TO CHECK OR TO SEE WHAT IS THE ELEMENT IN THE LAST ONE
        // 4 SEARCH --> TO CHECK OT VERIFY THE ELEMENTS PRESENT OR NOT






        books.push("RED");
        books.push("BLACK");
        books.push("White");

        // 3 PEEK -> TO CHECK OR TO SEE WHAT IS THE ELEMENT IN THE LAST ONE
        System.out.println(books.peek());

        System.out.println(books);

        // 2 POP -> REMOVE AT LAST ELEMENTS
//        System.out.println(books.pop());
//        System.out.println(books);


        // 4 SEARCH --> TO CHECK OT VERIFY THE ELEMENTS PRESENT OR NOT
        System.out.println(books.search("RED"));







    }

}
