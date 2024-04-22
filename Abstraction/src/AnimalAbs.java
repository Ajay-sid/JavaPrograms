public abstract class AnimalAbs {
    protected String type;
    private String size;
    private double weight;



    public AnimalAbs(String type,String size, double weight){
        this.type = type;
        this.size = size;
        this.weight=weight;

    }


    public abstract void move(String speed);
    public abstract void makeNoise();
}

class Dog extends AnimalAbs{


    public Dog(String type,String size, double weight ){
        super(type,size,weight);
    }


    @Override
    public void move(String speed) {
    if(speed.equals("slow")){
        System.out.println(type + " Walking");
    }else {
        System.out.println(type + " Running");
    }
    }

    @Override
    public void makeNoise() {

        if(type=="wolf"){
            System.out.println("howling");
        }else {
            System.out.println("woooof!");
        }
    }
}

class Fish extends AnimalAbs{


    public Fish(String type,String size, double weight ){
        super(type,size,weight);
    }


    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " lazily gliding");
        }else {
            System.out.println(type + " jeting");
        }
    }

    @Override
    public void makeNoise() {

        if(type=="Goldfish"){
            System.out.println(" Swish");
        }else {
            System.out.println(" Splash");
        }
    }
}