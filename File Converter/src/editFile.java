import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class editFile {
    public static Scanner scanner = new Scanner (System.in);
    private static void fileEdit(){
        String path = null;
        System.out.print ("Enter File Name: ");
        String fname = scanner.nextLine ();

        System.out.print ("Do you want to specify the path for the file (Y/N): ");
        String want = scanner.nextLine ();

        if (want.equalsIgnoreCase ("Y") ) {
            System.out.print ("Enter the path for editing the file: ");
            path = scanner.nextLine ();
        }else {
            path = "."; // current directory
        }
        try {
            File file = new File(path, fname);
            if (file.createNewFile()) {
                System.out.println("File created at " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + file.getAbsolutePath());
            }

            System.out.println("Enter text to write into the file (type 'exit' on a new line to finish):");
            FileWriter writer = new FileWriter(fname);
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

    public static void main(String[] args) {
        System.out.println ("Editing File ");
        fileEdit ();

    }
}
