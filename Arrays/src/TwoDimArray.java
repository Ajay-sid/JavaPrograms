import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {

        int [][] arr = new int[3][3];

            System.out.println(Arrays.deepToString(arr));


//
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(i*10)+(j+1);
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }

    }


}
