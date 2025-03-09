package code.vanilson.solid.ocr.bad;

/**
 * Está classe viola o princípio OCP(Open/Closed principle) Principio aberto e fechado.
 * Porque ela está aberto para modificoção e não fechado.
 * Sendo que só pode estar aberto para extensão e fechado para modificação.
 * <p>
 * Porque teremos que modificar o codigo toda vez que tivermos que adicioanr um novo tipo de desconto.
 */
@SuppressWarnings("all")
public class Calculate {

    public double calculateDiscount(String type, double price) {
        if (type.equals("A")) {
            return price * 0.10;// 10% porcento de desconto
        } else if (type.equals("B")) {
            return price * 0.20;// 20% porcento de desconto
        }
        return 0;
    }
}
