import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompArray {


    public static void main(String[] args) {


        List<String> li = new ArrayList<>(Arrays.asList("ajay","si","kid","bale","laem"));

       li.stream().filter(e->e.length()>2).forEach(System.out::println);



//      List<Integer> nLi =   li.stream().map(i->i*i).distinct().sorted().toList();
//
//        System.out.println(nLi);
// +--
//        int[] arr = li.stream().filter(i->i%3==0).mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(arr));

//        li.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
//+
//        int n = li.stream().distinct().reduce(Integer::sum).get();
//        System.out.println(n);



//        Arrays.sort(arr);
//        int count=0;
//        int lastIndex=arr.length-1;
//        while(count<2){
//            if(arr[lastIndex]!=arr[lastIndex-1]){
//                count++;
//            }
//            lastIndex=lastIndex-1;
//
//
//        }
//        System.out.println(arr[lastIndex]);





    }
}
