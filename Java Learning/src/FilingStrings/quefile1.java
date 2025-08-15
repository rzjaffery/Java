package FilingStrings;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class quefile1 {
    //    1. List Files in Directory
//
//Write a Java program to get a list of all file/directory names in the given directory.
    public static void main(String[] args) {
        File file = new File("C:\\Users\\rayyan.jaffery\\OneDrive - Systems Limited\\Java Application Intership\\Java Learning\\src\\MethodsExamples");
        ArrayList<String> fileList = new ArrayList<>(List.of(file.list()));
        for (String i:fileList){
            System.out.println(i);
        }

    }
}
