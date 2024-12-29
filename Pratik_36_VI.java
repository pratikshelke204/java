import java.util.Scanner;

public class Pratik_36_VI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input CIA-I scores
        int[] ciaScores = new int[numStudents];
        System.out.println("Enter the CIA-I scores (out of 25):");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Score of student " + (i+1) + ": ");
            ciaScores[i] = scanner.nextInt();
        }

        // Initialize an array to store final scores
        int[] finalScores = new int[numStudents];

        // Input retest scores for failed students and calculate final scores
        System.out.println("\nEnter retest scores (only for students who scored less than 10 in CIA-I):");
        for (int i = 0; i < numStudents; i++) {
            if (ciaScores[i] < 10) {
                System.out.print("Retest score for student " + (i + 1) + ": ");
                int retestScore = scanner.nextInt();
                finalScores[i] = retestScore; // Retest score becomes final score
            } else {
                finalScores[i] = ciaScores[i]; // CIA-I score becomes final score
            }
        }

        // Analyze the final scores
        int highestScore = finalScores[0];
        int lowestScore = finalScores[0];
        int totalScore = 0;

        for (int score : finalScores) {
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            totalScore += score;
        }

        double averageScore = (double) totalScore / numStudents;

        // Display the results
        System.out.println("\nClass Performance Analysis:");
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: " + averageScore);

        scanner.close();
    }
    
}
