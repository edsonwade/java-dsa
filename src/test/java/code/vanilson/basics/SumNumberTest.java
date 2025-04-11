package code.vanilson.basics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumNumberTest {

    @ParameterizedTest
    @CsvSource({
            "5,15",
            "2,3",
            "3,6",
            "4,10",
    })
    void test_given_numbers_return_total_sum(int numbers, int expected) {
        assertEquals(expected, SumNumber.sumTotalPositiveNumber(numbers),
                "should be equals");

    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "-23",
            "-3"
    })
    void test_given_numbers_should_throw_illegalArgumentException(int numbers) {
        assertThrows(IllegalArgumentException.class, () -> SumNumber.sumTotalPositiveNumber(numbers), "should throw");

    }

}