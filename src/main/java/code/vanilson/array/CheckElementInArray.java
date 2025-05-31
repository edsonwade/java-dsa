/**
 * Author: vanilson muhongo
 * Date:31/05/2025
 * Time:21:26
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;

import static code.vanilson.array.FindLargestAndSmallestElement.validateArrayIsNullOrEmpty;

public class CheckElementInArray {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        System.out.println("Is number present in array ? " + isNumberPresentInArray(number, 3));
        System.out.println("Is number present in array using stream ? " + isNumberPresentInArrayStream(number, 13));

    }

    public static boolean isNumberPresentInArray(int[] number, int key) {
        validateArrayIsNullOrEmpty(number);
        for (int index : number) {
            if (index == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberPresentInArrayStream(int[] number, int key) {
        validateArrayIsNullOrEmpty(number);
        return Arrays.stream(number)
                .filter(num -> num == key)
                .isParallel();
    }
}
