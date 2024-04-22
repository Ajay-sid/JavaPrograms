public class GetEvenSum {
    public static void main(String[] args) {
        System.out.println(gerEvenDigitSum(22222));
    }

    public static int gerEvenDigitSum(int number){
        if(number<0){
            return -1;
        }else {

            int sum=0;
            while (number>9){
                int rem = number%10;
                    if(rem%2==0)
                        sum=sum+rem;

                number=number/10;
            }
            if(number%2==0){
                sum=number+sum;
            }

            return sum;

        }




    }



}
