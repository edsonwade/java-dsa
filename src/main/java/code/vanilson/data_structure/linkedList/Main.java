package code.vanilson.data_structure.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        LinkedList myLinkedList1 = new LinkedList(1);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        System.out.println("\nLinkedList 2 before append: ");
        myLinkedList1.printList();
        // after append

        myLinkedList1.append(2);
        System.out.println("\nLinkedList  after append: ");
        myLinkedList1.printList();

    }
}
