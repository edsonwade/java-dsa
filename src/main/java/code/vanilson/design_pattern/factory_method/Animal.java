package code.vanilson.design_pattern.factory_method;

/**
 * Animal
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
// Define uma ‘interface’, para criar um objeto, mas deixa que as subclasses decidem que classes instanciar.
@SuppressWarnings("all")
public interface Animal {
    void makeNoise();
}

// cria os objectos
class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog makes noise");
    }
}

class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Cat makes noise");

    }
}

@SuppressWarnings("all")
abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

// subclasses decidem que classes instanciar
class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
