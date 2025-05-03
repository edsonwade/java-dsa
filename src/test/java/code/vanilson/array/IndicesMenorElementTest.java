package code.vanilson.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static code.vanilson.array.IndicesMenorElement.*;
import static org.junit.jupiter.api.Assertions.*;

class IndicesMenorElementTest {

    @Test
    void testIndiceSmallestElement() {
        int[] numbers = {10, 0, 20, 5, 3, 1, -2};
        assertEquals(6, indiceSmallestElement(numbers),"should be 6");
        assertNotEquals(1, indiceSmallestElement(numbers),"should not be 1");
    }
    @Test
    void testIndiceSmallestElementThrowsException() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class,()->indiceSmallestElement(numbers),"should throws exception");
        assertThrows(IllegalArgumentException.class,()->indiceSmallestElement(null),"should throws exception");
    }
}