/**
 * Author: vanilson muhongo
 * Date:02/06/2025
 * Time:19:29
 * Version:2
 */

package code.vanilson.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {123, 4, 5, 2, 12, 45, 68, 0, 4, 56, 788, 3234, 212, 13};
        var result = reversesArrayImperative(numbers);
        System.out.println("Imperative programming");
        System.out.println("Array reversed :" + Arrays.toString(result));
    }

    public static int[] reversesArrayImperative(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int N = numbers.length - 1;
        int[] reverseArray = new int[numbers.length];
        for (int i = N; i >= 0; i--) {
            reverseArray[N - i] = numbers[i];

        }
        return reverseArray;

    }
}
