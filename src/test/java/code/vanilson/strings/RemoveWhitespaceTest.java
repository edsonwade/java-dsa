package code.vanilson.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static code.vanilson.strings.RemoveWhitespace.convertStringIntoUpperCases;
import static code.vanilson.strings.RemoveWhitespace.removingWhiteSpaceInWords;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Remove whitespace in String")
class RemoveWhitespaceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "hello words, hellowords",
            "goodbye wayne, goodbyewayne",
            " see you bro, seeyoubro"
    })
    void testRemoveWhitespaceOnGivenWords(String words, String expected) {
        assertEquals(expected, removingWhiteSpaceInWords(words), "Should be hellowords");
        assertEquals(expected, removingWhiteSpaceInWords(words), "goodbyewayne");

    }

    @DisplayName("Throws an exception - Successfully")
    @Test
    void testRemoveWhitespaceOnGivenWordsThrowException() {
        assertThrows(IllegalArgumentException.class, () -> removingWhiteSpaceInWords(null));
        assertThrows(IllegalArgumentException.class, () -> removingWhiteSpaceInWords(""));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "hello words, HELLO WORDS",
            "goodbye wayne,GOODBYE WAYNE",
            "see you bro, SEE YOU BRO"
    })
    void testConvertsWordsToUppercase(String words, String expected) {
        assertEquals(expected, convertStringIntoUpperCases(words), "Should be assertEquals");

    }

    @DisplayName("Build fail with execution")
    @Test
    void testConvertsWordsToUppercaseThrowException() {
        assertThrows(IllegalArgumentException.class, () -> convertStringIntoUpperCases(null));
        assertThrows(IllegalArgumentException.class, () -> convertStringIntoUpperCases(""));

    }


}