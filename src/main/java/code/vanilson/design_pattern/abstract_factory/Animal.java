package code.vanilson.design_pattern.abstract_factory;

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

@SuppressWarnings("unused")
interface AnimalFactory {
    Animal createAnimal();
}

class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("oof oof  oof !!");
    }
}

class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Miau Miau Miau Miau Miau");

    }
}

class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
