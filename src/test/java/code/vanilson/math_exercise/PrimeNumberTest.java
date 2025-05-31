package code.vanilson.math_exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void TestIsPrimeNumber() {
        assertTrue(PrimeNumber.isPrimeNumber(3));
        assertTrue(PrimeNumber.isPrimeNumber(13));
        assertTrue(PrimeNumber.isPrimeNumber(7));
        assertTrue(PrimeNumber.isPrimeNumber(2));
        assertFalse(PrimeNumber.isPrimeNumber(12));
        assertFalse(PrimeNumber.isPrimeNumber(0));
        assertFalse(PrimeNumber.isPrimeNumber(1));
    }
}