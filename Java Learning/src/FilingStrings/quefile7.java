package FilingStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class quefile7 {
    public static void viewLog() {
        File logFile = new File("file_log.txt");
        if (!logFile.exists()) {
            System.out.println("No log found yet.");
            return;
        }

        System.out.println("\n===== File/Directory Action Log =====");
        try (Scanner logReader = new Scanner(logFile)) {
            while (logReader.hasNextLine()) {
                System.out.println(logReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the log file.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== File Handling Menu =====");
            System.out.println("1) Create File/Directory");
            System.out.println("2) Read/Write in File");
            System.out.println("3) Delete File/Directory");
            System.out.println("4) View Action Log");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            int option;

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("Create option selected.");
                    createFile.main(new String[]{});
                    break;
                case 2:
                    System.out.println("Read/Write option selected.");
                    rwFile.main(new String[]{});
                    break;
                case 3:
                    System.out.println("🗑Delete option selected.");
                    deleteFile.main(new String[]{});
                    break;
                case 4:
                    viewLog();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 0–4.");
            }
        }
    }
}
