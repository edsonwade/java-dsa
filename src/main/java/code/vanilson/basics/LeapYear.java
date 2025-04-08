package code.vanilson.basics;

import java.time.Year;
import java.util.Scanner;

/**
 * LeapYear
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the year  ?");
        var year = sca.nextInt();

        checkingLeapYear(year);
        System.out.println("is leap year ? " + isLeapYear(year));

    }

     static void checkingLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " é um ano Bissexto");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " é um ano Bissexto");
        } else {
            System.out.println(year + " não é um ano Bissexto");
        }
    }

     static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

}