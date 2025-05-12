package code.vanilson.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static code.vanilson.strings.CheckSubstringPresence.isSubstringPresentInString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Verifique se a substring está presente na string.")
class CheckSubstringPresenceTest {


    @Test
    void testIssSubstringPresentInString() {
        String original = "hello world";
        String substring = "world";
        assertTrue(isSubstringPresentInString(original, substring), "Should be true");
        assertFalse(isSubstringPresentInString("hello wore", substring), "Should be false");
    }

    @Test
    void testIssSubstringPresentInStringThrownException() {
        assertThrows(IllegalArgumentException.class, () -> isSubstringPresentInString(null, ""), "should thrown an exception");
        assertThrows(IllegalArgumentException.class, () -> isSubstringPresentInString("", Object.class.getName()), "should thrown an exception");
    }
}