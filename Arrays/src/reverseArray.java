import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
    int [] ar = {12,45,3,76,43,76,2};
    reverseArray.reverseNew(ar);

    }

    private static void reverseNew(int [] array){
        int[] newArr = new int [array.length];
        System.out.println(Arrays.toString(newArr));
        int i =0;
        int l = array.length-1;
        while(l>=0){
            newArr[i]=array[l];
            i++;
            l--;
        }
        System.out.println(Arrays.toString(newArr));



    }



    private static void reverse(int [] array){
        int s = 0;
        int l = array.length-1;
        int temp;
        while(s<l){
            temp=array[l];
            array[l]=array[s];
            array[s]=temp;
            s++;
            l--;
        }
        System.out.println(Arrays.toString(array));



    }



}
