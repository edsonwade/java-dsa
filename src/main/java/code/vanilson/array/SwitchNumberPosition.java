/**
 * Author: vanilson muhongo
 * Date:17/05/2025
 * Time:21:21
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;
import java.util.Objects;

public class SwitchNumberPosition {
    public static void main(String[] args) {
        int[] number = {210, 22, 4, 56, 23, 45, 23, 2, 9, 134};
        System.out.println(Arrays.toString(changePositionBetweenLargestAndSmallestNumbersInArray(number)));
    }

    static int[] changePositionBetweenLargestAndSmallestNumbersInArray(int[] number) {
        int maxValue = 0;
        int minValue = 0;
        if (Objects.isNull(number) || number.length == 0)
            throw new IllegalArgumentException("Array cannot be null ,neither empty");
        for (int i = 1; i < number.length; i++) {
            if (number[i] > number[maxValue]) {
                maxValue = i;
            } else if (number[i] < number[minValue]) {
                minValue = i;

            }

        }
        // Swap the largest and smallest numbers
        swap(number, maxValue, minValue);
        return number;
    }

    private static void swap(int[] number, int maxValue, int minValue) {
        int temp = number[maxValue];
        number[maxValue] = number[minValue];
        number[minValue] = temp;
    }

}
