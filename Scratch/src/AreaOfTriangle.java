import java.util.Scanner;
import java.util.stream.Stream;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int [] arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();

            double area = (0.5*(arr[0]*arr[1]));
        System.out.println(area);




    }
}
