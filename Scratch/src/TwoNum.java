import java.util.Scanner;

public class TwoNum {


        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);
            String userInput = obj.nextLine();
            String [] arr = userInput.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println((a>b)?b:a);


        }


}
