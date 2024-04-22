import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        List<Integer> intList = new LinkedList<>();
        for(int i =0;i<siz;i++){
            intList.add(sc.nextInt());
        }
        Collections.sort(intList);

        for(int i=0;i<siz;i++){
            if(i==(siz-1)){
                System.out.print(intList.get(i));
            }else {
                System.out.print(intList.get(i) + " ");
            }
        }


    }
}