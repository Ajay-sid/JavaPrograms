public class Drink{
    private String name;

    private double price;
    private int quantity;

    public Drink(String name,char size) {
        this.name = name;
        this.price = priceForName(name)*priceForSize(size);

    }

    private double priceForName(String name){
        return switch (name.toLowerCase()){
            case "coke" -> 1;
            case "pepsi" -> 1.20;
            case "sprite" -> .90;
            default -> 0;
        };
    }
    private double priceForSize(char size){
        return switch (size){
            case 's' -> 30;
            case 'm' -> 50;
            case 'l' -> 65;
            default -> 0;
        };
    }

    public void printTotal(){
        System.out.printf("%n%15s" + " : " +price , name);
    }

}
