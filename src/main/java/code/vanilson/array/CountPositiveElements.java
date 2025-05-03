/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:19:41
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;

public class CountPositiveElements {
    public static void main(String[] args) {
        int[] Input = {1, -2, 3, -4, 5};
        System.out.println("Count positive numbers in array using for loop: " + countPositiveNumbersInArrayForLoop(Input));
        System.out.println("Count positive numbers in array using foreach(array and object): " + countPositiveNumbersInArrayForeach(Input));
        System.out.println("Count positive numbers in array using stream operator terminated count(): " + countPositiveNumbersInArrayStreams(Input));

    }

    protected static int countPositiveNumbersInArrayForLoop(int[] numbers) {
        int count = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }
        return count;
    }

    protected static int countPositiveNumbersInArrayForeach(int[] numbers) {
        int count = 0;
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    protected static int countPositiveNumbersInArrayStreams(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        return (int)
                Arrays
                        .stream(numbers)
                        .filter(num -> num > 0)
                        .count();
    }
}
