public class Sec5 {

    public static void main(String[] args) {

/*   Methods -A method can be executed many times with
        potentially different results, by passing date to the method
        in the form of arguments*/


        int l = 100;
        int b = 200;
        boolean g = true;
        int j = 100;
//calculateScore(true,500,l,b);


calculateScore(true,1000,40,50);

        System.out.println( "the addition from method call "+add(3,4));


    }


     public static void  calculateScore(boolean gameOver, int score,int Lcom, int bonus ){


        System.out.println(score+Lcom+bonus);


    }

    public static int add(int b,int a) {
       int set = a + b;
        return set;



    }

}
