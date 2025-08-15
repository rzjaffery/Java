package FilingStrings;

import java.io.File;
import java.util.Scanner;

public class deleteFile {

    public static void deletefile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name or full path to delete: ");
        String filename = scanner.nextLine();

        File dfile = new File(filename);
        if (dfile.exists() && dfile.isFile()) {
            if (dfile.delete()) {
                System.out.println("File '" + dfile.getName() + "' deleted successfully.");
                fileLogger.logAction("Deleted file", dfile.getAbsolutePath());
            } else {
                System.out.println("Failed to delete file '" + dfile.getName() + "'.");
            }
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }

    public static void deleteDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path to delete: ");
        String directoryName = scanner.nextLine();

        File dir = new File(directoryName);
        if (dir.exists() && dir.isDirectory()) {
            if (dir.list().length > 0) {
                System.out.println("Directory is not empty. Cannot delete without recursion.");
            } else {
                if (dir.delete()) {
                    System.out.println("Directory '" + dir.getName() + "' deleted successfully.");
                    fileLogger.logAction("Deleted directory", dir.getAbsolutePath());
                } else {
                    System.out.println("Failed to delete directory '" + dir.getName() + "'.");
                }
            }
        } else {
            System.out.println("Directory does not exist or is not valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Delete Menu =====");
            System.out.println("1) Delete File");
            System.out.println("2) Delete Directory (must be empty)");
            System.out.println("0) Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice;

            // Input validation
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("🗑Deleting file...");
                    deletefile();
                    break;
                case 2:
                    System.out.println("Deleting directory...");
                    deleteDirectory();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
            }
        }
    }
}
