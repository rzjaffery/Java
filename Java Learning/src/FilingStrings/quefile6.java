package FilingStrings;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class quefile6 {

    public static void main(String[] args) {
        System.out.println("Enter the file name or Path for the file to be found ");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();

        File file = new File(find);
        Date d1 = new Date(file.lastModified());

//        Get File Last Modified Date
        System.out.println(file.getName() + " Last modified " + d1);

//        Get File Size
        System.out.println(file.getName() + " Size is " + file.length() + " bytes ");

    }
}
