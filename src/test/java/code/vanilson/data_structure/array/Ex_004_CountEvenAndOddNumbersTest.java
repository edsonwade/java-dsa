package code.vanilson.data_structure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Count Even and Odd Numbers")
@SuppressWarnings("ALL")
class Ex_004_CountEvenAndOddNumbersTest {

    /**
     * Testa o método countEvenAndOddNumbers com um array de inteiros.
     */
    @Test
    @DisplayName("Teste do método countEvenAndOddNumbers")
    void testCountEvenAndOddNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6};

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Ex_004_CountEvenAndOddNumbers.countEvenAndOddNumbers(array);

        // Verifica a saída
        String expectedOutput = "Even: 3,Odd: 3\n"; // Certifique-se de que a nova linha está correta
        String actualOutput = outContent.toString();

        // Debug: imprime a saída esperada e a saída atual
        System.out.println("Expected: [" + expectedOutput + "]");
        System.out.println("Actual: [" + actualOutput + "]");

        assertEquals(expectedOutput.trim(), actualOutput.trim());

        // Restaura a saída original
        System.setOut(System.out);
    }

    @Test
    @DisplayName("Teste do método countEvenAndOddNumbersWithStream")
    void testCountEvenAndOddNumbersWithStream() {
        int[] array = {1, 2, 3, 4, 5, 6};

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Ex_004_CountEvenAndOddNumbers.countEvenAndOddNumbersWithStream(array);

        // Verifica a saída
        String expectedOutput = "Even: 3,Odd: 3\n"; // Certifique-se de que a nova linha está correta
        String actualOutput = outContent.toString();

        // Assert com trim para evitar problemas de espaço
        assertEquals(expectedOutput.trim(), actualOutput.trim());

        // Restaura a saída original
        System.setOut(System.out);
    }

    /**
     * Testa o método countEvenAndOddNumbersWithStreamAndCollections com um array de inteiros.
     */
    @Test
    @DisplayName("Teste do método countEvenAndOddNumbersWithStreamAndCollections")
    void testCountEvenAndOddNumbersWithStreamAndCollections() {
        int[] array = {1, 2, 3, 4, 5, 6};

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Ex_004_CountEvenAndOddNumbers.countEvenAndOddNumbersWithStreamAndCollections(array);

        // Verifica a saída
        String expectedOutput = "Even: 3,Odd: 3\n";
        String actualOutput = outContent.toString();

        // Assert com trim para evitar problemas de espaço
        assertEquals(expectedOutput.trim(), actualOutput.trim());

        // Restaura a saída original
        System.setOut(System.out);
    }
}
