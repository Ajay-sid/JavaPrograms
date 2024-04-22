public class WhileLoop {
    public static void main(String[] args) {
        int ecount = 0;
        int ocount = 0;
        int i = 5;
        while (i<=20){
            i++;

            if(ecount==5&&ocount==5) {
                break;
            }
            else if(isEven(i)){
                System.out.println("Even Number "+i);
                ecount++;
            }else {
                System.out.println("Odd Number "+ i);
                ocount++;
            }






        }


    }


    public static boolean isEven(int num){
        if (num%2==0){
            return true;

        }return false;

    }


}


