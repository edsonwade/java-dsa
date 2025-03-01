package code.vanilson.data_structure.array;

import java.util.Arrays;

/**
 * Ex_001_Sum_Of_Array_Element
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-27
 */
@SuppressWarnings("all")
public class Ex_001_Sum_Of_Array_Element {
    public static void main(String[] args) {
        int[] arr_1 = {};
        int[] arr = {1, 2, 3, 4, 5, 121, 14641, 20736, 361, 25921, 361, 20736, 361, 121, 144, 19, 161, 19, 144, 19, 11,
                121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144, 19,
                11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144,
                19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19,
                144, 19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161, 19, 144, 19, 11, 121, 144, 19, 161,
                19, 121, 144, 19, 161, 19, 144, 19, 11};
        long start = System.nanoTime();
        System.out.println("The sum total is second : " + sumArrayUsingStreams(arr_1));
        long end = System.nanoTime();
        System.out.println("The time execution : " + (end - start) / 1_000_000 + " milliseconds");

        //Time execution is high beacuase is increase linear.

    }

    /**
     * Sums the elements of the given integer array using a traditional for loop.
     *
     * @param arr the array of integers to sum
     * @return the total sum of the array elements
     */
    public static int sumArray(int[] arr) {
        // Initialize the sum to zero
        int sum = 0;
        if (arr == null && arr.length == 0) {
            return 0;
        }
        // Iterate through the array until the condition is false
        for (int i = 0; i < arr.length; i++) {
            // Add each element at position arr[i] to the sum
            sum += arr[i];
        }
        // Return the total sum
        return sum;
    }

    /**
     * Sums the elements of the given integer array using an enhanced for loop (foreach).
     *
     * @param arr the array of integers to sum
     * @return the total sum of the array elements
     */
    public static int sumArrayUsingForEach(int[] arr) {
        // Initialize the sum to zero
        int sum = 0;
        // validate if array is null
        if (arr == null || arr.length == 0) {
            return sum;
        }
        // Iterate through each element in the array
        for (int element : arr) {
            // Add each element to the sum
            sum += element;
        }
        // Return the total sum
        return sum;
    }

    /**
     * Sums the elements of the given integer array using Java Streams.
     *
     * @param arr the array of integers to sum
     * @return the total sum of the array elements
     */
    public static int sumArrayUsingStreams(int[] arr) {
        // Use Java Streams to sum the elements of the array
        if (arr == null) {
            return 0;
        }
        return Arrays.stream(arr).sum();
    }

    /**
     * Sums the elements of the given integer array using Java Streams and the reduce method.
     *
     * @param arr the array of integers to sum
     * @return the total sum of the array elements, or 0 if the array is null
     */
    public static int sumArrayUsingStreamsWithReduce(int[] arr) {
        // If the array is null, return 0
        if (arr == null) {
            return 0;
        }
        // Use Java Streams to sum the elements of the array with reduce
        return Arrays.stream(arr)
                .reduce(0, Integer::sum);
    }

}