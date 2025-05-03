/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:21:47
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] palindrome = {1, 2, 3, 2, 1};
        int[] numbers = {1, 2, 3, 5, 6};
        System.out.println("The arrays is palindrome ? " + isPalindromeArrayStreams(palindrome));
        System.out.println(" is REVERSED ? " + Arrays.toString(reversedArray(numbers)));
    }

    private static boolean isPalindromeArray(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null, neither empty");
        int[] reversedArray = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[reversedArray.length - 1 - i] = numbers[i];
        }
        return Arrays.equals(numbers, reversedArray);
    }

    private static boolean isPalindromeArrayStreams(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null, neither empty");
        var reversedArray = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        return Arrays.equals(reversedArray, numbers);
    }

    private static int[] reversedArray(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null, neither empty");
        return Arrays
                .stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

