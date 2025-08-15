package FilingStrings;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createFile {

    public static void creatingFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String str = scanner.nextLine();

        File file = new File(str);
        try {
            if (file.createNewFile()) {
                System.out.println("File '" + file.getName() + "' is created.");
                fileLogger.logAction("Created file", file.getAbsolutePath());
            }
            else {
                System.out.println("⚠ File '" + file.getName() + "' already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public static void creatingDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory name: ");
        String str = scanner.nextLine();

        File dir = new File(str);
        if (dir.mkdir()) {
            System.out.println("✅ Directory '" + dir.getName() + "' is created.");
            fileLogger.logAction("Created directory", dir.getAbsolutePath());
        }
        else {
            System.out.println("⚠️ Directory already exists or couldn't be created.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== File/Directory Creation Menu =====");
            System.out.println("1) Create Directory");
            System.out.println("2) Create File");
            System.out.println("0) Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice;

            // Fix input bug when mixing nextInt() and nextLine()
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("📁 Creating a directory...");
                    creatingDirectory();
                    break;
                case 2:
                    System.out.println("📄 Creating a file...");
                    creatingFile();
                    break;
                case 0:
                    System.out.println("👈 Returning to main menu...");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please enter 0, 1, or 2.");
            }
        }
    }
}
