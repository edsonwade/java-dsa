package code.vanilson.data_structure.array.revision;

import java.util.Arrays;

/**
 * FindSumOfAllELmentsInArray
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-02
 */
public class FindSumOfAllELmentsInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long startTime = System.nanoTime();
        int sumTotal = sumOfArrayElements(numbers);
        System.out.println("Sum of Array Elements: " + sumTotal);
        System.out.println(
                "Sum of Array Elements streams operator reduce: " + sumUsingStreamReduce(numbers));
        System.out.println(
                "Sum of Array Elements streams operator sum: " + sumUsingStreamSum(numbers));
        long endTime = System.nanoTime();
        System.out.println("Elapsed time: " + (endTime - startTime) / 1000000 + "ms");
    }

    private static int sumOfArrayElements(int[] numbers) {
        int sum = 0;
        if (isArrayNullOrEmpty(numbers)) {
            return 0; // Retorna 0 se o array for nulo ou vazio
        }
        for (int index : numbers) sum += index;
        return sum;
    }

    private static int sumUsingStreamReduce(int[] numbers) {
        if (isArrayNullOrEmpty(numbers)) {
            return 0;
        }
        return Arrays
                .stream(numbers)
                .reduce(0, Integer::sum);
    }

    private static int sumUsingStreamSum(int[] numbers) {
        if (isArrayNullOrEmpty(numbers)) {
            return 0;
        }
        return Arrays
                .stream(numbers)
                .sum();
    }

    public static boolean isArrayNullOrEmpty(int[] numbers) {
        return numbers == null || numbers.length == 0;
    }
}