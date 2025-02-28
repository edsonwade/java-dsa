package code.vanilson.data_structure.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Find Maximum Element")
@SuppressWarnings("all")
class Ex_002_FindMaximumElementTest {

    int[] arr = {123, 4567, 12, 34, 234, 5678, 10000, 1234, 2, 201};

    @Test
    void findTheMaxElmentInArrayUsingForLoop() {
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(
                        () -> Ex_002_FindMaximumElement.findTheMaxElmentInArrayStreamMax(arr)),
                () -> Assertions.assertEquals(10000, Ex_002_FindMaximumElement.findTheMaxElmentInArrayStreamMax(arr),
                        "Maior elemento no array"));

    }

    @DisplayName("Find maximum element in array using forEach")
    @Test
    void findTheMaxElmentInArrayUsingForEach() {
        int maxElement = Ex_002_FindMaximumElement.findTheMaxElmentInArrayUsingForEach(arr);
        Assertions.assertTrue(maxElement >= 0, "The maximum element should be non-negative");
        Assertions.assertEquals(10000, maxElement, "Expected maximum element in the array");
    }

    @DisplayName("Find maximum element in array using Stream max")
    @Test
    void findTheMaxElmentInArrayStreamMax() {
        int maxElement = Ex_002_FindMaximumElement.findTheMaxElmentInArrayStreamMax(arr);
        Assertions.assertTrue(maxElement >= 0, "The maximum element should be non-negative");
        Assertions.assertEquals(10000, maxElement, "Expected maximum element in the array using Stream.max");
    }

    @DisplayName("Find maximum element in array using Stream reduce")
    @Test
    void findTheMaxElmentInArrayStreamReduce() {
        int maxElement = Ex_002_FindMaximumElement.findTheMaxElmentInArrayStreamReduce(arr);
        Assertions.assertTrue(maxElement >= 0, "The maximum element should be non-negative");
        Assertions.assertEquals(10000, maxElement, "Expected maximum element in the array using Stream.reduce");
    }

}