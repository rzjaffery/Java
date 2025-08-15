package FilingStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class rwFile {
    public static void readFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name to read ");
        String read = scanner.nextLine();
        try {
            File rfile = new File(read);
            Scanner reader = new Scanner(rfile);
            while (reader.hasNextLine()) {
                String context = reader.nextLine();
                System.out.println(context);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
            e.printStackTrace();
        }
    }

    public static void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name to Write ");
        String write = scanner.nextLine();

        try {
            FileWriter wfile = new FileWriter(write,true);
            Scanner writeContext = new Scanner(System.in);
            System.out.println("Enter the text to write in the file " + write);
            String text = writeContext.nextLine();
            wfile.write(text + "\n");
            wfile.close();
            System.out.println("Written in file ");
        }
        catch (IOException e){
            System.out.println("Cannot write in the file " );
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Read/Write Menu =====");
            System.out.println("1) Read from a file");
            System.out.println("2) Write (append) to a file");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            int choice;

            // Validate input to avoid non-integer crashes
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    readFile();
                    break;
                case 2:
                    writeFile();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 0.");
            }
        }
    }
}