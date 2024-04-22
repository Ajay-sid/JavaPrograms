import java.util.*;

public class Count {
    public static void main(String[] args) {


        String s = "everyone hi everyone how are you everyone how are you guys";

        String [] arr = s.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s1: arr){
            if(map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            }else{
                map.put(s1,1);
            }

        }
        Set<Map.Entry<String,Integer>> entry = map.entrySet();

        List<String> il = new ArrayList<>(map.keySet());
        il.add("kol");

        System.out.println(il);

        for(Map.Entry<String,Integer> it : entry){
            System.out.println(it.getKey()+ " < "+ it.getValue());
        }




    }



}
