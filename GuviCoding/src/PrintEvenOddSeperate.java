import java.util.Scanner;

public class PrintEvenOddSeperate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        evenodd(reverse(num));


    }

    static void evenodd(int number) {
        String even ="";
        String odd = "";

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                even = even+" " + digit;
            } else {
                odd = odd + " " + digit;
            }
            number /= 10;
        }
        System.out.println(even);
        System.out.println(odd);
    }

    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }


}
