import java.util.Scanner;

public class StringK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] arr = s.split(" ");
        String str = arr[0];
        int k = Integer.parseInt(arr[1]);
        for(int i=1;i<str.length();i++){

            char ch = Character.toUpperCase(str.charAt(k*i));

        }






    }
}
