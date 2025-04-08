package code.vanilson.data_structure.array;

/**
 * Intro
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-01-27
 */

import java.util.Arrays;

/**
 * Array is a collection of similar types of elements that have contiguous memory location.
 * Array is a fixed size data.txt structure while ArrayList is a variable size Collection class.
 * Array can contain primitive data.txt types as well as objects of a class depending on the definition of the array.
 * ArrayList only supports object entries, not the primitive data.txt types.
 * Array can be multidimensional.
 * Array can be used to store multiple values in a single variable, instead of declaring separate variables for each value.
 * Array can be used to implement other data.txt structures like Stacks, Queues, Heaps, Hash tables, etc.
 */

public class Intro {
    /**
     * Array é uma coleção de tipos semelhantes de elementos que têm localização de memória contígua.
     * Array é uma estrutura de dados de tamanho fixo, enquanto ArrayList é uma classe de coleção de tamanho variável.
     * Array pode conter tipos de dados primitivos, bem como objetos de uma classe, dependendo da definição do array.
     * ArrayList suporta apenas entradas de objetos, não os tipos de dados primitivos.
     * Array pode ser multidimensional.
     * Array pode ser usado para armazenar vários valores em uma única variável, em vez de declarar variáveis separadasusado para implementar outras estruturas de dados como Pilhas, Filas, Heaps, Tabelas de Hash, etc para cada valor.
     * * Array pode ser .
     */
    public static void main(String[] args) {

        //initialize an array
        int[] arr = new int[5]; // 5 is the size of the array
        //initialize an array with values
        int[] arr1 = {1, 2, 3, 4, 5}; // 5 is the size of the array
        //initialize an array with values

        System.out.println("Array length : " + Arrays.toString(compareArray(arr1, 7)));

        //accessing an array element
        System.out.println("Accessing an array element");
        System.out.println(arr1[0]); // 1
        System.out.println(arr1[1]); // 2
        System.out.println(arr1[2]); // 3
        System.out.println(arr1[3]); // 4

        //changing an array element
        arr1[0] = 10;
        System.out.println("After changing the value of the first element");
        System.out.println(arr1[0]); // 10

        //iterating an array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Iterating an array");
            System.out.println(arr1[i]);
        }

        //iterating an array using for-each loop
        for (int i : arr1) {
            System.out.println("Iterating an array using for-each loop");
            System.out.println(i);
        }

        //multidimensional array
        int[][] arr2 = new int[2][3]; // 2 is the number of rows and 3 is the number of columns
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}}; // 2 is the number of rows and 3 is the number of columns

        //accessing a multidimensional array element
        System.out.println("");
        System.out.println(arr3[0][0]); // 1
        System.out.println(arr3[0][1]); // 2
        System.out.println(arr3[0][2]); // 3
        System.out.println(arr3[1][0]); // 4
        System.out.println(arr3[1][1]); // 5
        System.out.println(arr3[1][2]); // 6

        //changing a multidimensional array element
        arr3[0][0] = 10;
        System.out.println("After changing the value of the first element");
        System.out.println(arr3[0][0]); // 10

        //iterating a multidimensional array
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("Iterating a multidimensional array");
                System.out.println(arr3[i][j]);
            }
        }

        //iterating multidimensional using for-each loop
        for (int[] i : arr3) {
            System.out.println("Iterating multidimensional using for-each loop");
            for (int j : i) {
                System.out.println(j);
            }
        }

    }

    static int[] compareArray(int[] arr1, int target) {
        for (int i = 0; i < arr1.length - 1; i++) {
            int soma = arr1[i] + arr1[i + 1];
            if (soma == target) {
                return new int[]{i, i + 1};
            }
        }
        return new int[0];

    }
}