package rand;


import java.util.Arrays;

public class mai{
    public static void main(String[] args) {

    int [] array = new int[] {1,5,2,324,63,6,242,52,25,24,};

        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println(Arrays.toString(array));


    }


    public static void bubleSort(int[] arr){

        for(int i =0;i<arr.length;i++){

            for(int j =0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));




    }

    public static void selectionSort(int [] arr){

        for(int i=0;i<arr.length-1;i++){
        int minIndex=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minIndex]<arr[j]){
                minIndex=j;
            }


        }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            System.out.println(Arrays.toString(arr));
        }




    }







}


