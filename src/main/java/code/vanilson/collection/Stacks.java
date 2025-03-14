package code.vanilson.collection;

import java.util.Stack;

/**
 * Stack ⇾> É um tipo de coleção que a permite elementos duplicados, mantem a ordem de inserção, é thread-safe
 * e segue o princípio lifo(Last in, first out), onde o último a entrar é o primeiro a sair.
 * <p>
 * Ve se de baixo para cima o debaixo é o último elemento a ser inserido e o de cima o primeiro
 * <p>
 * push() ⇾ adiciona um elemento no ‘top’ da stack.
 * Peek()⇾Retorna o ‘item’ do ‘top’ sem remover-lo
 * ‘pop’()≥ retorn o último elemento removido do ‘top’ da stack.
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a"); // down
        stack.push("b");
        stack.push("c");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        stack.push("g"); //Top

        System.out.println("push adiciona um eleemnto no top da stack: " + stack);
        System.out.println("Retorna o item do top sem remove-lo: " + stack.peek());
        System.out.println("remove o ultimo elemnto do top da stack (g) : " + stack.pop());
        System.out.println("check is the stack is empty() : " + stack.empty());
        System.out.println("final stack: " + stack);
    }
}
