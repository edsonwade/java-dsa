package code.vanilson.data_structure.array.revision;

import java.util.Arrays;
import java.util.Comparator;

import static code.vanilson.data_structure.array.revision.FindSumOfAllELmentsInArray.isArrayNullOrEmpty;

/**
 * FindSecondLargestElement
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-02
 */
public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1234, 3456, 789, 1, 4, 4567, 2234, 1000, 456, 2, 5, 7, 8};
        System.out.println("The seconde largest element in array is : " + findSecondLargestElementInArray(arr));
        System.out.println("The seconde largest element in array using stream : " +
                findSecondLargestElementInArrayUsingStreams(arr));
    }

    /**
     * Encontra o segundo maior elemento em um array de inteiros.
     * <p></p>
     * Este método percorre o array fornecido e determina o maior e o segundo maior
     * elementos. Se o array estiver vazio ou nulo, o método retorna 0.
     *
     * @param arr O array de inteiros a ser analisado.
     * @return O segundo maior elemento no array. Se o array estiver vazio ou nulo,
     * retorna 0. Se não houver um segundo maior elemento (por exemplo, se
     * todos os elementos forem iguais), retorna o valor máximo inteiro.
     */
    private static int findSecondLargestElementInArray(int[] arr) {
        int maxValue = Integer.MIN_VALUE; // Inicializa o maior valor com o menor valor possível
        int secondMaxValue = Integer.MAX_VALUE; // Inicializa o segundo maior valor com o maior valor possível
        if (isArrayNullOrEmpty(arr)) {return 0;} // Verifica se o array é nulo ou vazio

        for (int index : arr) { // Percorre cada elemento do array
            if (index > maxValue) { // Se o elemento atual é maior que o maior valor encontrado
                secondMaxValue = maxValue; // O maior valor atual se torna o segundo maior
                maxValue = index; // Atualiza o maior valor
            } else if (index > secondMaxValue &&
                    index < maxValue) { // Se o elemento atual é menor que o maior, mas maior que o segundo maior
                secondMaxValue = index; // Atualiza o segundo maior valor
            }
        }
        return secondMaxValue; // Retorna o segundo maior valor encontrado
    }

    /**
     * Encontra o segundo maior elemento em um array de inteiros usando Streams.
     * <p>
     * Este método utiliza a API de Streams para encontrar o segundo maior elemento
     * no array fornecido. Se o array estiver vazio ou nulo, o método retorna 0.
     *
     * @param arr O array de inteiros a ser analisado.
     * @return O segundo maior elemento no array. Se o array estiver vazio ou nulo,
     * retorna 0. Se não houver um segundo maior elemento (por exemplo, se
     * todos os elementos forem iguais), retorna o valor máximo inteiro.
     */
    private static int findSecondLargestElementInArrayUsingStreams(int[] arr) {
        if (isArrayNullOrEmpty(arr)) {
            return 0; // Verifica se o array é nulo ou vazio
        }

        // Usa streams para encontrar o segundo maior elemento
        var result = Arrays.stream(arr) // Cria um stream a partir do array
                .distinct() // Remove duplicatas
                .boxed()  //Converte para Stream<Integer> para usar métodos de comparação
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1)  // Ignora o maior elemento
                .findFirst();// Encontra o primeiro elemento restante, que é o segundo maior

        return result.orElse(0); // Retorna o segundo maior ou 0 se não existir
    }

}