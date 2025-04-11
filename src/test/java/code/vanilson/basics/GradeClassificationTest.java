package code.vanilson.basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Grade classification")
class GradeClassificationTest {

    @DisplayName("Should be success")
    @Test
    void testGradeClassifications() {
        assertEquals("A", GradeClassification.gradeClassification(12), "Should be equals to A");
        assertEquals("B", GradeClassification.gradeClassification(7), "Should be equals to B");
        assertEquals("C", GradeClassification.gradeClassification(6), "Should be equals to C");
        assertEquals("D", GradeClassification.gradeClassification(4), "Should be equals to D");

        var expectedMessage = assertThrows(IllegalArgumentException.class,
                () -> GradeClassification.gradeClassification(13));
        assertEquals("Invalid grade", expectedMessage.getMessage(), "should be Invalid grade");

    }

    @DisplayName("Throws exeception when given grade is less than zero")
    @Test
    void testGradeClassificationsThrowsExceptionWhenInputIsLessThanZero() {
        assertThrows(IllegalArgumentException.class, () -> GradeClassification.gradeClassifications(-1));

    }

    @DisplayName("Grade classification")
    @ParameterizedTest
    @CsvSource({
            "15,A",
            "8,B",
            "20,A",
            "6,C",
            "4,D",
            "7,B",
            "6,C",
    })
    void testGradeClassifications_01(int grade, String expected) {
        assertEquals(expected, GradeClassification.gradeClassifications(grade), "Should all be equals to " + expected);
    }

    @DisplayName("Grade classification throws an execpeion ")
    @ParameterizedTest
    @CsvSource({
            "-15",
            "-8",
            "-20",
            "-6",
    })
    void testGradeClassifications_02(int grade) {
        var expected =
                assertThrows(IllegalArgumentException.class, () -> GradeClassification.gradeClassifications(grade),
                        """
                                should throws an execption
                                when given grade is less than zero
                                """);
        assertEquals("Grade must be a positive number", expected.getMessage());
    }
}