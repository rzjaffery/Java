package View;

import Assignment.Question_Filing;

import java.util.Scanner;

public class Question_Filing_View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Question_Filing qf = new Question_Filing ();
        int choice;


        System.out.println ("Teacher Question Filing Option ");
        while (true){
            System.out.println ("1) Create Subject Question file");
            System.out.println ("2) Create Subject Question Directory");
            System.out.println ("3) Edit Subject Question file");
            System.out.println ("4) Delete Subject Question file");
            System.out.println ("5) Delete Subject Question Directory");
            System.out.println ("6) Read Subject Question file");
            System.out.println ("0) Exit");

            System.out.print ("Choose option ");
            choice = scanner.nextInt ();

            switch (choice){
                case 1 -> qf.createFile();
                case 2 -> qf.createDirectory();
                case 3 -> qf.editFile();
                case 4 -> qf.deleteFile();
                case 5 -> qf.deleteDirectory();
                case 6 -> qf.readFile();
                case 0 -> {
                    System.out.println ("Exiting...");
                    return;
                }
                default -> System.out.println ("Invalid choice!");

            }

        }

    }
}
