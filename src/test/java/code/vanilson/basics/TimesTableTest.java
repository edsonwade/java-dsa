package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Times Tbale and Prime")
class TimesTableTest {

    @DisplayName("Find if a given number is prime and return true")
    @Test
    void test_checkPrimeNumber() {
        assertAll(
                () -> assertTrue(TimesTable.isPrime(2), "2 IS PRIME NUMBER"),
                () -> assertTrue(TimesTable.isPrime(3), "3 IS PRIME NUMBER"),
                () -> assertTrue(TimesTable.isPrime(5), "5 IS PRIME NUMBER"),
                () -> assertFalse(TimesTable.isPrime(8), "8 IS NOT PRIME NUMBER"),
                () -> assertFalse(TimesTable.isPrime(6), "6 IS NOT PRIME NUMBER")

        );
    }

    @DisplayName("Throws exeception when given number is less than two")
    @Test
    void test_checkPrimeNumberThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> TimesTable.isPrime(1), "throw an exception when given number less than two");
    }

    @ParameterizedTest
    @CsvSource({
            "2,true",
            "3,true",
            "5,true",
            "6,false",
            "8,false",
    })
    void test_checkPrimeNumber(int number, boolean expected) {
        assertEquals(expected, TimesTable.isPrime(number), "2 IS PRIME NUMBER");
    }

}