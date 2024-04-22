import java.util.Scanner;

public class Array1 {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String[] inp = sc.nextLine().split(" ");
            int n = Integer.parseInt(inp[0]);
            int m = Integer.parseInt(inp[1]);

            int [] narr = new int [n];
            for(int i=0;i< narr.length;i++){
                narr[i]=sc.nextInt();
            }
            int j = 0;
            int [] outarr = new int[n];
            while(j<narr.length){
                if(Math.abs(narr[j]-narr[j+1]%n)>m){
                    outarr[j]=1;
                }
                j++;
            }
            for(int i=0;i<outarr.length;i++) {
                if (i == (outarr.length - 1)) {
                    System.out.print(outarr[i]);
                } else {
                    System.out.print(outarr[i] + " ");
                }
            }

        sc.close();





// int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        for(int b : narr){
//            System.out.println(b);
//        }



    }
}
