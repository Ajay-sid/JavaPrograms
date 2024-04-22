import java.util.Scanner;

public class immidiatePrint {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String r = "";
        if(n.length()==0){
            System.out.println(-1);
        }else {

            for (int i = 0; i < n.length(); i++) {
                char ch = n.charAt(i);
                if (ch == ((i < n.length() - 1) ? n.charAt(i + 1) : 'c')) {
                    i++;
                } else {
                    r = r + ch;
                }
            }
        }
        System.out.println(r);
    }

}
