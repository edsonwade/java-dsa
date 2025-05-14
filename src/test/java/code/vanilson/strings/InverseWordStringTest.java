package code.vanilson.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static code.vanilson.strings.InverseWordString.reverseWords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
@DisplayName("Inverse String words")
class InverseWordStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "hello word, word hello",
            "oracle sql, sql oracle",
            "now study, study now"
    })
    void testInverseOrdersInWords(String words, String expected) {
        assertEquals(expected, reverseWords(words), "should be equals");

    }

    @DisplayName("Throws an exception")
    @Test
    void testInverseOrdersInWordsThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> reverseWords(null));
        assertThrows(IllegalArgumentException.class,
                () -> reverseWords(""));

    }
}