package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Anagram")
class AnagramasTest {

    @DisplayName("Check anagram words")
    @Test
    void test_Is_AnagramWords() {
        assertTrue(Anagramas.isAnagram("alergia", "regalia"), "should be anagram");
        assertTrue(Anagramas.isAnagram("muro", "rumo"), "should be anagram");
        assertFalse(Anagramas.isAnagram("Cantiga", "catinga"), "should not be anagram");
        assertFalse(Anagramas.isAnagram("Carro", "corar"), "should not be anagram");
    }

    @DisplayName("Check anagram  throws an execption")
    @Test
    void test_Is_AnagramWords_ThrowsException() {
        var expedtedMessage = assertThrows(IllegalArgumentException.class, () ->
                Anagramas.isAnagram("", null), "should not be null and empty string");
        assertEquals("The given strings must have same length and cannot be null", expedtedMessage.getMessage(),
                "should not be null and have the same length");
    }
}