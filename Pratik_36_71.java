import java.util.Scanner;

public class Pratik_36_71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Remove all whitespace from a string");
            System.out.println("2. Replace all vowels in a string with the $ symbol");
            System.out.println("3. Concatenate two strings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Remove whitespace
                    System.out.print("Enter a string: ");
                    String input1 = scanner.nextLine();
                    String noWhitespace = input1.replaceAll("\\s", "");
                    System.out.println("String without whitespace: " + noWhitespace);
                    break;

                case 2:
                    // Replace vowels with $
                    System.out.print("Enter a string: ");
                    String input2 = scanner.nextLine();
                    String noVowels = input2.replaceAll("[AEIOUaeiou]", "\\$");
                    System.out.println("String with vowels replaced: " + noVowels);
                    break;

                case 3:
                    // Concatenate two strings
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    String concatenated = str1 + str2;
                    System.out.println("Concatenated string: " + concatenated);
                    break;

                case 4:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please select an option between 1 and 4.");
            }
        }

        scanner.close();
    }
}
/*
 String Operations Menu:
1. Remove all whitespace from a string
2. Replace all vowels in a string with the $ symbol
3. Concatenate two strings
4. Exit
Enter your choice (1-4): 2
Enter a string: Java is best
String with vowels replaced: J$v$ $s b$st

String Operations Menu:
1. Remove all whitespace from a string
2. Replace all vowels in a string with the $ symbol
3. Concatenate two strings
4. Exit
Enter your choice (1-4): 1                    
Enter a string: welcome to java
String without whitespace: welcometojava

String Operations Menu:
1. Remove all whitespace from a string
2. Replace all vowels in a string with the $ symbol
3. Concatenate two strings
4. Exit
Enter your choice (1-4): 3
Enter the first string: java
Enter the second string: Language
Concatenated string: javaLanguage

String Operations Menu:
1. Remove all whitespace from a string
2. Replace all vowels in a string with the $ symbol
3. Concatenate two strings
4. Exit
Enter your choice (1-4): 4
Exiting the program. Goodbye!
 */