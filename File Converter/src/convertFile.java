import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.util.Scanner;

public class convertFile {
    public static Scanner scanner = new Scanner (System.in);

    public static void fileConvertion() {

        String infiletype, outfiletype;
        int choice;
        do {

            System.out.println ("\n" +
                    "File Conversion Menu\n" +
                    "1) PDF to Text\n" +
                    "2) Text to PDF\n" +
                    "3) JPG to PNG\n" +
                    "4) PNG to JPG\n" +
                    "5) Text to CSV\n" +
                    "6) CSV to Text\n" +
                    "7) Exit");
            System.out.print ("Select any option: ");
            choice = scanner.nextInt ();

            System.out.print ("Input File type ");
            infiletype = scanner.nextLine ();
            System.out.print ("Output File type ");
            outfiletype = scanner.nextLine ();

            if (infiletype.equalsIgnoreCase ("pdf") && outfiletype.equalsIgnoreCase ("txt")){

                pdfTOtxt ();
                break;
            } else if (infiletype.equalsIgnoreCase ("txt") && outfiletype.equalsIgnoreCase ("pdf")) {
                txtTOpdf ();
                break;
            }else if (infiletype.equalsIgnoreCase ("jpg") && outfiletype.equalsIgnoreCase ("png")) {
                jpgTOpng ();
                break;
            }else if (infiletype.equalsIgnoreCase ("png") && outfiletype.equalsIgnoreCase ("jpg")) {
                pngTOjpg ();
                break;
            }else if (infiletype.equalsIgnoreCase ("txt") && outfiletype.equalsIgnoreCase ("csv")) {
                txtTOcsv ();
                break;
            }else if (infiletype.equalsIgnoreCase ("csv") && outfiletype.equalsIgnoreCase ("txt")) {
                csvTOtxt ();
                break;
            }


        } while (choice != 7);


    }

    public static void main(String[] args) {
        System.out.println ("Converting File ");
        fileConvertion ();
    }

    private static void pdfTOtxt() {
        System.out.println ("PDF to Text Conversion ");
        String inputfile = "";
        String outputfile = "";
        try {
            File pdfFile = new File (inputfile);
            PDDocument document = PDDocument.load(pdfFile);
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }

    private static void txtTOpdf() {
        System.out.println ("Text to PDF Conversion ");
    }

    private static void jpgTOpng() {
        System.out.println ("JPG to PNG Conversion ");
    }

    private static void pngTOjpg() {
        System.out.println ("PNG to JPG Conversion ");
    }

    private static void txtTOcsv() {
        System.out.println ("TEXT to CSV Conversion ");
    }

    private static void csvTOtxt() {
        System.out.println ("CSV to Text Conversion ");
    }
}