package code.vanilson.design_pattern.builder;

/**
 * CarBuilder
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
public class CarBuilder {
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
        return new Car(model, color);
    }
}