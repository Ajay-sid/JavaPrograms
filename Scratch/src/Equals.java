public class Equals {


    public static void main(String[] args) {
       String s = "1.1.2.3.4";
        StringBuilder s1 = new StringBuilder();

       for(char c : s.toCharArray()){
           if(c=='.'){
               s1.append("[.]");
           }else{
               s1.append(c);
           }

        }
        System.out.println(s1.toString());




    }
}
