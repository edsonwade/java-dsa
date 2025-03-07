package code.vanilson.design_pattern.builder;

import java.util.Objects;

/**
 * Car
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
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
}