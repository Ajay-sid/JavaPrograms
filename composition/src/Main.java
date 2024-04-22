public class Main {
    public static void main(String[] args) {

    SmartKitchen sm= new SmartKitchen();
    CoffeMachine cf= new CoffeMachine();
    sm.setCoffeeBrewer(cf);
    sm.getCoffeeBrewer().setHasToWork(true);

//    sm.setKitchenState(true,false,true);
    sm.getCoffeeBrewer().brewCoffee();












    }
}