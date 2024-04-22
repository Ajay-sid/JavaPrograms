import java.util.Scanner;

public class ThreeNumbersBet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("enter l and r" );
        String [] arr = sc.nextLine().split(" ");

        if(num>=Integer.parseInt(arr[0])&&num<=Integer.parseInt(arr[1])){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
