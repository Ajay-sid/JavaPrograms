public abstract class AbsPractice {

    int num = 3;
    String s = "ajay";

    public abstract void show();

}

class ran extends AbsPractice {


    @Override
    public void show(){
        System.out.println("Hi its ajay");
    }
}




class Name{


    public static void main(String[] args) {

        AbsPractice ab = new ran();


        ab.show();


    }
}
