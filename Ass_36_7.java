import java.util.Scanner;

public class Ass_36_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Remove all whitespace from a string");
            System.out.println("2. Replace all vowels in a string with '$'");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 4) {
                System.out.println("Exiting the java language program.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input1 = scanner.nextLine();
                    System.out.println("Result: " + input1.replaceAll("\\s+", ""));
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String input2 = scanner.nextLine();
                    System.out.println("Result: " + input2.replaceAll("[AEIOUaeiou]", "\\$"));
                    break;

                case 3:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Result: " + str1 + str2);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
/*
 Output:-
 --- String Operations Menu ---
1. Remove all whitespace from a string
2. Replace all vowels in a string with '$'
3. Concatenate two strings
4. Exit
Choose an option: 1
Enter a string: Welcome to java language
Result: Welcometojavalanguage

--- String Operations Menu ---
1. Remove all whitespace from a string
2. Replace all vowels in a string with '$'
3. Concatenate two strings
4. Exit
Choose an option: 2
Enter a string: Welcome to java program
Result: W$lc$m$ t$ j$v$ pr$gr$m

--- String Operations Menu ---
1. Remove all whitespace from a string
2. Replace all vowels in a string with '$'
3. Concatenate two strings
4. Exit
Choose an option: 3
Enter the first string: Welcome to language
Enter the second string: java is best
Result: Welcome to languagejava is best

--- String Operations Menu ---
1. Remove all whitespace from a string
2. Replace all vowels in a string with '$'
3. Concatenate two strings
4. Exit
Choose an option: 4
Exiting the java language program.

 */