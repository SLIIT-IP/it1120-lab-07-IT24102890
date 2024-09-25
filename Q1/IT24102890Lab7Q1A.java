import java.util.Scanner;

public class IT24102890Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for storing marks
        int mark1, mark2, mark3, mark4;

        // Input marks for four subjects
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();

        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        // Determine grade based on average
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display the average and grade
        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

        input.close();
    }
}
