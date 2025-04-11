package code.vanilson.basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * CountVowels
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-09
 */
@SuppressWarnings("unused")
public class CountVowels {

    protected static final Map<Character, Integer> maps = new HashMap<>();

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the words ?");
        var words = sca.nextLine();
        var result = countCharacterOccurrenceExcludingWhitespaceInWords(words);
        System.out.println("Contagem de Vogais :" + result);

    }

    private static int countVowelsInWords(String words) {
        int count = 0;
        if (words == null || words.isEmpty()) {
            return -1;
        }
        for (Character c : words.toCharArray()) {
            if (
                    c == 'a' || c == 'A' ||
                            c == 'e' || c == 'E' ||
                            c == 'I' || c == 'i' ||
                            c == 'o' || c == 'O' ||
                            c == 'U' || c == 'u'
            ) {
                count++;
            }
        }
        return count;
    }

     static Map<Character, Integer> countCharacterOccurrenceInWords(String words) {
        if (words == null || words.isEmpty()) {
            return Collections.emptyMap();
        }
        for (Character c : words.toCharArray()) {
            if (maps.containsKey(c)) {
                // se já existir adiciona mais um
                maps.put(c, maps.get(c) + 1);
            } else {
                // caso não exitir atualiza a um.
                maps.put(c, 1);
            }
        }
        return maps;
    }

     static Map<Character, Integer> countCharacterOccurrenceExcludingWhitespaceInWords(String words) {
        if (words == null || words.isEmpty()) {
            return Collections.emptyMap();
        }
        // Limpar o mapa antes de contar
         maps.clear();

        // remover all whitespace
        String result = words.replaceAll("\\s+", "");
        for (Character c : result.toCharArray()) {
            if (maps.containsKey(c)) {
                // se já existir adiciona mais um
                maps.put(c, maps.get(c) + 1);
            } else {
                // caso não exitir atualiza a um.
                maps.put(c, 1);
            }
        }
        return maps;
    }
}