import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean res = (a+b>c)&&(b+c>a)&&(a+c>b);
        if(res){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
