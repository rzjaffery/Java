package View;

import Admin.Admin_Filing;

import java.util.Scanner;

public class Admin_Filing_View {
    public void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Admin_Filing af = new Admin_Filing ();
        int choice;

        System.out.println ("======= Admin File Management =======");

        while (true) {
            System.out.println ("\nSelect an option:");
            System.out.println ("1) Create File");
            System.out.println ("2) Edit File");
            System.out.println ("3) Read File");
            System.out.println ("4) Delete File");
            System.out.println ("0) Exit");
            System.out.print ("Choice: ");

            while (!scanner.hasNextInt ()) {
                System.out.print ("Please enter a valid number: ");
                scanner.next (); // Clear invalid input
            }
            choice = scanner.nextInt ();
            scanner.nextLine (); // Clear newline

            switch (choice) {
                case 1 -> af.createFile ();
                case 2 -> af.editFile ();
                case 3 -> af.readFile ();
                case 4 -> af.deleteFile ();
                case 0 -> {
                    System.out.println ("Exiting Admin File Management. Goodbye!");
                    return;
                }
                default -> System.out.println ("Invalid choice. Please try again.");
            }
        }
    }
}
