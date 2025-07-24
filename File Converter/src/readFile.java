import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static Scanner scanner = new Scanner(System.in);

    public static void fileRead() {
        String path;
        System.out.print("Enter File Name (e.g., notes.txt): ");
        String fname = scanner.nextLine();

        System.out.print("Do you want to specify the path for the file (Y/N): ");
        String want = scanner.nextLine();

        if (want.equalsIgnoreCase("Y")) {
            System.out.print("Enter the path for reading the file: ");
            path = scanner.nextLine();
        } else {
            path = "."; // current directory
        }

        File file = new File(path, fname); // Correct path + file construction

        if (!file.exists()) {
            System.out.println("The file does not exist at: " + file.getAbsolutePath());
            return;
        }

        try (Scanner myReader = new Scanner(file)) { // Auto-close with try-with-resources
            System.out.println("\nContent from " + file.getAbsolutePath() + ":\n");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Reading from the file");
        fileRead();
    }
}
