package code.vanilson.design_pattern.abstract_factory;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
public class Main {

    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        DogFactory dogFactory = new DogFactory();

        Animal cat = catFactory.createAnimal();
        Animal dog = dogFactory.createAnimal();

        cat.makeNoise();
        dog.makeNoise();

    }
}