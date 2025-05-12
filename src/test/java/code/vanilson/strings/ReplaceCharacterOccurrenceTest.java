package code.vanilson.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static code.vanilson.strings.ReplaceCharacterOccurrence.replaceCharacterOccurrence;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Replace character in an words")
class ReplaceCharacterOccurrenceTest {

    @Test
    void testReplaceCharacterOccurrence() {
        var words = "hello world";
        var replacedChar = 'x';
        assertEquals("hellx wxrld", replaceCharacterOccurrence(words, replacedChar));
        assertNotEquals("hello world", replaceCharacterOccurrence(words, replacedChar));
    }

    @Test
    void testReplaceCharacterOccurrenceThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> replaceCharacterOccurrence(null, 'o'));
        assertThrows(IllegalArgumentException.class,
                () -> replaceCharacterOccurrence("", 'a'));

    }
}