import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args ){
        Scanner pratik = new Scanner(System.in);
        
        int num;
    
    do {
        System.out.println("Enter the numer(Enter -1 to exit):");
        num = pratik.nextInt();
        
       
         if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
            
        }else if (num % 3 == 0){
            System.out.println("Fizz");
            
        }else if (num % 5 == 0){
            System.out.println("Buzz");
        }
        if (num == -1){
            break;
            }
        }while (num != -1 );  
    }
}
