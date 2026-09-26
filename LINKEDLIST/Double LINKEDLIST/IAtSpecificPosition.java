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

public class IAtSpecificPosition {

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
        Node newNode=new Node(15);
        newNode.next=b;
        newNode.prev=a;
        a.next=newNode;
        b.prev=newNode;
        Node head=a;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}