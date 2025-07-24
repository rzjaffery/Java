import java.awt.*;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int choice;
        do {
            System.out.println ("\n" +
                    "File Converter Menu\n" +
                    "1) Create File\n" +
                    "2) Edit File\n" +
                    "3) Read File\n" +
                    "4) Convert File\n" +
                    "5) Detail of File\n" +
                    "6) Delete File\n" +
                    "7) Exit    ");
            System.out.print ("Choice: ");
            choice = scn.nextInt ();

            switch (choice) {
                case 1 -> System.out.println ("Creating a file...");
                case 2 -> System.out.println ("Edit a file...");
                case 3 -> System.out.println ("Read from a file...");
                case 4 -> System.out.println ("Convert a file...");
                case 5 -> System.out.println ("Detail of Files are ");
                case 6 -> System.out.println ("Delete File ");
                case 7 -> System.out.println ("Exiting...");
                default -> System.out.println ("Invalid choice. Please try again.");
            }

        } while (choice != 7);

    }
}