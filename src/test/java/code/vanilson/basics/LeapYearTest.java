package code.vanilson.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Leap year")
class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "2000,true",
            "2004,true",
            "2008,true",
            "2012,true",
            "2016,true",
            "2020,true",
    })
    void test_should_be_true_when_year_isleap(int year, boolean isLeap) {
        Assertions.assertTrue(LeapYear.isLeapYear(year), "Should be true");
        Assertions.assertEquals(isLeap, LeapYear.isLeapYear(year), "should be equals");

    }

    @ParameterizedTest
    @CsvSource({
            "2001,false",
            "2002,false",
            "2003,false",
            "1989,false",
    })
    void test_should_be_false_when_given_year_is_not_leap(int year, boolean isLeap) {
        Assertions.assertFalse(LeapYear.isLeapYear(year), "Should be false");
        Assertions.assertEquals(isLeap, LeapYear.isLeapYear(year), "should be equals");

    }

    @Test
    void test_given_year_check_if_is_leap_01() {
        Assertions.assertTrue(LeapYear.isLeapYear(2000), "Should be true");
        Assertions.assertEquals(true, LeapYear.isLeapYear(2000), "should be equals");
        Assertions.assertNotEquals(true, LeapYear.isLeapYear(2001), "should be false");

    }
}