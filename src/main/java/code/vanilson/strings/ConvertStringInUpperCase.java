/**
 * Author: vanilson muhongo
 * Date:07/06/2025
 * Time:12:38
 * Version:1
 */

package code.vanilson.strings;

import org.apache.commons.lang3.StringUtils;

public class ConvertStringInUpperCase {
    private ConvertStringInUpperCase() {
        throw new AssertionError("cannot instantiate this class");
    }

    public static String convertStringInUpperCase(String words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null neither empty");
        }
        return words.toUpperCase();
    }

    public static String convertStringInUpperCaseCommons(String words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null neither empty");
        }
        return StringUtils.upperCase(words);
    }
}
