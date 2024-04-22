public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1765,3.1767)) ;

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        double aa=a*1000;
        double bb=b*1000;
        int aaa=(int)aa;
        int bbb = (int)bb;
        if(aaa==bbb){
            return true;
        }
        return false;
}
}


