import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class circularArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String user = obj.nextLine();
        int[] intArray = Stream.of(user.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intArray);
        System.out.println(intArray[0]);
    }



}
