import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("wolf","big",100);


        ArrayList<AnimalAbs> animal = new ArrayList<>();
        animal.add(d);
        animal.add(new Dog("GSD","Medium",66));
        animal.add(new Fish("Goldfish","Small",12));

        for(AnimalAbs an : animal){
            aniStuff(an);
        }


    }

    public static void aniStuff(AnimalAbs ani){
        ani.makeNoise();
        ani.move("slow");
    }
}