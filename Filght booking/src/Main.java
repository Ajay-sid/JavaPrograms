import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Mainmenu mn=new Mainmenu();
        mn.menu();


    }

}

 class Mainmenu{
    public static int seats = 50;
    List<String> list = new ArrayList<>();
     Scanner sc = new Scanner(System.in);


    public void menu(){
        System.out.println("To continue booking press 1"+
                              "To Cancel booking press 2"+
                              "To get flight details with passengers press 3"
                              +"To exit press 0"  );

        int menuNum = sc.nextInt();
        switch (menuNum){
            case 1 -> booking();
            case 2 -> cancel();
            case 3 -> filghtDetails();
            case 0 -> {
                return;
            }



        }

    }
    public void exit(){
        System.out.println("Press Y to continue to main menu"+ "\n" +
                "Press N to exit");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch=='y'){
            menu();
        }else {
            System.out.println("bye");

        }




    }

    public void booking(){
        System.out.println("Ticket has been booked");
        seats=seats-1;
        exit();

    }

    public void cancel(){
        System.out.println("Your Ticket has been canceled");
        seats=seats+1;
        exit();
    }

    public void filghtDetails(){
        System.out.println(list);
        exit();
    }








}
