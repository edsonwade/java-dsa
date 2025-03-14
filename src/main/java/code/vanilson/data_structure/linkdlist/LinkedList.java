/**
 * Author: vanilson muhongo
 * Date:19/01/2025
 * Time:14:51
 * Version:1
 */

package code.vanilson.data_structure.linkdlist;

import lombok.Getter;

@SuppressWarnings("all")
/**
 * A simple implementation of a singly linked list.
 * Boundery conditions
 * Empty list
 * Single element
 * Beginning
 * End
 * middle
 *  * @param <E> the type of elements in this list
 *
 */
@Getter
public class LinkedList<E> implements ListI<E> {

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    /**
     * Constructs an empty LinkedList.
     * Initializes the head, tail, and currentSize to null and 0 respectively.
     * Time complexity: O(1)
     */
    public LinkedList() {
        head = null;
        tail = null;
        currentSize = 0;
    }

    /**
     * A node in the linked list that stores data and a reference to the next node.
     *
     * @param <E> the type of data stored in the node
     */
    static class Node<E> {
        E data;
        Node<E> next;

        public Node(E obj) {
            this.data = obj;
            this.next = null;
        }
    }

    /**
     * Adds an element to the beginning of the list.
     * <p>
     * Time complexity: O(1) - Constant time as we only modify the head pointer.
     *
     * @param obj the element to add
     */
    public void addFirst(E obj) {
        Node<E> node = new Node<>(obj);
        node.next = head; // point the new node to the current head
        head = node; // head now points to the new node
        if (tail == null) {
            tail = node; // if the list was empty, tail also points to the new node
        }
        currentSize++; // increment the size of the list
    }

    /**
     * Adds an element to the end of the list using the tail pointer.
     * <p>
     * Time complexity: O(1) - Constant time if the tail is available.
     *
     * @param obj the element to add
     */
    public void addLast(E obj) {
        Node<E> node = new Node<>(obj);
        // If the list is empty, the new node will be both the head and the tail
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node; // attach the new node to the end
            tail = node; // update the tail pointer
        }
        currentSize++; // increment the size of the list
    }

    /**
     * Adds an element to the end of the list by traversing from head to tail.
     * This method is less efficient than addLast.
     * <p>
     * Time complexity: O(n) - Linear time as we must traverse the entire list to reach the end.
     *
     * @param data the element to add
     */
    public void addLastWorstPerformance(E data) {
        Node<E> node = new Node<>(data);
        var tmp = head;
        // Handle empty list scenario
        if (head == null) {
            head = tail = node;
            currentSize++;
            return;
        }
        // Traverse to the last node and add the new node
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node; // set the next of the last node to the new node
        currentSize++; // increment the size of the list
    }

    /**
     * Removes the first element of the list.
     * <p>
     * Time complexity: O(1) - Constant time as we only modify the head pointer.
     *
     * @param data the element to remove (unused in the implementation, as we only remove the first node)
     * @return the data of the removed element or null if the list is empty
     */
    public E removeFirst(E data) {
        if (head == null) {
            return null; // if the list is empty, return null
        }
        E tmp = head.data; // store the data of the first node
        head = head.next; // move the head pointer to the next node
        currentSize--; // decrement the size of the list
        return tmp; // return the data of the removed node
    }

    /**
     * Removes the first element of the list when there is only one element.
     * <p>
     * Time complexity: O(1) - Constant time, as we check if the list has one element and update pointers accordingly.
     *
     * @param data the element to remove (unused in the implementation, as we only remove the first node)
     * @return the data of the removed element or null if the list is empty
     */
    public E removeFirstSingleElement(E data) {
        if (head == null) {
            return null; // if the list is empty, return null
        }
        E tmp = head.data; // store the data of the first node
        if (head == tail) {
            head = tail = null; // if there is only one element, set both head and tail to null
        } else {
            head = head.next; // otherwise, move the head pointer to the next node
        }
        currentSize--; // decrement the size of the list
        return tmp; // return the data of the removed node
    }
}


@SuppressWarnings("all")
class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Test adding elements to the list
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);

        // Test removing elements
        System.out.println("Removed first element: " + list.removeFirst(null)); // Expected output: 2
        System.out.println("Removed first element (single): " + list.removeFirstSingleElement(null)); // Expected output: 1

        // Test final list size
        System.out.println("Lists size: " + list.getCurrentSize()); // Expected output: 2
    }
}

