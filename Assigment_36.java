import java.text.NumberFormat;
import java.util.Scanner;

public class Assigment_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        // Input first currency value
        System.out.print("Enter the first amount of money: ");
        double amount1 = scanner.nextDouble();

        // Input second currency value
        System.out.print("Enter the second amount of money: ");
        double amount2 = scanner.nextDouble();

        // Formatting the amounts
        String formattedAmount1 = currencyFormatter.format(amount1);
        String formattedAmount2 = currencyFormatter.format(amount2);

        System.out.println("Formatted amounts:");
        System.out.println("Amount 1: " + formattedAmount1);
        System.out.println("Amount 2: " + formattedAmount2);

        // Perform arithmetic operations
        double additionResult = amount1 + amount2;
        double subtractionResult = amount1 - amount2;
        double multiplicationResult = amount1 * amount2;

        // Formatting the results
        String formattedAddition = currencyFormatter.format(additionResult);
        String formattedSubtraction = currencyFormatter.format(subtractionResult);
        String formattedMultiplication = currencyFormatter.format(multiplicationResult);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition: " + formattedAddition);
        System.out.println("Subtraction: " + formattedSubtraction);
        System.out.println("Multiplication: " + formattedMultiplication);

        scanner.close();
    }
}
/*
 Output:-
 Enter the first amount of money: 1234
Enter the second amount of money: 45643
Formatted amounts:
Amount 1: $1,234.00
Amount 2: $45,643.00

Results:
Addition: $46,877.00
Subtraction: -$44,409.00
Multiplication: $56,323,462.00
 */
