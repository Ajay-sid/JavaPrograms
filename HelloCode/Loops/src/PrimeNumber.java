public class PrimeNumber {

    public static void main(String[] args) {

        for(int j=0;j<100;j++){
            if (isPrime(j)) {
                System.out.println(j + " is a Prime Number");
            }
        }
    }
    public static boolean isPrime(int wholenum){

        if(wholenum==2){
            return true;
        }
        if(wholenum<2){
            return false;
        }
        else {
            for(int i=2;i<wholenum;i++){
                if(wholenum%i==0){
                    return false;
                }
            }return true;
        }
    }

}
