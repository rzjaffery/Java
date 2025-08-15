package FilingStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quefile5 {
//    5. Check File or Directory
//
//Write a Java program to check if the given pathname is a directory or a file.

    public static void main(String[] args) {
        System.out.println("Enter the file name or Path for the file to be found ");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();

        File file = new File(find);

        if (file.isDirectory())
            System.out.println(file.getName() + " is a directory ");
        else if (file.isFile()) {
            System.out.println(file.getName() + " is a file ");
        }

    }
}
