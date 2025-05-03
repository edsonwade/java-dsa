/**
 * Author: vanilson muhongo
 * Date:03/05/2025
 * Time:14:31
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;
import java.util.Objects;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 34, 5, 76, 2, 0, 3, 12,};
        int[] numbers = {1, -2, 3, -4, 5};
        System.out.println("after refactor : " + Arrays.toString(moveZeroToEnd(arr)));
        System.out.println("replaced negative by positive : " + Arrays.toString(replacingNegativeNumberByZero(numbers)));
    }

    protected static int[] moveZeroToEnd(int[] arr) {
        if (Objects.isNull(arr) || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null ,neither empty");
        Arrays.sort(arr);
        int[] resultado = new int[arr.length];
        var index = 0;
        for (int j : arr) {
            if (j != 0)
                resultado[index++] = j;
        }
        return resultado;


    }

    static int[] replacingNegativeNumberByZero(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null ,neither empty");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        return numbers;

    }
}
