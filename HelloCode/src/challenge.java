public class challenge {

    public static void main(String[] args) {


        double firstV ,secV,newV,remind;
        firstV = 20.00;
        secV = 80.00;

        newV = (firstV + secV) * 100.00;


        remind = newV % 40.00;
        System.out.println(remind);
        boolean iszero = (remind==0)? true:false;
        String out = (iszero)? "code correct": "got some remainder";
        System.out.println(out);













    }
}
