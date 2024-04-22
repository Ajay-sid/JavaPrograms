public class LeapYearExcersise {
    public static void main(String[] args) {


        System.out.println(isLeapYear(1924));



    }

    public static boolean isLeapYear(int year){
       boolean status = false;
       if (year<1 || year>9999){
           return status;
       } else if (year%4==0||year%100==0||year%400==0) {
           status = true;
       }
        return status;
    }




}
