import java.util.*;

class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class InsertionAtBeginning {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        // Connect existing nodes
        a.next = b;
        b.next = c;

        b.prev = a;
        c.prev = b;

        // Head
        Node head = a;

        // Insert 5 at beginning
        Node newNode = new Node(5);

        newNode.next = head;
        newNode.prev = null;

        head.prev = newNode;

        head = newNode;

        // Traverse
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}