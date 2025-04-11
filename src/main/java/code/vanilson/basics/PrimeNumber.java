package code.vanilson.basics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * PrimeNumber
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-09
 */
@SuppressWarnings("all")
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number");
        var prime = sca.nextInt();
        System.out.println("is prime ? " + isPrime(prime));

    }

    /**
     * More fast then others
     *
     * @param num
     * @return
     */
    public static boolean isPrimeWithMathSquare(int num) {
        // 1. Verifica se o número é menor que 2
        if (num < 2) {
            return false; // Números menores que 2 não são primos
        }

        // 2. Verifica a divisibilidade de 2 até a raiz quadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se num é divisível por i, não é primo
            }
        }

        // 3. Se não encontrou divisores, num é primo
        return true;
    }

    public static boolean isPrime(int num) {
        // Verifica se o número é menor que 2
        if (num < 2) {
            return false; // Números menores que 2 não são primos
        }

        // Verifica a divisibilidade de 2 até num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // Se num é divisível por i
                return false; // Não é primo
            }
        }

        return true; // Se não encontrou divisores, é primo
    }

    //Adding Big Numbers
    //Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.
    public static String add(String a, String b) {

        return new BigInteger(a).add(new BigInteger(b)).toString();
    }

    public static String add_2(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0, maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            int digitA = (i < a.length()) ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int digitB = (i < b.length()) ? b.charAt(b.length() - 1 - i) - '0' : 0;
            int sum = digitA + digitB + carry;
            result.append(sum % 10); // Adiciona o dígito da soma
            carry = sum / 10; // Atualiza o carry
        }

        if (carry > 0) {
            result.append(carry);
        }


        return result.reverse().toString().replaceFirst("^0+(?!$)", "");
    }

}