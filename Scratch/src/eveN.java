import java.util.Scanner;

public class eveN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
}
