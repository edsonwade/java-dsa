package code.vanilson.collection;

import java.util.*;

/**
 * É um tipo de coleção que não aceita elementos duplicados.
 * HashMap() ⇾ é uma class concreta QUE IMPLEMNTA ‘SET’ NÃO GARANTE A ORDEM DOS ELEMENTOS.
 * Operação complexidade remoção, inserção, busca 0(1) constante ≥ Rapido
 * TreeSet ⇾ garante a ordem dos elementos, tempo de execução Inserção/Remoção/Busca: O(log n) - moderado
 * LinkedHashSet ⇾ garante que os elementos sejam impressos na ordem em que foram inseridos.
 * Remoção, inserção 0(1) ⇾ constante
 * pesquisar 0(N) ⇾> linear
 */
@SuppressWarnings("all")
public class Sets {

    public static void main(String[] args) {
        Set<ListTest<String>> list = new HashSet<>();
        ListTest<String> stringListTest = new ListTest<>("test-one", "test-two");
        Set<ListTest<String>> list1 = new HashSet<>();
        list1.add(new ListTest<>("test-one", "test-two"));
        list.add(new ListTest<>("test-one", "test-two")); // como podemos ver somente o primeiro elemento adicionado
        // será imprimido. Porque o restante trata-se de elemntos duplicados.
        list.add(new ListTest<>("test-one", "test-two"));
        list.add(new ListTest<>("test-two", "test-two"));
        System.out.println("List: " + list.equals(list1));
        System.out.println("List: " + list.contains(stringListTest));
        System.out.println(list);

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(22);
        integers.add(31);
        integers.add(4);
        integers.add(15);
        integers.add(5);
        integers.add(6);
        integers.add(9);
        integers.add(10);
        integers.add(35);

        System.out.println("HashMap() não garante a ordem dos elementos" + integers);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(22);
        treeSet.add(31);
        treeSet.add(4);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(35);
        treeSet.add(151);

        System.out.println("TreeSet garante a ordem dos elementos" + treeSet);
        System.out.println("Remove elements");
        removeElement(treeSet, 15);
        System.out.println("After remove elements" + treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(22);
        linkedHashSet.add(31);
        linkedHashSet.add(4);
        linkedHashSet.add(15);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(9);
        linkedHashSet.add(10);
        linkedHashSet.add(1000_123);
        linkedHashSet.add(1000_000);
        linkedHashSet.add(35);

        System.out.println("Before removing: " + linkedHashSet);
        removeElement(linkedHashSet, 1);
        removeElement(linkedHashSet, 1000_123);
        System.out.println("After removing: " + linkedHashSet);

    }

    private static void removeElement(LinkedHashSet<Integer> linkedHashSet, int element) {
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                iterator.remove();
            }
        }
    }

    private static void removeElement(TreeSet<Integer> treeSet, int numbers) {
        treeSet.removeIf(number -> number.equals(numbers));

    }

}
