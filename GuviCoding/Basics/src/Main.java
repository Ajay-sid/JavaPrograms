import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] arr = sc.nextLine().split(" ");
        int l = Integer.parseInt(arr[0]);
        int r = Integer.parseInt(arr[1]);

        if(n>l&&n<r){
            System.out.println("yes");
        }

    }
}