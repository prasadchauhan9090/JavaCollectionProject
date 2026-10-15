package FileHandlingInJava;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RelativePAthInJava {


    public static void main(String args[]) throws IOException {
        File file = new File("./Resources/Test");



        //Printing list of files in the curret java project

        File f = new File("C:\\Users\\prasa\\IdeaProjects\\JavaCollectionProject");

        System.out.println(Arrays.toString(file.list()));

        System.out.println(Arrays.toString(f.listFiles()));

        System.out.println("ABSOLUTE PATH  "+file.getAbsolutePath());

        System.out.println(file.getParent());
        File f1 = new File(file.getParent()+"/resume.docx");
        f1.createNewFile();

        //folder creation
    //   System.out.println("FOLDER CREATED SUCCESSFULLY: " + file.mkdirs());

//        if(file.exists())
//            file.delete();
//      System.out.println(file.exists());







        //create and delete in the existing folder
//        if(file.exists())
//            file.delete();
//          System.out.println(file.createNewFile());



    }
}
