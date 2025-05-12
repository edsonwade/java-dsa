/**
 * Author: vanilson muhongo
 * Date:12/05/2025
 * Time:20:46
 * Version:1
 */

package code.vanilson.strings;

import java.util.Objects;

public class CheckSubstringPresence {
    public static void main(String[] args) {
        String original = "hello world";
        String substring = "world";

        System.out.println("The given substring" + substring + "is presente in " + original + " ? :" + isSubstringPresentInString(original, substring));
    }

     static boolean isSubstringPresentInString(String words, String substring) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("The words cannot be null neither empty");
        }
        return words.contains(substring);
    }
}
