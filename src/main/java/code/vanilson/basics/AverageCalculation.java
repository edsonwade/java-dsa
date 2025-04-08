package code.vanilson.basics;

import java.util.Scanner;

/**
 * AverageCalculation
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class AverageCalculation {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter first grade ?");
        var grade1 = sca.nextInt();
        sca.nextLine();
        System.out.println("Enter second grade ?");
        var grade2 = sca.nextInt();
        sca.nextLine();
        System.out.println("Enter third grade ?");
        var grade3 = sca.nextInt();

        calculatingAverageStudent(grade1, grade2, grade3);

    }

    private static void calculatingAverageStudent(int grade1, int grade2, int grade3) {
        if (grade1 < 0 || grade2 < 0 || grade3 < 0) {
            System.out.println("grade cannot be negative!!!.");
        }
        int averageGrade = (grade1 + grade2 + grade3) / 3;

        if (averageGrade >= 7) {
            System.out.println("Student passed (:");
        } else {
            System.out.println("Student failed ... try again next year");
        }

    }
}