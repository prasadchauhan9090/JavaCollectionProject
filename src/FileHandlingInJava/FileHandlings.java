package FileHandlingInJava;

import java.io.File;
import java.io.IOException;

public class FileHandlings {


    public static void main(String args[]) throws IOException
    {
        File file = new File("C:\\Users\\prasa\\OneDrive\\Documents\\JAVA DEMO 2026\\resume.txt");


      System.out.println(file.delete());
      System.out.println(file.createNewFile());


    }

}
