/**
 * Author: vanilson muhongo
 * Date:03/05/2025
 * Time:18:21
 * Version:1
 */

package code.vanilson.strings;

import java.text.MessageFormat;
import java.util.Objects;

public class Palindrome {
    public static void main(String[] args) {
        String words = "car";
        String words_01 = "radar";
        System.out.println("The words " + words + " is palindrome ? " + isPalindrome(words));
        System.out.println("The words " + words_01 + " is palindrome ? " + isPalindromeStreams(words_01));
    }

    protected static boolean isPalindrome(String words) {
        validateStringNullOrEmpty(words);
        String reversed = new StringBuilder()
                .append(words)
                .reverse()
                .toString();
        return words.equals(reversed);
    }

    protected static boolean isPalindromeStreams(String words) {
        validateStringNullOrEmpty(words);
        String newWords = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            newWords = MessageFormat.format("{0}{1}", newWords, words.charAt(i));

        }
        return newWords.equals(words);
    }

    protected static void validateStringNullOrEmpty(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
    }
}
