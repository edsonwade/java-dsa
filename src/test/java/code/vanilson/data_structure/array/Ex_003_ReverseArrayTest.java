package code.vanilson.data_structure.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SuppressWarnings("all")
class Ex_003_ReverseArrayTest {
    // Método de teste para reverseArray
    @ParameterizedTest
    @MethodSource("provideArraysForReverseArray")
    void reverseArray(int[] input, int[] expected) {
        assertArrayEquals(expected, Ex_003_ReverseArray.reverseArray(input));
    }

    // Método de teste para reverseArrayUsingForeach
    @ParameterizedTest
    @MethodSource("provideArraysForReverseArray")
    void reverseArrayUsingForeach(int[] input, int[] expected) {
        assertArrayEquals(expected, Ex_003_ReverseArray.reverseArrayUsingForeach(input));
    }

    // Método de teste para sortArrayInReverseOrder
    @ParameterizedTest
    @MethodSource("provideArraysForSortArrayInReverseOrder")
    void sortArrayInReverseOrder(int[] input, int[] expected) {
        assertArrayEquals(expected, Ex_003_ReverseArray.sortArrayInReverseOrder(input));
    }

    // Método de teste para reverseArrayUsingIntStream
    @ParameterizedTest
    @MethodSource("provideArraysForReverseArray")
    void reverseArrayUsingIntStream(int[] input, int[] expected) {
        assertArrayEquals(expected, Ex_003_ReverseArray.reverseArrayUsingIntStream(input));
    }

    // Fornece dados para os testes de reverseArray e reverseArrayUsingForeach
    private static Object[][] provideArraysForReverseArray() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{3, 2, 1}},
                {new int[]{}, new int[]{}},
                {null, null} // Teste para array nulo
        };
    }

    // Fornece dados para o teste de sortArrayInReverseOrder
    private static Object[][] provideArraysForSortArrayInReverseOrder() {
        return new Object[][]{
                {new int[]{1, 2, 3}, new int[]{3, 2, 1}},
                {new int[]{5, 3, 1, 4, 2}, new int[]{5, 4, 3, 2, 1}},
                {new int[]{}, new int[]{}},
                {null, null} // Teste para array nulo
        };
    }

}