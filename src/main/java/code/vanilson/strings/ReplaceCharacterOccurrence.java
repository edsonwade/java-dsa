/**
 * Author: vanilson muhongo
 * Date:12/05/2025
 * Time:19:43
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;

public class ReplaceCharacterOccurrence {
    public static void main(String[] args) {
        String words = "hello world";
        char replacedCharacter = 'x';
        System.out.println(replaceCharacterOccurrence(words, replacedCharacter));

    }

    protected static String replaceCharacterOccurrence(String words, char replacedCharacter) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("The words cannot be null neither empty");
        }
        return words.replace('o', replacedCharacter);

    }
}
