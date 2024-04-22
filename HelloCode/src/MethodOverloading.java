public class MethodOverloading {
    //Challenge

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(9,34));

    }

    public static double convertToCentimeters(int heightInInches){
        return heightInInches*2.54;

    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches ){

        return convertToCentimeters((heightInFeet*12)+heightInInches);
    }











}

