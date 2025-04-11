package code.vanilson.basics;

import java.util.Scanner;

/**
 * CountDigitsInNumber
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("count digits : " + countDigitsInNumber(num));

    }

               /*
                1. **Primeiro número: 123**
                - **Divisão**: quando você divide 123 por 10, você pergunta quantas vezes 10 cabe em 123.
                - **Resultado**: Cabe 12 vezes (porque 12 x 10 = 120).
                - **Resto**: O que sobra é 3 (porque 123 - 120 = 3). Então, você "remove" o 3.

                2. **Segundo número: 12**
                - **Divisão**: agora, você faz o mesmo com 12. Pergunta quantas vezes 10 cabe em 12.
                - **Resultado**: cabe 1 vez (porque 1 x 10 = 10).
                - **Resto**: O que sobra é 2 (porque 12 - 10 = 2). Então, você "remove" o 2.

                3. **Terceiro número: 1**
                - **Divisão**: agora, você pergunta quantas vezes 10 cabe em 1.
                - **Resultado**: cabe 0 vezes (porque 0 x 10 = 0).
                - **Resto**: O que sobra é 1, e você não pode mais dividir por 10.

        Então, você fez exatamente isso: dividiu o número, contou quantas vezes 10 cabia, e a cada passo, você "removeu" o último dígito. Isso é uma ótima maneira de entender como a divisão e o resto funcionam! Parabéns!
        */
    static int countDigitsInNumber(int digits) {

        int count = 0;
        while (digits > 0) {
            digits /= 10; // Dentro do loop, a variável digits é dividida por 10. Isso remove o último dígito do número.
            count++;
        }
        return count;
    }
}