/**
 * Author: vanilson muhongo
 * Date:31/05/2025
 * Time:21:07
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;
import java.util.Objects;

public class FindLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] numbers = {210, 22, 4, 56, 23, 45, 23, 2, 9, 134};
        var result = findSmallestAndLargestElementInArrayInteractive(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findSmallestAndLargestElementInArray(int[] input) {
        validateArrayIsNullOrEmpty(input);
        int maxValue = Arrays.stream(input)
                .summaryStatistics()
                .getMax();
        int minValue = Arrays.stream(input)
                .summaryStatistics()
                .getMin();
        return new int[]{minValue, maxValue};
    }

    public static int[] findSmallestAndLargestElementInArrayInteractive(int[] input) {
        validateArrayIsNullOrEmpty(input);
        int maxValue = input[0];
        int minValue = input[0];
        for (int index : input) {
            if (index > maxValue) {
                maxValue = index;
            } else if (index < minValue) {
                minValue = index;

            }
        }

        return new int[]{minValue, maxValue};
    }

    public static void validateArrayIsNullOrEmpty(int[] input) {
        if (Objects.isNull(input) || input.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
    }
}
