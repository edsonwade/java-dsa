package code.vanilson.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CountWordsInStringsTest {
    String word = "hello world from java 2023";

    @Test
    void countWordsInString() {
        String words = "hello world from java";
        assertEquals(4, CountWordsInStrings.countWordsInString(words), "should be 4");
        assertNotEquals(3, CountWordsInStrings.countWordsInString(words), "should not be 3");
    }

    @Test
    void countWordsInStringIntStream() {
        assertEquals(5, CountWordsInStrings.countWordsInStringIntStream(word), "should be 5");
        assertNotEquals(3, CountWordsInStrings.countWordsInStringIntStream(word), "should not be 3");
    }
}