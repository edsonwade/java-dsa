package code.vanilson.math_exercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Test Factorial of number")
class FactorialTest {


    @ParameterizedTest
    @CsvSource(value = {
            "5,120",
            "3,6",
            "7,5040"
    })
    void testGivenNumberReturnFactorial(int number, int expected) {
        assertEquals(expected, Factorial.factorialImperative(number), "should be equals");

    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,-1",
            "-3,-1"
    })
    void testGivenNumberLessThanOneReturnMinusOne(int number, int expected) {
        assertEquals(expected, Factorial.factorialImperative(number), "should be equals");

    }

}