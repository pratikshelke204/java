import java.util.Scanner;

public class Pratik_36_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        System.out.println("Enter the scores of " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int highestScore = scores[0];
        int lowestScore = scores[0];
        int totalScore = scores[0];

        for (int i = 1; i < numStudents; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            }
            totalScore += scores[i];
        }

        double averageScore = (double) totalScore / numStudents;

        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: " + averageScore);

        scanner.close();
    }
}

 /*
  Output:-
  Enter the number of students: 5
Enter the scores of 5 students:
20
25
30
26
21
Highest Score: 30
Lowest Score: 20
Average Score: 24.4
  */