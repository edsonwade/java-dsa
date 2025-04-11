package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void testNotPrime() {
        assertFalse(PrimeNumber.isPrime(4), "4 is not prime");
        assertFalse(PrimeNumber.isPrime(6), "6 is not prime");
        assertFalse(PrimeNumber.isPrime(8), "8 is not prime");
        assertFalse(PrimeNumber.isPrime(9), "9 is not prime");
        assertFalse(PrimeNumber.isPrime(45), "45 is not prime");
        assertFalse(PrimeNumber.isPrime(-5), "-5 is not prime");
        assertFalse(PrimeNumber.isPrime(-8), "-8 is not prime");
        assertFalse(PrimeNumber.isPrime(-41), "-41 is not prime");
    }

    @Test
    void testPrime() {
        assertTrue(PrimeNumber.isPrimeWithMathSquare(3), "3 is prime");
        assertTrue(PrimeNumber.isPrimeWithMathSquare(5), "5 is prime");
        assertTrue(PrimeNumber.isPrimeWithMathSquare(7), "7 is prime");
        assertTrue(PrimeNumber.isPrimeWithMathSquare(41), "41 is prime");
        assertTrue(PrimeNumber.isPrimeWithMathSquare(5099), "5099 is prime");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(textBlock = """
                1   , 1  ,    2
                123 , 456,    579
                888 , 222,    1110
                1372, 69 ,    1441
                12  , 456,    468
                100 , 101,    201
                63829983432984289347293874, 90938498237058927340892374089, 91002328220491911630239667963
            """)
    @DisplayName("Sample tests")
    void basicTests(String a, String b, String expected) {
        assertEquals(expected, PrimeNumber.add(a, b));
    }

}