public class DishWasher {
    private boolean hasToWork;

    public void setHasToWork(boolean hasToWork){
        this.hasToWork=hasToWork;
    }

    public void doDishes(){
        if(hasToWork) {
            System.out.println("Washing Dishes");
            hasToWork = false;
        }
    }

}
