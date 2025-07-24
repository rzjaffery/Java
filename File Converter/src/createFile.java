import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createFile {
    public static Scanner scanner = new Scanner (System.in);

    private static void fileCreate() {
        String path = null;
        System.out.print ("Enter File Name: ");
        String fname = scanner.nextLine ();

        System.out.print ("Do you want to specify the path for the file (Y/N): ");
        String want = scanner.nextLine ().toUpperCase ();

        if (want.equals ("Y")) {
            System.out.print ("Enter the path to store the file: ");
            path = scanner.nextLine ();
        }else {
            path = "."; // current directory
        }

            try {
                assert path != null;
                File file = new File (path, fname);
                if (file.createNewFile ()) System.out.println ("File " + fname + " is created ");
                else System.out.println ("File Already Exist");
            } catch (IOException e) {
                throw new RuntimeException (e);
            }

    }

    public static void main(String[] args) {
        System.out.println ("Creating a File option selected ");
        fileCreate ();
    }
}
