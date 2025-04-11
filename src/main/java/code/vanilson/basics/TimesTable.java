package code.vanilson.basics;

import java.util.Scanner;

/**
 * TimesTable
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-09
 */
public class TimesTable {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number ?");
        var numbers = sca.nextInt();
        // System.out.println("Tabuada de " + numbers);
        // findTimesTableOfGivenNumber(numbers);

        System.out.println("is prime ? " + isPrime(numbers));

    }

    private static void findTimesTableOfGivenNumber(int numbers) {
        if (numbers < 0) {
            throw new IllegalArgumentException("Times table is not defined for negative numbers.");
        }
        for (int i = 1; i <= 12; i++) {
            var result = numbers * i;
            System.out.println(numbers + "*" + i + "=" + result);
        }
    }

    static boolean isPrime(int prime) {
        if (prime < 2) {
            throw new IllegalArgumentException("prime is not defined for negative numbers.");
        }
        for (int i = 2; i < Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}