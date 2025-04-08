package code.vanilson.data_structure.array.revision;

import java.util.Arrays;
import java.util.stream.Collectors;

import static code.vanilson.data_structure.array.revision.FindSumOfAllELmentsInArray.isArrayNullOrEmpty;

/**
 * CountOddAndEvenInArray
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-02
 */
public class CountOddAndEvenInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        countEvenAndOddElementsInArray(arr);
        countEvenAndOddNumbersWithStreamAndCollections(arr);
    }

    private static void countEvenAndOddElementsInArray(int[] arr) {
        int countOdd = 0;
        int countEven = 0;
        if (isArrayNullOrEmpty(arr)) {
            System.out.println("The array is null or empty");
        }
        for (int index : arr) {
            if (index % 2 == 0) {
                countEven++;

            } else {
                countOdd++;

            }
        }
        System.out.println("Even: " + countEven + " Odd: " + countOdd);

    }

    private static void countEvenAndOddNumbersWithStreamAndCollections(int[] arr) {

        var countElements = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.summingInt(e->1)));

        int evenCount = countElements.get(true);
        int oddCount = countElements.get(false);

        System.out.println("Even: " + evenCount + ",Odd:" + oddCount);

    }
}