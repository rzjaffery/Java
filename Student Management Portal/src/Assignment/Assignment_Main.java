package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment_Main {

    private static final String Assignment_folder = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing\\Assignments";

    public void createAssignment(Scanner sc) {
        System.out.print ("Enter subject file name (e.g. oop_questions.txt): ");
        String filePath = sc.nextLine ();

        File file = new File (filePath);
        if (!file.exists ()) {
            System.out.println ("The file does not exist. Please check the path.");
            return;
        }

        System.out.print ("Enter number of questions for the assignment: ");
        int numQuestions;
        try {
            numQuestions = Integer.parseInt (sc.nextLine ());
        } catch (NumberFormatException e) {
            System.out.println ("Invalid number. Try again.");
            return;
        }

        System.out.print ("Enter output file name (e.g. assignment1.txt): ");
        String outputFilename = sc.nextLine ();
        ensureFolderExists ();

        List<String> questions = readQuestions (filePath);
        if (questions.isEmpty ()) {
            System.out.println ("No questions found in file.");
            return;
        }

        List<String> selectedQuestions = getRandomQuestions (questions, numQuestions);
        writeAssignment (selectedQuestions, outputFilename);
    }

    private static void ensureFolderExists() {
        File Folder = new File (Assignment_folder);
        if (!Folder.exists ()) {
            Folder.mkdir ();
            System.out.println (Assignment_folder + " folder is created ");
        }
    }

    private static List<String> readQuestions(String filePath) {
        List<String> questions = new ArrayList<> ();
        try (Scanner scanner = new Scanner (new File (filePath))) {
            while (scanner.hasNextLine ()) {
                String line = scanner.nextLine ().trim ();
                if (!line.isEmpty ()) {
                    questions.add (line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println ("File not found.");
        }
        return questions;
    }

    private static List<String> getRandomQuestions(List<String> questions, int count) {
        Collections.shuffle (questions);
        return questions.subList (0, Math.min (count, questions.size ()));
    }

    private static void writeAssignment(List<String> questions, String outputFile) {
        try (FileWriter writer = new FileWriter (outputFile)) {
            writer.write ("=========== Assignment ===========\n\n");
            for (int i = 0; i < questions.size (); i++) {
                writer.write ((i + 1) + ". " + questions.get (i) + "\n");
            }
            System.out.println ("Assignment written to file: " + outputFile);
        } catch (IOException e) {
            System.out.println ("Failed to write to file.");
        }
    }

    public void editAssignment(Scanner sc) {
        ensureFolderExists ();
        System.out.println ("=============Edit Assignment=============");

        System.out.print ("Enter the assignment file to make changes (e.g assignment1.txt) ");
        String filename = sc.nextLine ();
        File file = new File (Assignment_folder, filename);

        if (!file.exists ()) {
            System.out.println (file.getName () + " does not exist ");
            return;
        }

        List<String> questions = new ArrayList<> ();

        try (Scanner reader = new Scanner (file)) {
            while (reader.hasNextLine ()) {
                String line = reader.nextLine ().trim ();
                if (!line.isEmpty () && Character.isDigit (line.charAt (0))) {
                    int idx = line.indexOf (")");
                    if (idx != -1 && idx + 1 < line.length ()) {
                        questions.add (line.substring (idx + 1).trim ());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println ("Failed to read the file.");
            return;
        }

        for (int i = 0; i < questions.size (); i++) {
            System.out.println ((i + 1) + ") " + questions.get (i));
        }

        System.out.println ("\nEdit Options:");
        System.out.println ("1. Replace a question");
        System.out.println ("2. Add a new question");
        System.out.println ("3. Delete a question");
        System.out.print ("Choose an option: ");
        int choice = Integer.parseInt (sc.nextLine ());

        switch (choice) {
            case 1 -> {
                System.out.print ("Enter question number to replace: ");
                int qnum = Integer.parseInt (sc.nextLine ()) - 1;
                if (qnum > 1 && qnum < questions.size ()) {
                    System.out.println ("Enter the questions: ");
                    String newQ = sc.nextLine ();
                    questions.set (qnum, newQ);
                }
            }
            case 2 -> {
                System.out.println ("Enter a new questions: ");
                String newQ = sc.nextLine ();
                questions.add (newQ);
            }
            case 3 -> {
                System.out.print ("Enter question number to delete: ");
                int qnum = Integer.parseInt (sc.nextLine ()) - 1;
                if (qnum > 1 && qnum < questions.size ()) {
                    questions.remove (qnum);
                }
            }
            default -> System.out.println ("Invalid Case ");
        }
        try (FileWriter writer = new FileWriter (file)) {
            writer.write ("=========== Assignment ===========\n\n");
            for (int i = 0; i < questions.size (); i++) {
                writer.write ((i + 1) + ") " + questions.get (i) + "\n");
            }
            System.out.println ("Assignment updated successfully.");
        } catch (IOException e) {
            System.out.println ("Failed to write to file.");
        }
    }

    public void removeAssignment(Scanner sc) {
        ensureFolderExists ();
        System.out.println ("=============Remove Assignment=============");

        System.out.println ("Enter the file to delete: ");
        String filename = sc.nextLine ();
        File file = new File (Assignment_folder, filename);

        if (file.exists ()) {
            if (file.delete ()) System.out.println (file.getName () + " is removed ");
            else
                System.out.println ("Unable to delete the Assignment ");
        } else
            System.out.println ("File not found !");
    }

}
