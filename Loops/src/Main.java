import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0,max=0,count=0;
    
       Scanner sc = new Scanner(System.in);
            while(true){
                    System.out.println("Enter num to play or string to quit");
                    try{
                        int value = Integer.parseInt(sc.nextLine());
                        if(count==0||value<min){
                            min = value;
                        }else if(count==0||value>max){
                            max = value;
                        }
                        
                        count++;
                    }catch(NumberFormatException e){
                        break;
                    }
                    

                    
            }

            System.out.println("Min = "+min+" Max = "+max);


    }
}