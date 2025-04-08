package code.vanilson.basics;

import java.util.Scanner;

import static code.vanilson.basics.Age.*;

/**
 * ReadPersonAge
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-08
 */
public class ReadPersonAge {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter person age ?");
        var age = sca.nextInt();

        ageClassification(age);

    }

    private static void ageClassification(int age) {
        if (age >= 0 && age <= 12) {
            System.out.println(CHILD);
        } else if (age >= 13 && age <= 17) {
            System.out.println(TEEN);
        } else if (age >= 18 && age <= 64) {
            System.out.println(ADULT);
        } else if (age >= 65) {
            System.out.println(OLD);
        } else {
            System.out.println("age cannot be negative");
        }

    }

}