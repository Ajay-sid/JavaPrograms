public class Main
{

        public static void main(String[] args) {

            String s ="";


            char [] dig = {' ', '0', '3','3',' ','4','f'};

           for(Character c : dig) {

                if(Character.isDigit(c)) {

                    s =  s + c;

                }

           }


            System.out.println(s+3 +"\b ghj" );

            int num = Integer.parseInt(s);

            System.out.println(num+3);




         }


}