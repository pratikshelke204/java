import java.io.File;
import java.util.Scanner;

public class Pratik_36_VIII {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scan.nextLine();
        File f = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(f);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();

                try {
                    int num = Integer.parseInt(line);
                    sum += num;
                } catch (Exception e) {
                    System.out.println("Invalid Data in file!! " + e);
                }
            }
            System.out.println("Total sum: " + sum);
        } catch (Exception e) {
            System.out.println("Something Went Wrong!! Check your file path...");
        }

        scan.close();
    }
    
}
