package code.vanilson.basics;

import java.util.Scanner;

/**
 * WeightedAverageCalculation
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class WeightedAverageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist note: ");
        int note1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the first weight: ");
        int weigth1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second note: ");
        int note2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second weight: ");
        int weigth2 = sc.nextInt();
        sc.nextLine();

        System.out.println(
                "Weighted Average Calculation is : " + calculateWeightedAverage(note1, weigth1, note2, weigth2));

    }

    static int calculateWeightedAverage(int note1, int weigth1, int note2, int weigth2) {
        if (note1 < 0 || note2 < 0 || weigth1 < 0 || weigth2 < 0) {
            throw new IllegalArgumentException("Notes must be non-negative");
        }
        return (note1 * weigth1 + note2 * weigth2) / (weigth1 + weigth2);
    }
}