package code.vanilson.data_structure.array;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * Ex_004_CountEvenAndOddNumbers
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-01
 */
@SuppressWarnings("unused")
public class Ex_004_CountEvenAndOddNumbers {

    public static final String EVEN = "Even: ";
    public static final String ODD = ",Odd: ";

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 6, 10, 27};
        long start = System.nanoTime();
        countEvenAndOddNumbers(arr);
        countEvenAndOddNumbersWithStream(arr);
        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + " ms ");

    }

    /**
     * Conta o número de elementos pares e ímpares em um array de inteiros.
     *
     * @param arr o array de inteiros a ser analisado
     */
    public static void countEvenAndOddNumbers(int[] arr) {
        int countEven = 0;
        int countOdd = 0;

        for (int index : arr) {
            if (index % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println(EVEN + countEven + ODD + countOdd);
    }

    /**
     * Conta o número de elementos pares e ímpares em um array de inteiros usando Streams.
     *
     * @param arr o array de inteiros a ser analisado
     */
    public static void countEvenAndOddNumbersWithStream(int[] arr) {
        AtomicLong evenNumbers = new AtomicLong(Arrays.stream(arr)
                .boxed()
                .filter(even -> even % 2 == 0)
                .count());

        AtomicLong oddNumbers = new AtomicLong(Arrays.stream(arr)
                .boxed()
                .filter(odd -> odd % 2 != 0)
                .filter(even -> even % 2 == 1)
                .count());

        System.out.println(EVEN + evenNumbers.intValue() + ODD + oddNumbers.intValue());
    }

    /**
     * Conta o número de elementos pares e ímpares em um array de inteiros usando Streams e Collections.
     *
     * @param arr o array de inteiros a ser analisado
     */
    public static void countEvenAndOddNumbersWithStreamAndCollections(int[] arr) {
        Map<Boolean, Integer> counts = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.summingInt(e -> 1)));

        int evenCount = counts.get(true);
        int oddCount = counts.get(false);

        System.out.println(EVEN + evenCount + ODD + oddCount);
    }
}

