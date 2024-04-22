import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            main steps for pattern.
            pattern achieve using nested loops
        1.  Outer loops is for no.of lines
        2.  inner loops is for columns
        3.  whatever printing, print inside the inner for loop
        4.  Observe symmetry, for possible pattern

         */
        Scanner s = new Scanner(System.in);
        Main.pattern6(s.nextInt());



    }
    public static void pattern1(int num){

        for(int i =1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==num){
                    System.out.print("*");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
    public static void pattern2(int num){

        for(int i =1;i<=num;i++){
            for(int j=num-i;j>=0;j--){
                    System.out.print("* ");
            }
            System.out.println();
        }


    }


    public static void pattern3(int num){

        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
    public static void pattern4(int num){

        for(int i =1;i<=num;i++){

            for(int j=i;j<=num;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void pattern5(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

        public static void pattern6(int num){

            for (int i = 1; i < num; i++) {
                for(int j=i;j<=num;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
            for (int i = 1; i <= num; i++) {
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<=num;j++){
                    System.out.print("* ");
                }

                System.out.println();
            }






        }








}