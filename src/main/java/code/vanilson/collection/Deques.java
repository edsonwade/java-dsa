package code.vanilson.collection;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("all")
/**
 * Deque ⇾> É um tipo de coleção que a permite elementos duplicados, mantem a ordem de inserção, não é thread-safe
 * e segue o princípio FIFO(first in ,first out ) e lifo(Last in, first out), dependendo da necessidade.
 * <p>
 * <p>
 * push() ⇾ adiciona um elemento no ‘top’ da deque.
 * Peek()⇾Retorna o ‘item’ do ‘top’ sem remover-lo
 * ‘pop’()≥ retorn o último elemento removido do ‘top’ da deque.
 */
public class Deques {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("a"); // down
        deque.push("b");
        deque.push("c");
        deque.push("c");
        deque.push("d");
        deque.push("e");
        deque.push("f");
        deque.push("g"); //Top

        System.out.println("push adiciona um elemento no top da deque: " + deque);
        System.out.println("Retorna o item do top sem remove-lo: " + deque.peek());
        System.out.println("remove o ultimo elemnto do top da deque (g) : " + deque.pop());
        System.out.println("check is the deque size : " + deque.size());
        System.out.println("final deque: " + deque);
    }
}
