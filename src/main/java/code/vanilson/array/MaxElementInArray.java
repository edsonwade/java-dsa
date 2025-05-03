/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:20:36
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] input = {545, 3, 9, 7, 123, 456, 34};
        System.out.println("The max element in array is : " + findMaxElementInArray(input));
        System.out.println("Max element with streams : " + findMaxElementInArrayWithStreams(input));
        System.out.println("Second max element : " + findSecondMaxElementInArray(input));
    }

    protected static int findMaxElementInArray(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int max = Integer.MIN_VALUE;
        for (int index : input) {
            if (index > max) {
                max = index;
            }
        }
        return max;
    }

    protected static int findMaxElementInArrayWithStreams(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        return Arrays.stream(input)
                .max()
                .getAsInt();
    }

    protected static int findSecondMaxElementInArray(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int index : input) {
            if (index > max) {
                secondMax = max;
                 max = index;
            } else if (index > secondMax && index < max) {
                secondMax = index;

            }
        }
        return secondMax;
    }
}
