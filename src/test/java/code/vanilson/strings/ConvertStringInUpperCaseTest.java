package code.vanilson.strings;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static code.vanilson.strings.ConvertStringInUpperCase.convertStringInUpperCase;
import static code.vanilson.strings.ConvertStringInUpperCase.convertStringInUpperCaseCommons;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test convert string in uppercase")
class ConvertStringInUpperCaseTest {

    @DisplayName("Convert string in uppercase success")
    @ParameterizedTest
    @CsvSource(value = {
            "amor,AMOR",
            "fé,FÉ",
            "obediencia ,OBEDIENCIA"
    })
    void testConvertStringInUpperCase(String input, String expected) {
        // When
        String actual = convertStringInUpperCase(input);
        //Then
        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("Convert string in uppercase using common library")
    @ParameterizedTest
    @CsvSource(value = {
            "love,LOVE",
            "faith,FAITH",
            "obedience ,OBEDIENCE"
    })
    void testConvertStringInUpperCaseCommons(String input, String expected) {
        // When
        String actual = convertStringInUpperCaseCommons(input);
        //Then
        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("Throw an exception with null string")
    @Test
    void testThrowsExceptionWithNullInput() {
        // When
        var expected = assertThrows(IllegalArgumentException.class
                , () -> convertStringInUpperCase(null), "should thrown an exception");

        var expectedMessage =  assertThrows(IllegalArgumentException.class
                , () -> convertStringInUpperCaseCommons(null), "should thrown an exception");

        // Then
        assertThat("String cannot be null neither empty").isEqualTo(expected.getMessage());
        assertThat("String cannot be null neither empty").isEqualTo(expectedMessage.getMessage());


    }

    @DisplayName("Throw an exception with empty string")
    @Test
    void testThrowsExceptionWithEmptyString() {
        // When
        var expected = assertThrows(IllegalArgumentException.class
                , () -> convertStringInUpperCaseCommons(StringUtils.EMPTY), "should thrown an exception");

        var expectedMessage = assertThrows(IllegalArgumentException.class
                , () -> convertStringInUpperCase(StringUtils.EMPTY), "should thrown an exception");
        // Then
        assertThat("String cannot be null neither empty").isEqualTo(expected.getMessage());
        assertThat("String cannot be null neither empty").isEqualTo(expectedMessage.getMessage());

    }


}