package code.vanilson.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * SimpleTax
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-11
 */
public class SimpleTax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the capital (price of the TV): ");
        BigDecimal capital = in.nextBigDecimal();

        System.out.print("Enter the tax percentage (e.g., 6 for 6%): ");
        BigDecimal tax = in.nextBigDecimal().divide(BigDecimal.valueOf(100)); // Convertendo para decimal

        System.out.print("Enter the number of months: ");
        int months = in.nextInt();

        // Cálculo do valor da parcela e do total
        BigDecimal installment = calculateInstallment(capital, tax, months);
        BigDecimal totalAmount = installment.multiply(BigDecimal.valueOf(months)); // Total a ser pago

        System.out.printf("The total amount to be paid is: %.2f%n", totalAmount.setScale(2, RoundingMode.HALF_UP));
        System.out.printf("The value of each installment is: %.2f%n", installment.setScale(2, RoundingMode.HALF_UP));
    }

    static BigDecimal calculateInstallment(BigDecimal capital, BigDecimal taxa, int tempo) {
        if (capital.compareTo(BigDecimal.ZERO) < 0 || taxa.compareTo(BigDecimal.ZERO) < 0 || tempo <= 0) {
            throw new ArithmeticException("Invalid input values");
        }

        // Cálculo do valor da parcela
        BigDecimal valorParcelaSemJuros = capital.divide(BigDecimal.valueOf(tempo), RoundingMode.HALF_UP);
        BigDecimal acrescimoMensal = valorParcelaSemJuros.multiply(taxa); // 6% do valor da parcela
        return valorParcelaSemJuros.add(acrescimoMensal); // Valor da parcela com juros
    }

    static double calculateMontante(double capital, double taxa, int tempo) {
        if (capital < 0 || taxa < 0 || tempo <= 0) {
            throw new ArithmeticException("Invalid input values");
        }

        // Cálculo do montante usando a fórmula de juros simples
        return capital * (1 + taxa * tempo);
    }



    static double[] calculateTax(int capital, double taxa, int tempo) {
        if (capital < 0 || taxa < 0 || tempo <= 0) {
            throw new ArithmeticException("Invalid input values");
        }

        // Cálculo do valor da taxa mensal
        double valorTaxa = capital * (taxa / 100);

        // Cálculo do valor da parcela
        double parcela = ((double) capital / tempo) + valorTaxa;

        // Cálculo do valor total a ser pago
        double total = parcela * tempo;

        return new double[]{parcela, total};
    }

    private static void extracted() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the capital (price of the TV): ");
        int capital = in.nextInt();

        System.out.print("Enter the tax percentage (e.g., 6 for 6%): ");
        double tax = in.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = in.nextInt();

        double[] result = calculateTax(capital, tax, months);
        double parcela = result[0];
        double total = result[1];

        System.out.printf("The value of each installment is: %.2f%n", parcela);
        System.out.printf("The total amount to be paid is: %.2f%n", total);
    }
}