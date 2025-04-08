package code.vanilson.data_structure.array.revision;

import java.util.Arrays;

import static code.vanilson.data_structure.array.revision.FindSumOfAllELmentsInArray.isArrayNullOrEmpty;

/**
 * FindMaxElmentInArray
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-02
 */
public class FindMaxElmentInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.nanoTime();
        System.out.println("The max element in array  is : " + findMaxElementInArray(array));
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) / 1000000 + " ms");
        long st = System.nanoTime();
        System.out.println(
                "The max element in array with stream max is : " + findMaxElementInArrayUsingStreamMax(array));
        long ed = System.nanoTime();
        System.out.println("Execution time: " + (ed - st) / 1000000 + " ms");

        System.out.println(
                "The max element in array with stream max is" + findMaxElementInArrayUsingStreamReduce(array));
    }

    private static int findMaxElementInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (isArrayNullOrEmpty(arr)) {return 0;}
        for (int index : arr) {
            if (index > max) {
                max = index;
            }
        }
        return max;
    }

    private static int findMaxElementInArrayUsingStreamMax(int[] arr) {
        if (isArrayNullOrEmpty(arr)) {return 0;}
        return Arrays.stream(arr)
                .max()
                .orElse(0);
    }

    private static int findMaxElementInArrayUsingStreamReduce(int[] arr) {
        if (isArrayNullOrEmpty(arr)) {return 0;}
        return Arrays.stream(arr)
                .reduce(0, Integer::max);
    }
}