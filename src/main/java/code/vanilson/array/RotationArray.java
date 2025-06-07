/**
 * Author: vanilson muhongo
 * Date:02/06/2025
 * Time:20:01
 * Version:1
 */

package code.vanilson.array;

import java.util.Arrays;

import static code.vanilson.array.FindLargestAndSmallestElement.validateArrayIsNullOrEmpty;

public class RotationArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateK(array, 2))); //

    }

    public static int[] rotateK(int[] array, int k) {
        validateArrayIsNullOrEmpty(array);
        int n = array.length;
        k = k % n; // Para evitar rotação maior que o tamanho
        int[] resultado = new int[n];
        // Copia os últimos k elementos para o início
        if (k >= 0) System.arraycopy(array, n - k, resultado, 0, k);
        // Copia os primeiros n - k elementos para depois
        if (n - k >= 0) System.arraycopy(array, 0, resultado, k, n - k);

        return resultado;
    }
}

/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;

        int n = array.length;
        k = k % n; // Para evitar rotação maior que o tamanho

        int[] resultado = new int[n];

        // Copia os últimos k elementos para o início
        for (int i = 0; i < k; i++) {
            resultado[i] = array[n - k + i];
        }

        // Copia os primeiros n - k elementos para depois
        for (int i = k; i < n; i++) {
            resultado[i] = array[i - k];
        }

        // Mostrar resultado
        System.out.println(Arrays.toString(resultado)); // [4, 5, 1, 2, 3]
    }
}

 */
