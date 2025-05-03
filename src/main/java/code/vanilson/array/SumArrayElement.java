/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:19:11
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;

public class SumArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements for loop: " + calculateSumArrayElementsForLoop(arr));
        System.out.println("Sum of array elements foreach: " + calculateSumArrayElementsForeach(arr));
        System.out.println("Stream Terminate Operator sum");
        System.out.println("Sum total: " + calculateSumArrayElementsUsingStreams(arr));
        System.out.println("Stream Terminate Operator Reduce");
        System.out.println("The sum is: " + calculateSumArrayElementsUsingStreamReduce(arr));
    }


    private static int calculateSumArrayElementsForLoop(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int sum = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            sum += numbers[index];
        }
        return sum;
    }


    private static int calculateSumArrayElementsForeach(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int sum = 0;
        for (int index : numbers) {
            sum += index;
        }
        return sum;
    }

    private static int calculateSumArrayElementsUsingStreams(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        return Arrays.stream(numbers)
                .sum();
    }

    private static int calculateSumArrayElementsUsingStreamReduce(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        return Arrays.stream(numbers)
                .reduce(0, Integer::sum);
    }
}
