package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_Filing {

    public void createDirectory() {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the path to make the directory: ");
        String path = scn.nextLine ();

        File dir = new File (path);
        if (!dir.exists ()){
            boolean created = dir.mkdir ();
            if (created) {
                System.out.println("Directory created successfully at: " + path);
            } else {
                System.out.println("Failed to create the directory.");
            }
        }else {
            System.out.println("Directory already exists at: " + path);
        }
    }

    public void deleteDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path to delete: ");
        String directoryName = scanner.nextLine();

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";


        File dir = new File(path,directoryName);
        if (dir.exists() && dir.isDirectory()) {
            if (dir.list().length > 0) {
                System.out.println("Directory is not empty. Cannot delete without recursion.");
            } else {
                if (dir.delete()) {
                    System.out.println("Directory '" + dir.getName() + "' deleted successfully.");
//                    fileLogger.logAction("Deleted directory", dir.getAbsolutePath());
                } else {
                    System.out.println("Failed to delete directory '" + dir.getName() + "'.");
                }
            }
        } else {
            System.out.println("Directory does not exist or is not valid.");
        }
    }

    public void readFile() {
        Scanner scanner = new Scanner (System.in);
        String path;
        System.out.print("Enter File Name (e.g., notes.txt): ");
        String fname = scanner.nextLine();

        path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";


        File file = new File(path, fname); // Correct path + file construction

        if (!file.exists()) {
            System.out.println("The file does not exist at: " + file.getAbsolutePath());
            return;
        }

        try (Scanner fileReader = new Scanner(file)) {
            System.out.println("\n===== File Content =====");
            boolean hasContent = false;
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                hasContent = true;
                System.out.println(data);
            }
            if (!hasContent) {
                System.out.println("(File is empty)");
            }
            System.out.println("=========================");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void deleteFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name or full path to delete: ");
        String filename = scanner.nextLine();

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";


        File dfile = new File(path,filename);
        if (dfile.exists() && dfile.isFile()) {
            if (dfile.delete()) {
                System.out.println("File '" + dfile.getName() + "' deleted successfully.");
//                fileLogger.logAction("Deleted file", dfile.getAbsolutePath());
            } else {
                System.out.println("Failed to delete file '" + dfile.getName() + "'.");
            }
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }

    public  void editFile(){
        Scanner scanner = new Scanner (System.in);
        String path = null;
        System.out.print ("Enter File Name: ");
        String fname = scanner.nextLine ();


        path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";

        try {
            File file = new File(path, fname);
            if (file.createNewFile()) {
                System.out.println("File created at " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + file.getAbsolutePath());
            }

            System.out.println("Enter text to write into the file (type 'exit' on a new line to finish):");
            FileWriter writer = new FileWriter(file,true);
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + System.lineSeparator());
            }
            writer.close();
            System.out.println("Content written to file successfully.");

        } catch (IOException e) {
            System.err.println("Error creating/writing to file: " + e.getMessage());
        }
    }

    public void createFile() {
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
