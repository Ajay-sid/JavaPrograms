import java.util.Scanner;

class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}

public class ExpHandling {

    public static void checkAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age below 18 is Invalid");
        }
    }


    public static void main(String[] args) throws InvalidAgeException {

            Scanner sc = new Scanner(System.in);
        try{
            checkAge(sc.nextInt());
            System.out.println("Valid Age");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
