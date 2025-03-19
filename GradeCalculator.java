import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Step 1: Get student score
        int score = getStudentScore();

        // Step 2: Determine the grade
        String grade = calculateGrade(score);

        // Step 3: Display the result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get student score from user input with validation
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                if (score >= 0 && score <= 100) { // Valid score range
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a score between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close(); // Close scanner to prevent memory leak
        return score;
    }

    // Method to calculate grade based on score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
