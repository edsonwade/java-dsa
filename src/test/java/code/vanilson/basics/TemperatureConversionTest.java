package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("all")
@DisplayName("Temparature Conversion")
class TemperatureConversionTest {

    @ParameterizedTest
    @CsvSource({
            "34.56,94.208",
            "12,53.6",
            "56,132.8"
    })
    void test_given_celsius_should_convert_to_fahrenheit(double celsius, double expected) {
        assertEquals(expected, TemperatureConversion.convertCelsiusToFahrenheit(celsius),
                "should be equals");
        assertTrue(TemperatureConversion.convertCelsiusToFahrenheit(celsius) == expected,
                "should be true");

    }

    @Test
    @DisplayName("Convertion celsius to fahrenheit")
    void test_given_celsius_should_convert_to_fahrenheit_02() {
        assertEquals(94.208, TemperatureConversion.convertCelsiusToFahrenheit(34.56),
                "should be equals");
        assertNotEquals(12, TemperatureConversion.convertCelsiusToFahrenheit(53.6),
                "should be not equals");
        assertFalse(TemperatureConversion.convertCelsiusToFahrenheit(67) == 132.8,
                "should be false");

    }

}