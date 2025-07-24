package Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display_Teacher {

    public void verification () {
        Scanner verficationScanner = new Scanner (System.in);

        String path = "C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Documents\\JAVA Projects\\Student Management Portal\\src\\Filing";
        String filename = "teacher.txt";

        File verifyFile = new File (path, filename);
        System.out.println ("=========Verification Process===========");

        System.out.print ("Enter the ID: ");
        int IDcheck = verficationScanner.nextInt ();

        boolean found = false;

        try (Scanner myReader = new Scanner (verifyFile)) {
            while (myReader.hasNextLine ()) {
                String line = myReader.nextLine ();

                // Check if the line contains the ID string
                if (line.contains ("Teacher ID: " + IDcheck + ",")) {
                    System.out.println ("========= Personal Information ===========");
                    System.out.println (line);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println ("Teacher with ID " + IDcheck + " not found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println ("Error: teacher.txt file not found.");
            e.printStackTrace ();
        }
    }

}
