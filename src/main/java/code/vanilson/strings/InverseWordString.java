/**
 * Author: vanilson muhongo
 * Date:14/05/2025
 * Time:20:46
 * Version:2
 */

package code.vanilson.strings;

import java.util.Objects;

public class InverseWordString {
    public static void main(String[] args) {
        String words = "Hello world";
        var result = reverseWords(words);

        System.out.println(result);
    }

    static String reverseWords(String words) {
        if (Objects.isNull(words) || words.isEmpty()) {
            throw new IllegalArgumentException("Words cannot be null or empty");
        }
        // Use StringBuilder para construir a string invertida
        StringBuilder sb = new StringBuilder();
        // Divide a string em palavras usando regex para lidar com múltiplos espaços
        var result = words.split("\\s+");
        for (int i = result.length - 1; i >= 0; i--) {
            sb.append(result[i])
                    .append(" "); // adiciona a palavra e um espaço

        }
        // Remove o espaço extra no final, se houver
        return sb.toString().trim();
    }
}
