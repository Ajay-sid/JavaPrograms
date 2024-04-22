import java.util.Scanner;

public class AdjacentSwap {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n - 1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            scanner.close();
        }
    }


