package FilingStrings;

import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
        try {
            File myobj = new File("filename.txt");
            if (myobj.createNewFile()) {
                System.out.println("File created: " + myobj.getName());
            } else {
                System.out.println("File Already exist ");
            }
        } catch (IOException e) {
            System.out.println("ERROR! ");
            e.printStackTrace();
        }
    }
}
