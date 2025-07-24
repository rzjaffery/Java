package Assignment;

import java.io.*;
import java.util.*;

public class Assignment_Generator {

    private static final String Assignment_folder = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing\\Assignments";

    public void createAssignment (Scanner sc) {
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
        File outputfile = new File (Assignment_folder, outputFilename);

        List<String> questions = readQuestions (filePath);
        if (questions.isEmpty ()) {
            System.out.println ("No questions found in file.");
            return;
        }

        List<String> selectedQuestions = getRandomQuestions (questions, numQuestions);
        writeAssignment (selectedQuestions, outputFilename);
    }

    private static void ensureFolderExists () {
        File Folder = new File (Assignment_folder);
        if (!Folder.exists ()) {
            Folder.mkdir ();
            System.out.println (Assignment_folder + " folder is created ");
        }
    }

    private List<String> readQuestions (String filePath) {
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

    private List<String> getRandomQuestions (List<String> questions, int count) {
        Collections.shuffle (questions);
        return questions.subList (0, Math.min (count, questions.size ()));
    }

    private void writeAssignment (List<String> questions, String outputFile) {
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
}
