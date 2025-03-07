package code.vanilson.design_pattern.builder;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor("blue")
                .setModel("Sequoia")
                .build();

        car.showCar();


    }
}