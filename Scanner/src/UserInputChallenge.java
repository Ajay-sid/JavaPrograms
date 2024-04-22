import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int sum=0;
        int count=1;

        do {
            System.out.println("Enter number #" + count);
            try {
                String f1st = sc.nextLine();
                int number = Integer.parseInt(f1st);
                if (isValid(number) > 0) {
                    sum += number;

                }
                count++;
            }catch (NumberFormatException e){
                System.out.println("Enter ontly numbers");
            }

        }while (count<6);
        System.out.println(sum);




    }

    public static int isValid(int num){

        if(num>0)
            return 1;
        else return 1;
    }
    public static String  add(int n,int m){


        return "";
    }

}


