package code.vanilson.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoreFrequentElementInArrayTest {

    int[] numbers = {123, 4, 56, 7, 8, 9, 6, 5, 4, 3, 123, 56, 6, 7, 5, 8, 3, 2, 9, 5, 6, 5};
    int[] number = {123, 4, 56, 7, 8, 9, 6, 5, 4, 3, 123, 56, 6, 7, 5, 8, 3, 2, 9, 5, 6, 5};

    @Test
    void findMoreFrequentElementInArray() {
        assertEquals(5, MoreFrequentElementInArray.findMoreFrequentElementInArray(numbers), "should be 5");
        assertNotEquals(6, MoreFrequentElementInArray.findMoreFrequentElementInArray(numbers), "shouldn't be 6");
    }

    @Test
    void findLessFrequentElementInArray() {
        assertEquals(2, MoreFrequentElementInArray.findLessFrequentElementInArray(numbers), "Should be 2");
        assertNotEquals(4, MoreFrequentElementInArray.findLessFrequentElementInArray(numbers), "shouldn't be 4");
    }

    @Test
    void findMoreFrequentElementInArrayThrowsException() {
        int[] numbers = {};
        var expectedMessage = assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.findMoreFrequentElementInArray(numbers));
        assertEquals("Array cannot be null neither empty", expectedMessage.getMessage(), "should contain this message");
        assertTrue(expectedMessage.getMessage().startsWith("Array cannot"), "Should be true");
    }

    @Test
    void findMoreFrequentElementInArrayThrowsException_01() {
        assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.findMoreFrequentElementInArray(null));
    }

    @Test
    void findLessFrequentElementInArrayThrowsException() {
        int[] numbers = {};
        var expectedMessage = assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.findLessFrequentElementInArray(numbers));
        assertEquals("Array cannot be null neither empty", expectedMessage.getMessage(), "should contain this message");
        assertTrue(expectedMessage.getMessage().startsWith("Array cannot"), "Should be true");
    }

    @Test
    void findLessFrequentElementInArrayThrowsException_01() {
        assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.findLessFrequentElementInArray(null));
    }

    @Test
    void testCountElementAppearInArray() {
        assertEquals(3, MoreFrequentElementInArray.countFrequentElementInArray(number, 6));
        assertNotEquals(3, MoreFrequentElementInArray.countFrequentElementInArray(number, 1));
    }

    @Test
    void testCountElementAppearInArrayThrowsExceptions() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.countFrequentElementInArray(null, 2));
        assertThrows(IllegalArgumentException.class,
                () -> MoreFrequentElementInArray.countFrequentElementInArray(numbers, 2));
    }

}