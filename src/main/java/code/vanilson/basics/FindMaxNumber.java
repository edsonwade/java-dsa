package code.vanilson.basics;

import java.util.Scanner;

/**
 * FindMaxNumber
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
@SuppressWarnings("unused")
public class FindMaxNumber {

    public static final String MUST_BE_POSITIVE = "Both numbers must be positive.";

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter first number :");
        var firstNumber = sca.nextInt();
        sca.nextLine();
        System.out.println("Enter second number :");
        var secondNumber = sca.nextInt();
        int result = findTheMaxPositiveBetweenTwoGivenNumbers(firstNumber, secondNumber);

        System.out.println("The max number between " + firstNumber + " and " + secondNumber + " is : " + result);

    }

    static int findTheMaxPositiveBetweenTwoGivenNumbers(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException(MUST_BE_POSITIVE);
        }
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    static int findTheMaxPositiveBetweenTwoGivenNumbersUsingMathMax(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException(MUST_BE_POSITIVE);
        }
        return Math.max(num1, num2);
    }

    static int findTheMaxPositiveBetweenTwoGivenNumbersUsingWrapperInteger(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException(MUST_BE_POSITIVE);
        }
        return Integer.max(num1, num2);
    }
}