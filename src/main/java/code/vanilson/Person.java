/**
 * Author: vanilson muhongo
 * Date:20/03/2025
 * Time:13:58
 * Version:1
 */

package code.vanilson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SuppressWarnings("all")
public class Person {
    private final String name;
    private final int age;

    // Construtor privado para garantir que o objeto só seja criado através do Builder
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Classe Builder
    public static class PersonBuilder {
        private String name;
        private int age;

        // Métodos setters no estilo Builder
        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        // Método build para criar a instância de Person
        public Person build() {
            return new Person(this);
        }
    }

    // Método estático para iniciar a construção através do Builder
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        Person person = Person.builder()  // Usando o método estático builder
                .setName("Vanilson")
                .setAge(32)
                .build();

        Person person1 = Person.builder()  // Usando o método estático builder
                .setName("Maury")
                .setAge(23)
                .build();
        Person person2 = Person.builder()  // Usando o método estático builder
                .setName("Marcia")
                .setAge(25)
                .build();

        System.out.println(person);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);

        var result = personList.stream()
                .filter(age -> age.getAge() > 23)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}

