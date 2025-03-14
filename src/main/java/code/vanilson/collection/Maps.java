package code.vanilson.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map ⇾ Associa uma chave a um valor, sendo que a chave de ser unica.
 * Não garante a ordem dos elementos.
 * HashMap()⇾> class concreta que imlementa a ‘interface’ map.
 * Não garante a ordem dos elementos e o tempo de execuação é rapido remoção/insercação/pesquisa O(1)
 * TreeMap () ⇾>class concreta que imlementa a ‘interface’ map garante a ordem dos elementos e o tempo de complexidade
 * é O(log n) para todas as operações.
 * LinkedHashMap()⇾class concreta baseado em lista ligado, não garante a ordem dos elementos, mas garante que os
 * elementos seja sejam executados na ordem em que forem inseridos. Rapido remoção/insercação O(1)
 * pesquisa 0(N)
 */

@SuppressWarnings("all")
public class Maps {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "one");
        map.put(9, "nine");
        map.put(2, "two");
        map.put(5, "five");
        map.put(3, "three");
        map.put(8, "eight");
        map.put(7, "seven");
        map.put(6, "six");
        map.put(4, "seven");

        System.out.println("Map: " + map);

        System.out.println("size: " + map.size());

        System.out.println("isEmpty: " + map.isEmpty());

        System.out.println("containsKey this is false: " + map.containsKey("one"));
        System.out.println("containsValue this is true: " + map.containsValue("one"));

        //Quando só precisamos da chave. ou seja o keyset só tem acesso a chave,se precisamos
        // de aceder também o valor termos que usar o method get(key) -> metodo que retorna o valor da chave associado.
        for (Integer key : map.keySet()) {
            System.out.println("key: " + key);
            // , value: " + map.get(key)  para obter o valor da chave,
        }

        System.out.println("Usando o MapEntry");

        //Ussamos o Map.Entry no for loop -> é essencial quando precisamos da chave e do valor sem necesseidade de fazer
        // map.get(key) para obter a o valor associado a chave.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());

        }

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("one", "one");
        map2.put("two", "two");
        map2.put("three", "three");
        map2.put("four", "four");
        map2.put("five", "five");
        map2.put("six", "six");

        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        System.out.println("Contains " + map2.containsValue("seven"));
        System.out.println("replace " + map2.replace("five", "cinco")); // substitui o valor associado a chave
        System.out.println("Contains " + map2.replace("four", "four", "angola")); // substitui o valor associado a chave
        System.out.println("after replacing");
        map2.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("absent:" + map2.computeIfAbsent("ten", k -> null)); // retorna o valor da chave caso
        // a chave existe.
//        map2.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("six", "six");
        treeMap.put("one", "one");
        treeMap.put("five", "five");
        treeMap.put("two", "two");
        treeMap.put("four", "four");
        treeMap.put("three", "three");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
//        treeMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

    }

}
