package DSA.june_24;

class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Insert at given index
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;

        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null)
            return;
        head = head.next;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // Delete at given index
    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteAtBeginning();
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        curr.next = curr.next.next;
    }

    // Delete first occurrence of given value
    public void deleteByValue(int value) {
        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Utility to print the list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class linkedlist {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert at Beginning
        System.out.println("Insert at beginning:");
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.printList(); // Expected: 5 -> 10 -> null

        // Insert at End
        System.out.println("\nInsert at end:");
        list.insertAtEnd(20);
        list.insertAtEnd(25);
        list.printList(); // Expected: 5 -> 10 -> 20 -> 25 -> null

        // Insert at Index
        System.out.println("\nInsert at index:");
        list.insertAtIndex(2, 15);
        list.insertAtIndex(0, 1);
        list.printList(); // Expected: 1 -> 5 -> 10 -> 15 -> 20 -> 25 -> null

        // Delete at Beginning
        System.out.println("\nDelete at beginning:");
        list.deleteAtBeginning();
        list.deleteAtBeginning();
        list.printList(); // Expected: 10 -> 15 -> 20 -> 25 -> null

        // Delete at End
        System.out.println("\nDelete at end:");
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.printList(); // Expected: 10 -> 15 -> null

        // Delete at Index
        System.out.println("\nDelete at index:");
        list.insertAtEnd(30); // Add back one node
        list.deleteAtIndex(1); // Delete index 1
        list.printList(); // Expected: 10 -> 30 -> null

        // Delete by Value
        System.out.println("\nDelete by value:");
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.deleteByValue(30);
        list.deleteByValue(100); // Value not in list
        list.printList(); // Expected: 10 -> 40 -> 50 -> null
    }
}
