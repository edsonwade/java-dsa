/**
 * Author: vanilson muhongo
 * Date:17/05/2025
 * Time:20:12
 * Version:2
 */

package code.vanilson.math_exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        var number = 0;
        do {
            System.out.println("Enter the number ?");
            number = sca.nextInt();
            System.out.println("The factorial of " + number + " is: " + factorialImperative(number));
        } while (number > 0);

        System.out.print("factorial Recursive n%s: " + factorialRecursive(BigInteger.valueOf(120)));
    }

    protected static int factorialImperative(int number) {
        int fact = 1;
        if (number < 1) return -1;
        int i = number;
        while (i >= 1) {
            fact *= i;
            i--;
        }
        return fact;
    }

    protected static BigInteger factorialRecursive(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return number.multiply(factorialRecursive(number.subtract(BigInteger.ONE)));
    }
}
