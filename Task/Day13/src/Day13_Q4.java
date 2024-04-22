
/*
 4) Write a Java program that reads user input for two integers and performs division.
 Handle the exception that is thrown when the second number is zero,
 and display an error message to the user
 */

import java.util.*;
import java.util.function.Predicate;

public class Day13_Q4 {

        public static void main(String[] args) {

            int [] arr = {3,54,64,23,6};

            List<Integer> li = new ArrayList<>(Arrays.asList(349,514,221,189));
            li.add(900);
            li.add(221);




            Predicate<Integer> pr = new Predicate<Integer>() {
                @Override
                public boolean test(Integer in) {

                    return in%2==0;
                }
            };



       int i = Arrays.stream(arr).min().getAsInt();

            System.out.println(i);





//        boolean flag =false;
//
//        for(int i=0;i<s.length();i++){
//            if(flag){
//                System.out.println(s.charAt(i-1));
//                break;
//            }
//            for(int j =0;j<s.length();j++){
//                if(i!=j){
//
//                    if(s.charAt(i)==s.charAt(j)) {
//                        flag = false;
//                        break;
//                    }else if(s.charAt(i)!=s.charAt(j)){
//                        flag=true;
//                    }
//
//                }
//
//
//
//            }
//
//        }
//
//
//


        }
    }

