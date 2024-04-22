import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<String> listIt = new ArrayList<>();
        boolean flag = true;
        while (flag){
            Main.menu();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(listIt);
//                case 2 -> removeItems();
                default -> flag=false;

            }
            listIt.sort(Comparator.naturalOrder());
            System.out.println(listIt);
        }

    }

    private static void menu(){
        String text = """
                press 0 to quit
                press 1 to add item
                press 2 to remove item
                """;
        System.out.println(text + " ");
    }
    private static void addItems(ArrayList<String> listIt){
        System.out.println("Add items with ',' ");
        String [] array = sc.nextLine().split(",");
        for(String i : array){
            String s = i.trim();
            if(listIt.indexOf(s)<0){
                listIt.add(s);
            }
        }
    }



}