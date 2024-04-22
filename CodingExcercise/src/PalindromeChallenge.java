public class PalindromeChallenge {
    public static void main(String[] args) {


boolean r =isPalindrome(10901);
        System.out.println(r);
    }





    public static boolean isPalindrome(int number){
        int sum=0;
        int rnumber=number;

        while(number>9){
            int lastnum = number%10;
            number = number/10;
            sum=(sum+lastnum)*10;

        }
        int reverse = sum+number;

        if (reverse==rnumber){
            return true;

        }else {
            return false;
        }

    }
}
