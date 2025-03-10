package code.vanilson.design_pattern.builder;

import java.util.Objects;

/**
 * Car
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
@SuppressWarnings("all")
public class Car {
    private final String model;
    private final String color;

    public Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
    }

    public void showCar() {
        System.out.println("Model: " + model + " Color: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Car)) {return false;}
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    static class CarBuilder {
        private String model;
        private String color;

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor("Blue")
                .setModel("Sequoia")
                .build();

        System.out.println(car.color.equalsIgnoreCase("blue"));
        car.showCar();
    }
}