package FilingStrings;

import java.io.File;
import java.util.Scanner;

public class quefile4 {
//    4. Check Read and Write Permissions
//
//Write a Java program to check if a file or directory has read and write permissions.

    public static void main(String[] args) {
        System.out.println("Enter the file name or Path for the file to be found ");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();

        File file = new File(find);
        if (file.canWrite() && file.canRead())
            System.out.println(file.getName() + " can Write & Read");
        else
            System.out.println(file.getName() + " cannot Write & Read");


    }
}
