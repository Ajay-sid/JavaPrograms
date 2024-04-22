public class SmartKitchen {

    private CoffeMachine coffeeBrewer;
    private Fridge Icebox;
    private DishWasher dishwasher;


public SmartKitchen(){
    coffeeBrewer=new CoffeMachine();
    Icebox = new Fridge();
    dishwasher= new DishWasher();
}


    public void setCoffeeBrewer(CoffeMachine coffeeBrewer) {
        this.coffeeBrewer = coffeeBrewer;
    }

    public void setIcebox(Fridge icebox) {
        Icebox = icebox;
    }

    public void setDishwasher(DishWasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public CoffeMachine getCoffeeBrewer() {
        return coffeeBrewer;
    }

    public Fridge getIcebox() {
        return Icebox;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag, boolean dishFlag ){
    coffeeBrewer.setHasToWork(coffeeFlag);
    Icebox.setHasToWork(fridgeFlag);
    dishwasher.setHasToWork(dishFlag);

    }

    public void doKitchen(){
    coffeeBrewer.brewCoffee();
    Icebox.orderFood();
    dishwasher.doDishes();
    }








}
