/**
 * Author: vanilson muhongo
 * Date:14/05/2025
 * Time:19:42
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String words = " hello world ";
        System.out.println(removingWhiteSpaceInWords(words));
    }

    protected static String removingWhiteSpaceInWords(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        return words.replace(" ", "");
    }

    protected static String convertStringIntoUpperCases(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        return words.toUpperCase();
    }

}
