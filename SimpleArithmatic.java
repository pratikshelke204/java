import java.util.Scanner;

public class SimpleArithmatic {
    public static void main(String [] args){
     Scanner pr = new Scanner(System.in);
     System.out.print("Enetr the first number:");
     int a = pr.nextInt();
     System.out.print("Enter the second number:");
     int b = pr.nextInt();
     
     System.out.println("Addition of a+b = " +(a + b));
     System.out.println("Substraction of a-b = " +(a - b));
     System.out.println("Multiplication of a*b = " +(a * b));
     System.out.println("Division of a/b = " +(a / b));
     System.out.println("Modulus of a&b is = " +(a % b));
    
 }

    
}
