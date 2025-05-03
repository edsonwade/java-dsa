/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:21:11
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] numbers = {123, 4, 56, 7, 8, 9, 6, 5, 4, 3, 123, 56, 6, 7, 5, 8, 3, 2, 9, 5, 6, 5};
        var results = removeDuplicateElementInArray(numbers);
        System.out.println("Array after remove duplicated elements : " + Arrays.toString(removeDuplicateElementInArray(results)));
        System.out.println("Array after remove duplicated elements with stream : " + Arrays.toString(removeDuplicateElementInArrayUsingSet(results)));

    }

    static int[] removeDuplicateElementInArray(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null neither empty");
        return Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    static int[] removeDuplicateElementInArrayUsingSet(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0)
            throw new IllegalArgumentException("Array cannot be null neither empty");
        Set<Integer> integers = new HashSet<>();
        for (int number : numbers) integers.add(number);
        return integers
                .stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}

