import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] arr = rando(7);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sind = 0;
        int lind = arr.length-1;
        while(sind<lind){
            int temp=arr[sind];
            arr[sind]=arr[lind];
            arr[lind]= temp;
            sind++;
            lind--;
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