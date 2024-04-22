public class ForChallenge {
    //Prime number challenge
    public static void main(String[] args) {
        int primeCounter = 0;
    for (int i=3;i<=30;i++){
        if(isPrime(i)) {
            System.out.println(i + " is a PrimeNumber");
            primeCounter += 1;
            if (primeCounter==7){
                break;
            }
        }

    }
        System.out.println(primeCounter);

    }

public static boolean isPrime(int wholenum ){
        if (wholenum<=1){
            return false;
        }
        for(int j=2;j<wholenum;j++){
            if(wholenum%j==0){
                return false;
            }
        }return true;



}



}
