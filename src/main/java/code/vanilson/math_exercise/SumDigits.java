/**
 * Author: vanilson muhongo
 * Date:17/05/2025
 * Time:21:06
 * Version:1
 */

package code.vanilson.math_exercise;

public class SumDigits {
    public static void main(String[] args) {
        int number = 123;
        System.out.println("the sum of digits is : " + sumOfDigits(number));
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit
        }
        return sum;
    }
}
