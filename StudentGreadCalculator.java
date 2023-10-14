/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  import java.util.Scanner;
  
public class StudentGreadCalculator {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Please enter a valid number of subjects.");
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be in the range of 0 to 100. Please enter valid marks.");
                return;
            }
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
