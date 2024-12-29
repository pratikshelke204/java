import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Currency {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Input the number
            System.out.println("Enter Number:");
            double a = sc.nextDouble();

            // Format the number as US currency
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("US Currency: " + usFormat.format(a));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
