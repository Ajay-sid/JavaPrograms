public class SwitchStatemetns {
    // fall through if break were not mentioned.
    //Switch cant support long, double, boolean


    public static void main(String[] args) {
        int swiValue=6;
        switch (swiValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4, 5, 6 -> System.out.println("was 4,5,6");
            default -> System.out.println("no value");
        }

// new feature return for yield








    }



}
