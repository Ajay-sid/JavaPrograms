public class Main {
    public static void main(String[] args) {

        Animal an = new Animal("default Animal","random",100.00);
        doAnimalStuff(an,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");
        dog.makeNoise();

        Fish gold = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(gold,"fast");



    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------");

    }

}