package code.vanilson.basics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class FactorialTest {

    @ParameterizedTest
    @CsvSource({
            "5,120",
            "3,6",
            "7,5040",
    })
    void testGivenNumberShouldReturnTheFactorial(int number, int expected) {
        int result = Factorial.calculateFactorial(number);
        assertThat(result).isEqualTo(expected);
        assertThat(result).isGreaterThanOrEqualTo(0);
        assertThat(result).as("Factorial of %d should be %d", number, expected).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0",
            "-3",
            "-7",
    })
    void testGivenNumberLessThanZeroShouldThrowIllegalArgumentException(int number) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Factorial.calculateFactorial(number))
                .withMessageContaining("Factorial is not defined for negative numbers.");
    }

}