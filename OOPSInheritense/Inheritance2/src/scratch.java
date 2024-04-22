public class scratch {


    public static void main(String[] args) {

        B b = new B();
        b.show();


    }
}
class A{
    int a;
    int b;

    void show(){
        System.out.println("from A");
    }


}

class B extends A{
    int x;
    int y;


    void show(){

        System.out.println("from B");
    }
}