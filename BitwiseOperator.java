import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args){
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = pr.nextInt();
        System.out.println("enter the second number");
        int second = pr.nextInt();
        
        int and = first & second;
        int or = first | second;
        int xor = first ^ second;
        
        System.out.println("Bitwise AND "+ and);
        System.out.println("Bitwise OR "+ or);
        System.out.println("Bitwise XOR "+ xor);
    }
    

    
}
