public class CoffeMachine {

    private boolean hasToWork;

    public void setHasToWork(boolean hasToWork){
        this.hasToWork=hasToWork;
    }

    public void brewCoffee(){
        if(hasToWork) {
            System.out.println("Brewing Coffee");
            hasToWork = false;
        }
    }
}
