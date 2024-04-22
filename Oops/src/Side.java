public class Side {
    private String name;
    private double price;

    public Side(){
        this.name="fries";
        this.price=setPrice(name);
    }

    public Side(String name) {
        this.name = name;
        this.price=setPrice(name);


    }

    private double setPrice(String name){
        if (name.toLowerCase().charAt(0) == 'f') {
            return 50;
        } else if (name.toLowerCase().charAt(0) == 'n')
            return 70;
        else return 0;
    }


    public void calPrice(){
        System.out.println(getClass().getName() + price);
    }



}