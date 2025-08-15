package FilingStrings;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class fileLogger {
    public static void logAction(String action, String target) {
        try (FileWriter log = new FileWriter("file_log.txt", true)) {
            String entry = LocalDateTime.now() + " - " + action + ": " + target + "\n";
            log.write(entry);
        } catch (IOException e) {
            System.out.println("Unable to write log.");
        }
    }
}
