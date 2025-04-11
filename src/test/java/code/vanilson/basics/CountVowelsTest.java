package code.vanilson.basics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

import static code.vanilson.basics.CountVowels.countCharacterOccurrenceExcludingWhitespaceInWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountVowelsTest {
    // count Character Occurence In Words
    @ParameterizedTest
    @CsvSource({
            "a,2",
            "c,5",
            "C,1",
            "d,1",
            "e,3",
            "h,1",
            "I,1",
            "n,3",
            "o,2",
            "O,1",
            "r,5",
            "s,1",
            "t,2",
            "u,2",
            "W,1"
    })
    void testGivenStringCountCharacterOccurrence(char character, int expected) {
        String input = "count Character Occurrence In Words"; // String de entrada correta
        Map<Character, Integer> occurrenceMap = countCharacterOccurrenceExcludingWhitespaceInWords(input);

        // Verifica se a contagem do caractere corresponde ao esperado
        assertEquals(expected, occurrenceMap.get(character));
    }

}