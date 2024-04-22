import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {
   
public static void main(String[] args) {
    

String s = "Java, Selenium,TestNG,Maven";

String [] a =s.split(",");

List<String> li=new ArrayList<>(Arrays.asList(a));
li.add("red");
System.out.println(li);





}

    



}
