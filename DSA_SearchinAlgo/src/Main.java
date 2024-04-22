public class Main {
    public static void main(String[] args) {

        int result = binarySearch(new int[] {1,2,5,7,11,31,46,48,52,58,60},0);
        System.out.println(result);


    }



    public static int binarySearch(int[] array,int target){
        int start = 0;
        int last = array.length-1;

        while(start<=last) {
            int mid=(start+last)/2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                last = mid - 1;
            }

        }
        return -1;
    }
}