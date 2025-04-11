package code.vanilson.basics;

import java.util.Scanner;

/**
 * GradeClassification
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class GradeClassification {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the average grade: ");
            int n = sc.nextInt();
            System.out.println("The grade classification is : " + gradeClassifications(n));
        }

    }

    static String gradeClassification(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade must be a positive number");
        }
        return switch (grade) {
            case 12, 11, 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3, 2, 1, 0 -> "D";
            default -> throw new IllegalArgumentException("Invalid grade");
        };
    }

    @SuppressWarnings("all")
    static String gradeClassifications(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade must be a positive number");
        }
        if (grade >= 9) {
            return "A";
        } else if (grade >= 7 && grade < 9) {
            return "B";
        } else if (grade >= 5 && grade < 7) {
            return "C";
        } else {
            return "D";
        }
    }
}