package code.vanilson.basics;

import java.util.Scanner;

/**
 * PositiveOrNegative
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class PositiveOrNegative {

    public static final String THE_NUMBER = "The number ";

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the value :");
        var number = sca.nextInt();
        identifyNumberType(number);

    }

    private static void identifyNumberType(int number) {
        if (number > 0) {
            System.out.println(THE_NUMBER + number + " is positive");
        } else if (number < 0) {
            System.out.println(THE_NUMBER + number + " is negative");

        } else {
            System.out.println(THE_NUMBER + number + " is zero");
        }

    }

}