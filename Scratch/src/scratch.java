import java.util.Arrays;
import java.util.Scanner;

public class scratch {



    public static void main(String[] args) {

        int [] arr = {4,1,5,7,12,3};
        int [] narr = new int [arr.length];
        int in = 0;
        for(int i =arr.length-1;i>=0;i--){

            narr[in]=arr[i];
            in++;

        }
        System.out.println(Arrays.toString(narr));







    }


    private static int readInteger(){
        Scanner sc= new Scanner(System.in);
        int noOfele = sc.nextInt();
        sc.close();
        System.out.println(noOfele);
        return noOfele;

    }
   private static int[] readElements(int elements){
        Scanner s = new Scanner(System.in);
        int [] inarray = new int [elements];
        for(int i=0;i<elements;i++){
            inarray[i]=s.nextInt();
        }
        s.close();
       System.out.println(Arrays.toString(inarray));
        return inarray;
   }

private static int findMin(int [] array){
    int min = Integer.MAX_VALUE;
    for(int j :array){
        if(j<min){
            min = j;
        }

    }
    System.out.println(min);

    return min;
}


}





