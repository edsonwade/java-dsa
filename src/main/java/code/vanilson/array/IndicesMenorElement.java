/**
 * Author: vanilson muhongo
 * Date:03/05/2025
 * Time:15:54
 * Version:1
 */

package code.vanilson.array;

public class IndicesMenorElement {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 20, 5, 3, 1, -2};
        System.out.println("Indice from the smallest element is :" + indiceSmallestElement(numbers));
    }

    protected static int indiceSmallestElement(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int smallestNumber = Integer.MAX_VALUE;
        int smallestNumberIndice = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
                smallestNumberIndice = i;
            }
        }
        return smallestNumberIndice;
    }
}
