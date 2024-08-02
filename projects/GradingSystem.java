import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstUnit;
        int secondUnit;
        int sum;
        int average;
        String grade = ""; // Initialize grade as an empty string

        System.out.println("Please enter first unit marks: ");
        firstUnit = input.nextInt();

        System.out.println("Please enter the second unit marks: ");
        secondUnit = input.nextInt();

        sum = firstUnit + secondUnit;
        average = sum / 2;

        if (average >= 80 && average <= 100) {
            grade = "A";
        } else if (average >= 70 && average < 80) {
            grade = "B";
        } else if (average >= 60 && average < 70) {
            grade = "C";
        } else if (average >= 50 && average < 60) {
            grade = "D";
        } else if (average < 50) {
            grade = "F";
        }

        System.out.println("The average is: " + average);
        System.out.println("The grade is: " + grade);
    }
}
/*The following was a java program that accept the 2 unit of student and find the
 average and grade the stundent based on performance
 */