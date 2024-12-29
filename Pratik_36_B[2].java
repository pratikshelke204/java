import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);//Creating object of Scanner Class
        System.out.print("Enter 1st Number:");
        double a=s.nextDouble(); //input from user
        
        System.out.print("Enter 2nd Number:");
        double b=s.nextDouble(); //input from user

        System.out.println("Enter no of operation\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\n");
        int result=s.nextInt();//input for operation

        switch(result){
            case 1:
            System.out.println("Addition is:"+(a+b));
            break;

            case 2:
            System.out.println("Subtraction is:"+(a-b));
            break;

            case 3:
            System.out.println("Multiplication is:"+(a*b));
            break;

            case 4:
            System.out.println("Division is:"+(a/b));
            break;
            
            case 5:
            System.out.println("Remainder is:"+(a%b));
            break;
            default:
            System.out.println("Invalid Choise");
        }
    }
}

/*
 Input:-
 Enter 1st Number:2
Enter 2nd Number:4
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus

Output:-
Subtraction is:-2
---------------------------------------------------------------------------------------------------- 
Input:-
Enter 1st Number:5
Enter 2nd Number:10
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus

Output:-
Remainder is:5
---------------------------------------------------------------------------------------------------------
Input:-
Enter 1st Number:32
Enter 2nd Number:45
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus

Output:-
Multiplication is:1440
--------------------------------------------------------------------------------------------------------
Input:-
Enter 1st Number:5
Enter 2nd Number:9
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus

Output:-
Division is:0.5555555555555556
-----------------------------------------------------------------------------------------------------
Input:-
Enter 1st Number:23
Enter 2nd Number:36
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus

Output:-
Addition is:59.0
-------------------------------------------------------------------------------------------------------------------------------------------
Output:-
Enter 1st Number:23
Enter 2nd Number:21
Enter no of operation
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Modulus
.
6
Invalid Choise
 */