package code.vanilson.basics;

import java.util.Scanner;

/**
 * PowerCalculation
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number ?");
        double base = sc.nextDouble();
        System.out.println("Enter the power ?");
        int power = sc.nextInt();
        System.out.println("The power of " + base + " and " + power + " is :" + powerCalculation(base, power));
    }

    static double powerCalculation(double base, int power) {
        return Math.pow(base, power);
    }


}