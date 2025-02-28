package code.vanilson.data_structure.array;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("all")
public class Ex_001Test {

    @DisplayName("Givem two arrays comparing if both are the same")
    @Test
    public void testValidateIfTheGivenArraysAreTheSame_ShouldReturnTrue() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(Ex_001.compBetterApproach(a, b));
    }
    @Test
    public void testValidateIfTheGivenArraysAreTheSame_ShouldReturnFalse() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(false,Ex_001.compBetterApproach(a, b));
    }


}