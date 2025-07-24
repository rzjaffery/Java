package Admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin_Filing {

    public void readFile () {
        Scanner scanner = new Scanner (System.in);
        String path;
        System.out.print ("Enter File Name (e.g., notes.txt): ");
        String fname = scanner.nextLine ();

        path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        File file = new File (path, fname); // Correct path + file construction
        System.out.print ("Default Path for the files: " + file.getAbsolutePath ());


        if (!file.exists ()) {
            System.out.println ("The file does not exist at: " + file.getAbsolutePath ());
            return;
        }

        try (Scanner myReader = new Scanner (file)) { // Auto-close with try-with-resources
            System.out.println ("\nContent from " + file.getAbsolutePath () + ":\n");
            while (myReader.hasNextLine ()) {
                String data = myReader.nextLine ();
                System.out.println (data);
            }
        } catch (FileNotFoundException e) {
            System.out.println ("File not found.");
            e.printStackTrace ();
        }
    }

    public void deleteFile () {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the file name or full path to delete: ");
        String filename = scanner.nextLine ();

        File dfile = new File (filename);
        if (dfile.exists () && dfile.isFile ()) {
            if (dfile.delete ()) {
                System.out.println ("File '" + dfile.getName () + "' deleted successfully.");
//                fileLogger.logAction("Deleted file", dfile.getAbsolutePath());
            } else {
                System.out.println ("Failed to delete file '" + dfile.getName () + "'.");
            }
        } else {
            System.out.println ("File does not exist or is not a valid file.");
        }
    }

    public void editFile () {
        Scanner scanner = new Scanner (System.in);
        String path = null;
        System.out.print ("Enter File Name: ");
        String fname = scanner.nextLine ();

        path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";

        try {
            File file = new File (path, fname);
            if (file.createNewFile ()) {
                System.out.println ("File created at " + file.getAbsolutePath ());
            } else {
                System.out.println ("File already exists at " + file.getAbsolutePath ());
            }

            System.out.println ("Enter text to write into the file (type 'exit' on a new line to finish):");
            FileWriter writer = new FileWriter (fname);
            while (true) {
                String line = scanner.nextLine ();
                if (line.equalsIgnoreCase ("exit")) {
                    break;
                }
                writer.write (line + System.lineSeparator ());
            }
            writer.close ();
            System.out.println ("Content written to file successfully.");

        } catch (IOException e) {
            System.err.println ("Error creating/writing to file: " + e.getMessage ());
        }
    }

    public void createFile () {
        Scanner scanner = new Scanner (System.in);
        String path = null;
        System.out.print ("Enter File Name: ");
        String fname = scanner.nextLine ();

        path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";

        try {
            assert path != null;
            File file = new File (path, fname);
            if (file.createNewFile ()) System.out.println ("File " + fname + " is created ");
            else System.out.println ("File Already Exist");
        } catch (IOException e) {
            throw new RuntimeException (e);
        }

    }
}
