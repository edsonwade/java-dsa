/**
 * Author: vanilson muhongo
 * Date:17/05/2025
 * Time:20:48
 * Version:
 */

package code.vanilson.math_exercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter the number : ?");
            number = sca.nextInt();
            System.out.println("The number " + number + " is " + isPrimeNumber(number));
        } while (number > 0);
    }

    protected static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {// Check if the number is divisible by i
                return false; //If it is divisible, it's not prime
            }
        }
        return true; //If no divisors were found, it is prime
    }
}
