package code.vanilson.basics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Factorial
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-09
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number ?");
        var factorial = sca.nextInt();
        var result = calculateFactorial(factorial);
        System.out.println("The factorial of " + factorial + " is :" + result);
    }

    static int calculateFactorial(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int fact = 1; // Porque nãomexiste fatorial de zero
        //!5 = !4 = !3 = !2 = !1
        int i = number;
        while (i > 0) {
            // atualiza o valor do fact
            fact *= i;
            i--;
        }

        return fact;
    }

    private static BigInteger calculateFactorialRescursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(number).multiply(calculateFactorialRescursive(number - 1));
    }
}