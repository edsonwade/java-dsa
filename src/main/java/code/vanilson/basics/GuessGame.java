package code.vanilson.basics;

import java.util.Random;
import java.util.Scanner;

/**
 * GuessGame
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class GuessGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int randomNum = rand.nextInt(100) + 1; // Gera um número entre 1 e 100
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Tente adivinhar um número entre 1 e 100.");
            guessGaming(sc, randomNum);
        }
    }

    private static void guessGaming(Scanner sc, int randomNum) {
        int guess;
        do {
            System.out.print("Por favor, insira um número: ");
            guess = sc.nextInt();
            if (guess > randomNum) {
                System.out.println("Seu palpite é muito alto. Tente novamente.");
            } else if (guess < randomNum) {
                System.out.println("Seu palpite é muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número!");
            }
        } while (guess != randomNum); // Continua até que o utilizador adivinhe corretamente
    }
}