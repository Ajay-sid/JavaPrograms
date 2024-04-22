public class SumOdd {
    public static void main(String[] args) {


        System.out.println(sumOdd(2,15));

    }

    public static boolean isOdd(int number){
        if (number>0){
            if (number%2!=0){
                return true;

            }return false;
        }
        return false;

    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start>end || start<=0|| end<=0){
            return -1;
        }
        for(int i = start ;i<=end;i++){
            if(isOdd(i)){
                sum+=i;

                System.out.println(i);
                if(start==end){
                    break;
                }

            }


        }return sum;




    }

}
