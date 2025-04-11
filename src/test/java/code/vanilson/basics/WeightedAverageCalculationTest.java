package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Weighted Average Calculation")
class WeightedAverageCalculationTest {

    @Test
    void testWeightedAverageCalculation() {
        assertEquals(2, WeightedAverageCalculation.calculateWeightedAverage(2, 1, 2, 2), "should be 2");
        assertEquals(1, WeightedAverageCalculation.calculateWeightedAverage(1, 2, 2, 2), "should be 1");
        assertNotEquals(2, WeightedAverageCalculation.calculateWeightedAverage(1, 2, 2, 2), "should not be 1");

    }

    @Test
    void testWeightedAverageCalculationThrowsIllegalArgumentException() {
        var expected = assertThrows(IllegalArgumentException.class,
                () -> WeightedAverageCalculation.calculateWeightedAverage(-1, -1,
                        -12,
                        -2),
                "should throw IllegalArgumentException");

        assertEquals("Notes must be non-negative", expected.getMessage());
        assertTrue(expected.getMessage().startsWith("Notes"), "Notes should be non-negative");

    }

}