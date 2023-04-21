package JavaIO;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void scannerFromFile() {
        try {
            java.io.File file = new java.io.File("scores.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastname = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + mi + " " + lastname + " " + score);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
