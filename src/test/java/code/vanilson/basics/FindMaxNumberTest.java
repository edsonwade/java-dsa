package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxNumberTest {

    @Test
    @DisplayName("Given two given numberes find the max")
    void testGivenTwoNumbersFindTheMaximum() {
        assertEquals(34, FindMaxNumber.findTheMaxPositiveBetweenTwoGivenNumbers(12, 34),
                "should be true");
        assertNotEquals(34, FindMaxNumber.findTheMaxPositiveBetweenTwoGivenNumbers(123, 34),
                "should be false");
        assertThrows(
                IllegalArgumentException.class, () -> FindMaxNumber.findTheMaxPositiveBetweenTwoGivenNumbers(-1,
                        34),
                "both numberes should be positive");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 3, 3",   // 3 é o maior
            "5, 2, 5",   // 5 é o maior
            "0, 0, 0",   // 0 é o maior (caso especial)
            "7, 7, 7",   // Ambos são iguais
            "10, 5, 10"  // 10 é o maior
    })
    void test_given_Two_Numbers_Find_The_Maximum(int number1, int number2, int expectedMax) {
        assertEquals(expectedMax,
                FindMaxNumber.findTheMaxPositiveBetweenTwoGivenNumbersUsingWrapperInteger(number1, number2),
                "should be true");
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 3",  // illegal
            "5, -2",   // illegal
    })
    void test_given_Two_Negative_Numbers_Should_Throw_Exception(int number1, int number2) {
        var exception = assertThrows(IllegalArgumentException.class, () ->
                FindMaxNumber.findTheMaxPositiveBetweenTwoGivenNumbersUsingMathMax(number1, number2));
        assertEquals("Both numbers must be positive.", exception.getMessage());
        assertThat(exception.getMessage(), containsString("Both numbers must be positive."));
    }

}