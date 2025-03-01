package code.vanilson.data_structure.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Ex_003_ReverseArray
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-28
 */
public class Ex_003_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long startTime = System.nanoTime();

        System.out.println("Reverse Array:" + Arrays.toString(reverseArray(arr)));
        System.out.println("Reverse Array foreach:" + Arrays.toString(reverseArrayUsingForeach(arr)));
        System.out.println("Reverse Array streams:" + Arrays.toString(sortArrayInReverseOrder(arr)));
        long endTime = System.nanoTime();
        System.out.println("Execution time : " + (endTime - startTime) / 1000_000 + " ms");

    }

    /**
     * Inverte a ordem dos elementos de um array.
     *
     * @param arr o array a ser invertido
     * @return um novo array com os elementos na ordem inversa, ou o próprio array se for nulo ou vazio
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }

    /**
     * Inverte a ordem dos elementos de um array usando um ‘loop’ foreach.
     *
     * @param arr o array a ser invertido
     * @return um novo array com os elementos na ordem inversa, ou o próprio array se for nulo ou vazio
     */
    public static int[] reverseArrayUsingForeach(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length];
        for (int index : arr) {
            newArr[newArr.length - index] = index; // Esta linha pode causar um erro de índice
        }
        return newArr;
    }

    /**
     * Ordena os elementos de um array em ordem decrescente.
     *
     * @param arr o array a ser ordenado
     * @return um novo array com os elementos ordenados em ordem decrescente
     */
    public static int[] sortArrayInReverseOrder(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    /**
     * Inverte a ordem dos elementos de um array usando IntStream.
     *
     * @param arr o array a ser invertido
     * @return um novo array com os elementos na ordem inversa
     */
    public static int[] reverseArrayUsingIntStream(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
    }

}