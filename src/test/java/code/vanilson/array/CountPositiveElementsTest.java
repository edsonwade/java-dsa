package code.vanilson.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountPositiveElementsTest {
    @Test
    void testCountNumberOfPositiveElements() {
        int[] Input = {1, -2, 3, -4, 5};
        Assertions.assertEquals(3, CountPositiveElements.countPositiveNumbersInArrayForLoop(Input));
        Assertions.assertTrue(CountPositiveElements.countPositiveNumbersInArrayForeach(Input) == 3);

    }

    @Test
    void countNumberOfPositiveElementsThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CountPositiveElements.countPositiveNumbersInArrayForLoop(null));

    }

}