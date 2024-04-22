public class largest {
    public static void main(String[] args) {
        int largest = 1000;
        int sec = 0;
        int [] arr = {4,7,5,3,78,78,23,56};
        for(int i= 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]&&arr[i]<largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);



    }


}
