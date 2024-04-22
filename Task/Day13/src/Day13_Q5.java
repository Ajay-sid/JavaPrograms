


public class Day13_Q5 {
        public static void main(String[] args) {

            int [] arr = new int[] {4,3,4,5,3};
//Trying to access an element with invalid index range
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

 class Day13_Q5_StringIndexOutOfBound {


    public static void main(String[] args) {

        String s = "Hello";

        System.out.println(s.charAt(-1));
    }

}

