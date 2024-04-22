import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n ="";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            n = ch+n;

        }
        String fl = n.substring(0,1).toUpperCase()+n.substring(1);
        System.out.println(fl);
    }
}