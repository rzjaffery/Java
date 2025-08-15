package FilingStrings;

import java.io.File;
import java.util.Scanner;

public class quefile3 {
//    3. Check Path Exists
//
//Write a Java program to check if a file or directory specified by pathname exists or not.

    public static void main(String[] args) {
        System.out.println("Enter the file name or Path for the file to be found ");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();

        File file = new File(find);

        if (file.exists()){
            System.out.println("File found in the respective path: "+file.getPath());
            System.out.println("Filename is "+file.getName());
        }
        else {
            System.out.println("File cannot be found ");
        }
    }
}
