import java.util.Random;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class work{

    public static void main(String[] args) {


        for(int i=0;i<16;i++) {
           Weekday w = rando();

            System.out.println(w.name() + " " + w.ordinal());
        }

    }


    private static Weekday rando(){

        int ran = new Random().nextInt(7);
        Weekday [] arr = Weekday.values();
        return arr[ran];

    }


}