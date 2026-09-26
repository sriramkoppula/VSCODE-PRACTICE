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
public class InsertionAtEnd {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;

        Node newNode = new Node(5);

        newNode.next = a;
        newNode.prev = null;

        a.prev = newNode;
        Node head = newNode;
        Node node=new Node(40);
        c.next=node;
        node.next=null;
        node.prev=c;

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}