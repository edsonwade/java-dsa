package code.vanilson.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static code.vanilson.strings.CountUniqueCharacterInString.countUniqueCharacterInWords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Count unique character in strings")
class CountUniqueCharacterInStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "java,3",
            "jjj,1",
            "hello worlds,9",
            "well done,7",
    })
    void testCountUniqueCharacterInWords(String words, int expected) {
        assertEquals(expected, countUniqueCharacterInWords(words), "should be equals");
    }

    @DisplayName("Thrown an exception -Failed")
    @Test
    void testCountUniqueCharacterInWordsThrownExceptions() {
        assertThrows(IllegalArgumentException.class,
                () -> countUniqueCharacterInWords(null));
        assertThrows(IllegalArgumentException.class,
                () -> countUniqueCharacterInWords(""));
    }
}