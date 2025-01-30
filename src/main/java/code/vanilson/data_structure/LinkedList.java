package code.vanilson.data_structure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // the head and tail are pointers

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;

        }
        this.tail = newNode;
        length++;
    }

}

@Getter
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}