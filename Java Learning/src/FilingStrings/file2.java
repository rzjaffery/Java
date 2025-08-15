package FilingStrings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("filename.txt");
            writer.write("This is me Writing in this file \n");
            writer.close();
            System.out.println("Written in the file ");
        }
        catch (IOException e){
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}
