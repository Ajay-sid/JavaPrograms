public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameDigit(1001,11,11));

    }

    public static boolean hasSameDigit(int fnum,int snum, int tnum){
        int finum =fnum%10;
        int senum =snum%10;
        int thnum = tnum%10;

        if((fnum<10||snum<10||tnum<10)||(fnum>1000||snum>1000||tnum>1000)){
            return false;

        }
        else if(finum==senum||finum==thnum||senum==thnum){
                return true;
        }return false;

    }
public static boolean isValid(int num){
        if (num<9||num>1000){
            return false;
        }return true;

}





}

