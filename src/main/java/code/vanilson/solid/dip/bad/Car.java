package code.vanilson.solid.dip.bad;

/**
 * Está class viola o principio da injecção de dependencia(DIP)
 * Uma vez que a class carro depende diretamente do Motor ,se o motor alterar o seu comportamneto altera tb da class
 * carro.
 * Isto torna dificil de testar, modificar, e reutilizar
 */
@SuppressWarnings("all")
public class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();// carro depende diretamente do Motor // viola o princípio da injeção de dependecia
    }

    public void drive() {
        engine.start();
        System.out.println("Driving Car");
    }
}
