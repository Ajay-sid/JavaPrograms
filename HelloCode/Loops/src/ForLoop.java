public class ForLoop {
    public static void main(String[] args) {
        for(double intrate =8; intrate<=10;intrate+=0.25){
            double rate = calculateintrest(10000, intrate);
            if(intrate>9){
                break;
            }
            System.out.println(rate);

        }

    }




    public static double calculateintrest(double amt, double IntRate){

        return (amt*IntRate/100);

    }
}
//Recap
