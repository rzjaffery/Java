package FilingStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class file3 {
    public static void main(String[] args) {
        try {
            File myobj = new File("filname.txt");
            Scanner reader = new Scanner(myobj);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("Error! ");
            e.printStackTrace();
        }
    }
}
