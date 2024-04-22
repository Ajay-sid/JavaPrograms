public class SumFirstLast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }else {


            int lastnum = number % 10;
            while (number > 9) {
                number = number / 10;
            }
            int firstnum=number;
            return firstnum+lastnum;

        }




    }




}
