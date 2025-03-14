package code.vanilson.collection;

import java.util.*;

/**
 * É um tipo de coleção que permite elementos duplicados e mantém a ordem de inserção.
 * ArrayList, Linkedlist são as classes concretas que implemntam list
 * ArrayList é uma estruturada de dados dinamicos
 * onde o acesso por indice é muito rapido O(1) e a remoção e inserção ao meio é muito lento O(n)
 * <p>
 * O método equals() em Java é usado para comparar a igualdade de dois objetos.
 * No entanto, a implementação padrão do método equals() na classe Object (que é a superclasse de todas as classes em Java)
 * compara as referências dos objetos, ou seja, verifica se ambos os objetos apontam para a mesma instância na memória
 */

public class Lists {

    public static void main(String[] args) {
//        List<ListTest<String>> list = new ArrayList<>();
//        list.add(new ListTest<>("vani", "list@example.com"));
//        list.add(new ListTest<>("test", "vani@example.com"));
//        System.out.println("List order insertion garantue:" + list);
//
//        System.out.println("acesso por indice posix 0:" + list.get(0).getName());
//        System.out.println("acesso por indice posix 1:" + list.get(1).getEmail());
//        System.out.println("What is ur name ?: " + list.get(0).report(list.get(0).getName()));
//
//        List<ListTest<Integer>> list1 = new ArrayList<>();
//        list1.add(new ListTest<>(12, 23));
//        list1.add(new ListTest<>(123_000_00, Integer.sum(12, 23)));
//
//        System.out.println("size : " + list1.size());
//        System.out.println("position 0 : " + list1.get(0));
//        System.out.println("position 1 : " + list1.get(1));
//        // Position dont exist IndexOutOfBoundsException
//        try {
//            System.out.println("position 2 : " + list1.get(2)); // Bloco que pode lançar uma excessão
//        } catch (IndexOutOfBoundsException e) {// bloco que lida com a exceção caso ocorra.
//            System.err.println(e.getMessage());
//        } finally {
//            // Bloco que será sempre executado independentemente sé a execeção ou não
//            // permite liberar recursos, em casos de conexão de base de dados, leitura de streams e outros.
//            System.out.println("Java is very cool language ");
//        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        numbers.add(123);
        numbers.add(34);
        numbers.add(0);
        numbers.add(1);
        numbers.add(23);

        System.out.println("Before remove element :" + numbers);
        removeElementInList(numbers, numbers.get(0));
        System.out.println("After remove element :" + numbers);

        removeElementInListCollection(numbers, numbers.get(5));
        System.out.println("after remove the element in collections:" + numbers);

    }

    @SuppressWarnings("all")
    private static void removeElementInList(List<Integer> numbers, int removeNumber) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number.equals(removeNumber)) {
                iterator.remove();
            }
        }
    }

    private static void removeElementInListCollection(List<Integer> numbers, int removeNumber) {
        numbers.removeIf(number -> number.equals(removeNumber));
    }

}

/**
 * Genericos-> permitem representar class, interface e metodós parametizados por um tipo.
 * T -> parameterização por tipo
 *
 * @param <T>
 */
@SuppressWarnings("all")
class ListTest<T> implements Report {
    T t1;
    T t2;

    public ListTest(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getName() {
        return t1;
    }

    public void setName(T t1) {
        this.t1 = t1;
    }

    public T getEmail() {
        return t2;
    }

    public void setEmail(T t2) {
        this.t2 = t2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof ListTest)) {return false;}
        ListTest<?> listTest = (ListTest<?>) o;
        return Objects.equals(t1, listTest.t1) && Objects.equals(t2, listTest.t2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t1, t2);
    }

    @Override
    public String toString() {
        return "ListTest{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }

    @Override
    public String report(String msg) {
        return "Hello!!! My name's ".concat(msg).concat("nice to meet u");
    }
}

interface Report<T> {
    T report(String msg);
}

/**
 * Linkedlist ⇾ class concreta que implementa list
 * inserção e remoção ⇾ tempo de execução - rapido O(1) pode se addicionar no início ou fim o mesmo com remover.
 * Acesso por indice ⇾ lento (n) ⇾ tem que percorrer toda a lista
 */
class ListLinkedList {
    public static void main(String[] args) {
        LinkedList<ListTest<String>> lists = new LinkedList<>();
        lists.add(new ListTest<>("linkedlist-1", "test@example.com"));

        LinkedList<ListTest<String>> linkedList = new LinkedList<>();
        linkedList.add(new ListTest<>("linkedlist-1", "test@example.com"));
        linkedList.add(new ListTest<>("linkedlist-2", "vani@example.com"));
        linkedList.add(new ListTest<>("linkedlist-3", "linkedlist@example.com"));
        linkedList.add(new ListTest<>("linkedlist-4", "thread@example.com"));

        System.out.println("lists " + linkedList);
        System.out.println("size:" + linkedList.size());
        System.out.println("contains?:" + linkedList.contains(linkedList.get(3)));
        System.out.println("equals?:" + linkedList.get(0).equals(lists.get(0)));
        System.out.println("remover: " + linkedList.removeFirst());
        System.out.println("list depois da remoção: " + linkedList);
        linkedList.addLast(new ListTest<>("linkedlist-5", "new@example.com"));
        System.out.println("Nova lista:  " + linkedList);
    }

}

