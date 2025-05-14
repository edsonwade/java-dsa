/**
 * Author: vanilson muhongo
 * Date:14/05/2025
 * Time:20:12
 * Version:1
 */

package code.vanilson.strings;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CountUniqueCharacterInString {
    public static void main(String[] args) {
        String words = "javaj";
        System.out.println(countUniqueCharacterInWords(words));
    }

    static int countUniqueCharacterInWords(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        Set<String> strings = new HashSet<>();
        for (char index : words.toCharArray()) {
            strings.add(String.valueOf(index));
        }
        return strings.size();
    }
}
