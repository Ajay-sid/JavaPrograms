import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\FileOperations\\src\\Test.txt");
        try {
            boolean isCreated = file.createNewFile();
            if(isCreated){
                System.out.println("file created");
            }
            else {
                System.out.println("Not Created");
            }
            FileWriter fw = new FileWriter(file);

            fw.write("First Line");
            fw.write("second line");
            fw.close();

        }catch (Exception e ){

        }


    }
}