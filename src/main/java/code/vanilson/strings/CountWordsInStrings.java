/**
 * Author: vanilson muhongo
 * Date:12/05/2025
 * Time:21:26
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;
import java.util.stream.IntStream;

public class CountWordsInStrings {
    public static void main(String[] args) {
        String words = "hello world from java";
        System.out.println("The String contains " + countWordsInString(words) + " words");
    }

     static int countWordsInString(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("The words cannot be null neither empty");
        }
        return words.split(" ").length;
    }

     static int countWordsInStringIntStream(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("The words cannot be null neither empty");
        }
        var string = words.split(" ");
        return (int) IntStream.range(0, string.length).count();
    }
}
