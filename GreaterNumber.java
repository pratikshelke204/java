import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[]args){
        Scanner ps = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = ps.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = ps.nextInt();
        
        if (num1<num2){
            System.out.println(+num2+" Is the greater ");
            
        }
        else if (num1>num2){
            System.out.println(+num1+" Is the greater ");
            
        }
        else {
        System.out.println("Both are equal");
        }
    }

    
}
