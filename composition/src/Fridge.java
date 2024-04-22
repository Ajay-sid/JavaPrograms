public class Fridge {
    private boolean hasToWork;

    public void setHasToWork(boolean hasToWork){
        this.hasToWork=hasToWork;
    }

    public void orderFood(){
        if(hasToWork) {
            System.out.println("Ordering Food");
            hasToWork = false;
        }
    }

}
