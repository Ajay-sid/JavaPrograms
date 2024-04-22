import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean res = (a*a)+(b*b)== c*c;
        if(res){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
