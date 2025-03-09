package code.vanilson.solid.ocr.good;

/**
 * Esta classe Calculate segue o Princípio Aberto/Fechado (OCP).
 * Ela está aberta para extensão, pois novos tipos de desconto podem ser adicionados
 * simplesmente criando classes que implementam a ‘interface’ Discount.
 * Simultaneamente, ela está fechada para modificação, pois não é necessário alterar
 * o código existente na classe Calculate para adicionar novos tipos de desconto.
 */
public class Calculate {

    public double calculateDiscount(Discount discount, double price) {
        return discount.calculateDiscount(price); // Corrigido o nome do método
    }

    public static void main(String[] args) {
        DiscountTypeA typeA = new DiscountTypeA();
        DiscountTypeB typeB = new DiscountTypeB();

        Calculate calc = new Calculate();
        System.out.println(calc.calculateDiscount(typeA, 34567788.2347)); // Saída do desconto do tipo A
        System.out.println(calc.calculateDiscount(typeB, 9277867.234)); // Saída do desconto do tipo B
    }
}
