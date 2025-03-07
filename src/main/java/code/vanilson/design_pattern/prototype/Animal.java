package code.vanilson.design_pattern.prototype;

/**
 * Animal
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
@SuppressWarnings("all")
public class Animal implements Cloneable {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal a1 = new Animal("animal", 20);
        Animal a2 = (Animal) a1.clone(); // Clonamos a instância original, criando uma instância de Animal
        // Agora a2 é uma cópia de a1
        System.out.println(a2.name);
        System.out.println(a2.age);
    }

}