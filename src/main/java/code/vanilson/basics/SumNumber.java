package code.vanilson.basics;

import java.util.Scanner;

/**
 * SumNumber
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-09
 */
public class SumNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number ?");
        var numbers = sca.nextInt();
        System.out.println("Total sum is : " + sumTotalPositiveNumber(numbers));

    }

    static int sumTotalPositiveNumbers(int numbers) {
        int sum = 0;
        if (numbers < 0) {
            throw new IllegalArgumentException("The sum is not defined for negative numbers.");
        }

        for (int i = 0; i < numbers; i++) {
            sum += i;
        }
        return sum;
    }

    static int sumTotalPositiveNumber(int numbers) {
        int sum = 0;
        if (numbers < 0) {
            throw new IllegalArgumentException("The sum is not defined for negative numbers.");
        }
        for (int i = 0; i <= numbers; i++) {
            sum = Integer.sum(sum, i);
        }
        return sum;
    }
}