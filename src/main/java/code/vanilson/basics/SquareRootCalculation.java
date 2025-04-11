package code.vanilson.basics;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * SquareRootCalculation
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class SquareRootCalculation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
//        BigDecimal side = BigDecimal.valueOf(sc.nextDouble());
//        System.out.println("The square root of " + side + " is " + squareRoot(side));
        double root = sc.nextDouble();
        System.out.println("The square root of " + root + " is " + squareRoot01(root));

    }

    @SuppressWarnings("unused")
    static BigDecimal squareRoot(BigDecimal side) {
        if (side.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("The square root should be a positive number");
        }
        return BigDecimal.valueOf(sqrt(side.doubleValue()));
    }

    static double squareRoot01(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("The square root should be a positive number");
        }
        return Math.sqrt(side);
    }


}