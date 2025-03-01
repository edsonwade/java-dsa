package code.vanilson.data_structure.array;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Ex_004_CountEvenAndOddNumbers
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-01
 */
@SuppressWarnings("unused")
public class Ex_005_FindSecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {345, 2, 4, 3, 123, 345, 1, 0, 34, 56, 78, 145_000};
        int[] arr_1 = {345, 345, 345};
        long start = System.nanoTime();
        System.out.println("Second largest element in array: " + (findSecondLargestElement(arr)));
        System.out.println("Second largest element in array not found: " + (findSecondLargestElement(arr_1)));
        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + " ms ");

    }

    /**
     * Encontra o segundo maior elemento em um array de inteiros.
     *
     * @param arr O array de inteiros onde será buscado o segundo maior elemento.
     * @return O segundo maior elemento do array, ou -1 se o array for nulo ou vazio.
     */
    public static int findSecondLargestElement(int[] arr) {
        // Inicializa a variável maxValue com o menor valor possível para um inteiro.
        int maxValue = Integer.MIN_VALUE;
        // Inicializa a variável secondlargest com o menor valor possível para um inteiro.
        int secondlargest = Integer.MIN_VALUE;

        // Verifica se o array é nulo ou se está vazio.
        if (arr == null || arr.length == 0) {
            // Retorna -1 se o array for nulo ou vazio.
            return -1;
        }

        // Percorre cada elemento do array.
        for (int index : arr) {
            // Se o elemento atual for maior que maxValue, atualiza maxValue e secondlargest.
            if (index > maxValue) {
                secondlargest = maxValue; // O segundo maior se torna o maior anterior.
                maxValue = index; // Atualiza o maior para o novo valor.
                // Se o elemento atual for maior que secondlargest e menor que maxValue, atualiza secondlargest.
            } else if (index > secondlargest && index < maxValue) {
                secondlargest = index; // Atualiza o segundo maior.
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Second largest element not found");
        }

        // Retorna o segundo maior elemento encontrado.
        return secondlargest;
    }

    /**
     * Encontra o segundo maior elemento em um array de inteiros utilizando Streams.
     *
     * @param arr O array de inteiros onde será buscado o segundo maior elemento.
     * @return O segundo maior elemento do array, ou -1 se o array for nulo ou vazio.
     */
    public static int findSecondLargestElementUsingStreams(int[] arr) {
        // Verifica se o array é nulo ou vazio.
        if (arr == null || arr.length == 0) {
            return -1; // Retorna -1 se o array for nulo ou vazio.
        }
        int skipLargestElements = arr.length - 2;

        // Utiliza Streams para encontrar o segundo maior elemento.
        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct() // Remove duplicatas
                .sorted() // Ordena os elementos
                .skip(skipLargestElements) // Pula os maiores elementos até o segundo maior
                .findFirst(); // Encontra o primeiro elemento após o skip

        // Retorna o segundo maior elemento se presente, caso contrário, retorna -1.
        return secondLargest.orElse(-1);
    }

}

