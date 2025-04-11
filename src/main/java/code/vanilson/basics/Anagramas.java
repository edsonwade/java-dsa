package code.vanilson.basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Anagramas
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class Anagramas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first words");
        String first = sc.nextLine();
        System.out.println("Enter second words");
        String second = sc.nextLine();

        System.out.println("is anagrams words ? " + isAnagram(first, second));

    }

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            throw new IllegalArgumentException("The given strings must have same length and cannot be null");
        }

//        // Converte as strings para minúsculas
//        a = a.toLowerCase();
//        b = b.toLowerCase();

        // Converte as strings em arrays de caracteres e ordena
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Compara os arrays ordenados
        return Arrays.equals(aArray, bArray);
    }

    static boolean isAnagramStreams(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        return a.toLowerCase().chars()
                .sorted()
                .boxed()
                .toList()
                .equals(b.toLowerCase().chars()
                        .sorted()
                        .boxed()
                        .toList());
    }

}