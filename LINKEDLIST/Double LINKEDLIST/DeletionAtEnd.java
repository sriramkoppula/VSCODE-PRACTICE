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

public class DeletionAtEnd {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;
        a.prev=null;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next=null;
        Node head=a;
       Node temp=head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next=null;
        temp.prev=null;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}