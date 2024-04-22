import java.util.Scanner;

public class Item {
    private Drink drink;
    private String name;
    private char size;

    public Item(){
        int n =menu();
        char cc =Size();
        if(n==1){
            this.drink=new Drink("coke",cc);
        }
        if(n==2){
            this.drink=new Drink("pepsi",cc);
        }
        if(n==3){
            this.drink=new Drink("sprite",cc);
        }

    }
    public int menu(){
        String s = """ 
                       press 1 -> coke 
                       press 2 -> pepsi
                       press 3 -> sprite
                """;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
    public char Size(){
        System.out.println("choose size\n" +
                "                       small,medium,large");
        Scanner scc = new Scanner(System.in);
        String c = scc.nextLine();
        return c.toLowerCase().charAt(0);

    }



    public Drink getDrink() {
        return drink;
    }
}
