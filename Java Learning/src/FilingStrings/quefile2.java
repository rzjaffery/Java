package FilingStrings;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class quefile2 {
    //    2. Get Files by Extension
//
//Write a Java program to get specific files with extensions from a specified folder.
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the complete file path which you want to read ");
        String path = read.nextLine();
        File file = new File(path);
        try {

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error file not found");
            e.printStackTrace();
        }
    }
}
