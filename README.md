# Java-Data-Structures-Algorithms-2023

Java Data Structures &amp; Algorithms 2023

## Technical

. Big O notation

## Data Structures

. Arrays

. Array Lists

. Linked Lists

. Doubly Linked Lists

. Stacks

. Sets

. Lists

. Maps

## Queues
## Queues

1\. FIFO Queues

2\. LIFO Queues

3\. Circular Queues

## Dequeues

. Priority Queues

. Binary Trees

. AVL Trees

. Red-Black Trees

. Hash Tables

. Heaps

. Graphs

. Tries

. Bloom Filters

. LRU Caches

. Suffix Arrays

. Suffix Trees

. B-Trees

. Binomial Heaps

. Fibonacci Heaps

. Union Find

. Hypercubes

## Searching

. Sorting

. Radix Sort

. Bubble Sort

. Selection Sort

. Insertion Sort

. Merge Sort

. Quick Sort

- **Graph Traversal**
  .
  Breadth First Search.
  Depth First Search.
  Dijkstra's Algorithm**

- **A. Search Algorithm**

  Binary Search.
  Linear Search.
  Tree Traversal

## Example linkedList

```Java
/**
 * A simple implementation of a singly linked list.
 *
 * @param <E> the type of elements in this list
 */
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
     *
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
     *
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
     *
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
     *
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
     *
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
```