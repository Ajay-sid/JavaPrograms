import java.util.Arrays;
import java.util.Random;

public class reverseUsingBubbleSort {

    public static void main(String[] args) {
        int [] arr = rando(10);
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i =0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    System.out.println(Arrays.toString(arr));
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    public static int[] rando(int len){
        Random r = new Random();
        int [] intarray = new int[len];
        for(int i = 0; i<len;i++){
            intarray[i]=r.nextInt(100);
        }
        return intarray;



    }
}
