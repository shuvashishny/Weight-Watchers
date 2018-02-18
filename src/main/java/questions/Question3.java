package questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Shuvashish on 2/15/2018.
 */
public class Question3 {

    private Scanner scanner;

    public boolean doesFileExist(String path){
            File file = new File(path);
        try {
             scanner = new Scanner(file);
            System.out.println("File found and reading...");
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("System cannot find the file specified here: \""+path+"\"");
            return false;
        }
    }

    public void readingFromFile(String path){
        if(doesFileExist(path)){
            while (scanner.hasNextLine()) {
               String string = scanner.nextLine();
               String[] firstSplit= string.split("-");
                String[] secondSplit = firstSplit[1].split(",");
                System.out.println(firstSplit[0]);
                for(int i =0; i<secondSplit.length; i++){
                    System.out.println(secondSplit[i]);
                }
                System.out.println();

            }
        }
    }
}
