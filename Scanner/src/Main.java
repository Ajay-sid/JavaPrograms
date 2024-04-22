import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(fromConsole());
        }catch (Exception e){
            System.out.println(fromScanner());
        }



    }
    public static String fromConsole(){

        String year = System.console().readLine("Hi, What year were you born ");
       int age = 2023-Integer.parseInt(year);
        System.out.println(age);
        return "";

    }
    public static String fromScanner(){
        int currentYear =2023;
        Scanner scanner = new Scanner(System.in);
        //getting name
        System.out.println("Hi, what's your Name ");
        String name = scanner.nextLine();
        System.out.println("Hi "+name);
        //geting age
        System.out.println("What year were you born ");
        boolean isValid=false;
        int age=0;
        do{
            System.out.println("Enter your year between " +(currentYear-125)+
                    " and "+currentYear);
            try {
                age = checkData(currentYear,scanner.nextLine());
                isValid=(age<0)?false:true;
            }catch (NumberFormatException e){
                System.out.println("Enter valid numbers");
            }


        }while (!isValid);
        return "So you are "+age;

    }
    public static int checkData(int currentYear, String dateofBirth){
        int dob = Integer.parseInt(dateofBirth);
        int minyear= currentYear-125;
        if(dob<minyear||dob>currentYear){
            return -1;
        }
        return currentYear-dob;

    }



}