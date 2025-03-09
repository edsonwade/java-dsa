package code.vanilson.design_pattern.builder;

import java.math.BigDecimal;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new CarBuilder()
                .setColor("blue")
                .setModel("Sequoia")
                .build();

        car.showCar();

        Carro carro = new Carro
                .CarroBuilder("Toyota", "Blue")
                .setModelo("Cayenne")
                .setMotor("Mazda")
                .build();

        Carro carro1 = (Carro) carro.clone();

        carro1.setAno(2023);
        carro1.setCapacidadePassageiros(4);
        carro1.setPrice(BigDecimal.valueOf(100_000));

        System.out.println("Carro 1: " + carro1);

    }
}