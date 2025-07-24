package View;

import java.io.IOException;
import java.util.Scanner;

public class User_Main_View {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Student Management Portal");

        int choice;
        do {
            System.out.println ("\n" +
                    "1) Student Portal\n" +
                    "2) Teacher Portal\n" +
                    "3) Admin Portal\n" +
                    "0) Exit System");

            System.out.print ("Option: ");
            choice = scanner.nextInt ();
//
            switch (choice){
                case 1-> Student_Model_View.main (new String[]{});
                case 2 -> Teacher_Model_View.main (new String[]{});
                case 3-> Admin_Model_View.main (new String[]{});
                case 0 -> {
                    System.out.println ("Exiting...");
                    return;
                }
                default -> System.out.println ("Invalid choice!");
            }

        } while (choice != 4);
    }
}
