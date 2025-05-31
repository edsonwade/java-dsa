package code.vanilson.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Switch number position")
class SwitchNumberPositionTest {


    @DisplayName("Switch the largest element with the lowers element in array")
    @Test
    void testChangePositionBetweenLargestAndSmallestNumbersInArray() {
        //Given
        int[] numbers = {210, 22, 4, 56, 23, 45, 23, 2, 9, 134};
        int[] expected = {2, 22, 4, 56, 23, 45, 23, 210, 9, 134};
        //When
        int[] results = SwitchNumberPosition.changePositionBetweenLargestAndSmallestNumbersInArray(numbers);
        //Then
        assertThat(results).isEqualTo(expected);

    }

}