import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) {
        String fileName = "D:\\JAVA\\GuviCoding\\src\\Test.txt";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        }
    }
}
