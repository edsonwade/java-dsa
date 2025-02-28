package code.vanilson.data_structure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("all")
@DisplayName("Sum of all elements")
class Ex_001_Sum_Of_Array_ElementTest {

    int[] arr_1 = {};
    int[] arr = {1, 2, 3, 4, 5};

    @DisplayName("Test sum of array elements")
    @Test
    public void testSumArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = Ex_001_Sum_Of_Array_Element.sumArray(arr);

        assertAll("Sum Array Assertions",
                () -> assertEquals(expectedSum, actualSum, "The sum should be correct"),
                () -> assertTrue(actualSum > 0, "The sum should be positive"),
                () -> assertTrue(actualSum < 20, "The sum should be less than 20")
        );
    }

    @DisplayName("Test sum array using forEach")
    @Test
    void sumArrayUsingForEach() {
        assertAll(
                () -> assertEquals(15, Ex_001_Sum_Of_Array_Element.
                        sumArray(arr)),
                () -> assertNotEquals(12, Ex_001_Sum_Of_Array_Element
                        .sumArrayUsingStreams(arr_1))
        );
    }

    @DisplayName("Test sum array using streams")
    @Test
    void sumArrayUsingStreams() {
        assertAll(
                () -> assertEquals(15, Ex_001_Sum_Of_Array_Element.
                        sumArrayUsingForEach(arr)),
                () -> assertNotEquals(10, Ex_001_Sum_Of_Array_Element
                        .sumArrayUsingStreamsWithReduce(arr_1))
        );
    }

    @DisplayName("Test sum array using streams with reduce")
    @Test
    void sumArrayUsingStreamsWithReduce() {
        assertAll(
                () -> assertEquals(15, Ex_001_Sum_Of_Array_Element.
                        sumArrayUsingStreams(arr)),
                () -> assertNotEquals(10, Ex_001_Sum_Of_Array_Element
                        .sumArrayUsingStreamsWithReduce(arr_1))
        );
    }
}