package code.vanilson.basics;

import java.util.Scanner;

/**
 * OddOrEven
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class OddOrEven {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a number:");
        var number = sca.nextInt();
        checkOddOrEven(number);
    }

    /**
     * Given a number ,check if is odd or even
     *
     * @param num inout data
     */
    private static void checkOddOrEven(int num) {
        if (num < 0) {
            System.out.println("The number must be positive !!!");
        }

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is par");
        } else {
            System.out.println("The number " + num + " is impar");
        }

    }
}