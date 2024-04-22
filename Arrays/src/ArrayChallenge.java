import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
       getIntegers(3);

    }

    public static void getIntegers(int n){

        Scanner sc = new Scanner(System.in);
        int [] unSort = new int[n];
        for(int i =0; i<n;i++){
            unSort[i]=sc.nextInt();
        }
//        return unSort ;
//        System.out.println(Arrays.toString(unSort));
        sortIntegers(unSort);
    }

    public static void printArray(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }

    }

    public static int[] sortIntegers(int [] arr){
        int [] cop = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i =0; i<cop.length-1;i++){
                if(cop[i]<cop[i+1]){
                    int temp = cop[i];
                    cop[i] = cop[i+1];
                    cop[i+1]=temp;
                    flag = true;
                }
            }
        }
        return cop;

    }

}
