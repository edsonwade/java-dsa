/**
 * Author: vanilson muhongo
 * Date:03/05/2025
 * Time:16:26
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;

public class ReverseString {
    public static void main(String[] args) {
        String words = "hello";
        System.out.println("String reversed : " + reversedWords(words));
        System.out.println("String reversed imperative: " + reversedWordsImperative(words));
    }

    private static String reversedWords(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        return new StringBuilder()
                .append(words)
                .reverse()
                .toString();
    }

    private static String reversedWordsImperative(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        String newWords = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            newWords += words.charAt(i); //concatena

        }
        return newWords;
    }


}
