import java.util.*;

public class RepeatingWords {

    public static void main(String[] args) {


        String s = "AFG ghvb AFG sid Sid lol sem bat sid";
        String[] array = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String ss : array) {
            if (map.containsKey(ss)) {
                map.put(ss, map.get(ss) + 1);
            } else {
                map.put(ss, 1);

            }

        }

        List<String> in = Arrays.asList("2","4","5","6","3");

        String [] st = in.toArray(new String[0]);
        int last=st.length-1;
        int star = 0;
       while(star<last)
       {
           String temp = st[star];
           st[star]=st[last];
           st[last]=temp;
           star++;
           last--;
       }
        System.out.println(Arrays.toString(st));
    }
}