/**
 * Author: vanilson muhongo
 * Date:03/05/2025
 * Time:16:42
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;

public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String words = "banana";
        char target = 'a';
        System.out.println("The number of occurrence from character " + target + " is : " + countCharacterOccurrenceInWords(words, target));
    }

    protected static int countCharacterOccurrenceInWords(String words, char target) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        int count = 0;
        for (char index : words.toCharArray()) {
            if (index == target) {
                count++;
            }
        }
        return count;


    }
}
