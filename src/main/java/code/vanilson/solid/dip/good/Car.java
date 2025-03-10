package code.vanilson.solid.dip.good;

import code.vanilson.solid.dip.bad.Engine;

/**
 * Esta classe segue o Princípio da Inversão de Dependência (DIP)
 * uma vez que a classe Carro depende de uma abstração.
 * Isso torna fácil testar, modificar e reutilizar codigos
 */
@SuppressWarnings("all")
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;  // Dependência injetada
    }

    public void drive() {
        engine.start();
        System.out.println("Dirigindo o Carro");
    }
}
