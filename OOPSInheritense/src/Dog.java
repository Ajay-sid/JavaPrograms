public class Dog extends Animal{


    private String earShape;
    private String tailShape;


    public Dog(String type, double weight){
        this(type,weight,"Croocked","curled");

    }

    //Creating additional fields for dog.
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,(weight<15?"small":(weight>35?"large":"medium")), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
// Default constructor to call super constructor
    public Dog(){
        super("rot","medium",10);

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise(){

    }

    @Override
    public void move(String speed) {

        if (speed=="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }


    private void bark(){
        System.out.println("Woof!...");
    }
    private void run(){
        System.out.println("Dog running");
    }

    private void walk(){
        System.out.println("Dog Walking");
    }
    private void wagTail(){
        System.out.println(" Dog Tail Wagging");
    }

}
