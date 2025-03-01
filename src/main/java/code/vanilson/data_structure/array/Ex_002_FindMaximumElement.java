package code.vanilson.data_structure.array;

import java.util.Arrays;

/**
 * Ex_002_FindMaximumElement
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-27
 */
@SuppressWarnings("all")
public class Ex_002_FindMaximumElement {

    public static void main(String[] args) {
        int[] arr_1 = {};
        int[] arr = {1, 2, 3, 4, 5, 121, 14641, 20736, 361, 25921, 361, 121, 144, 19, 161, 19, 144, 19, 11};
        long start = System.nanoTime();

        System.out.println("The max elemnt in array is : " + findTheMaxElmentInArrayStreamReduce(arr));
        System.out.println("The max elemnt in array is : " + findTheMaxElmentInArrayUsingForLoop(arr));
        System.out.println("The max elemnt in array is : " + findTheMaxElmentInArrayStreamMax(arr));
        System.out.println("The max elemnt in array is : " + findTheMaxElmentInArrayStreamMax(arr));
        long end = System.nanoTime();

        System.out.println("Execution time  : " + (end - start) / 1000_000 + " ms ");
    }

    /**
     * Finds the maximum element in an array using a for loop.
     *
     * @param arr the array of integers to search for the maximum element
     * @return the maximum element in the array, or 0 if the array is null or empty
     */
    public static int findTheMaxElmentInArrayUsingForLoop(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * Finds the maximum element in an array using a for-each loop.
     *
     * @param arr the array of integers to search for the maximum element
     * @return the maximum element in the array, or 0 if the array is null or empty
     */
    public static int findTheMaxElmentInArrayUsingForEach(int[] arr) {
        int maxElementinArray = arr[0];
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int index : arr) {
            if (index > maxElementinArray) {
                maxElementinArray = index;
            }
        }
        return maxElementinArray;
    }

    /**
     * Finds the maximum element in an array using streams.
     *
     * @param arr the array of integers to search for the maximum element
     * @return the maximum element in the array, or 0 if the array is null or empty
     */
    public static int findTheMaxElmentInArrayStreamMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }

    /**
     * Finds the maximum element in an array using streams with reduce.
     *
     * @param arr the array of integers to search for the maximum element
     * @return the maximum element in the array, or 0 if the array is null or empty
     */
    public static int findTheMaxElmentInArrayStreamReduce(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr)
                .reduce(0, Integer::max);
    }

}