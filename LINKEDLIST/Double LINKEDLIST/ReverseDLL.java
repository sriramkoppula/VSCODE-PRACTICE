import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDLL {

    static class LinkedList {
        Node head;
        Node tail;

        // Insert at end
        public void insert(int data) {
            Node n = new Node(data);

            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        // Reverse the Doubly Linked List
        public void reverse() {
            Node temp = head;

            while (temp != null) {

                // Save the original next node
                Node next = temp.next;

                // Swap next and prev
                temp.next = temp.prev;
                temp.prev = next;

                // Move to the original next node
                temp = next;
            }

            // Swap head and tail
            Node t = head;
            head = tail;
            tail = t;
        }

        // Print the list
        public void print() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList l = new LinkedList();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.insert(x);
        }

        l.reverse();
        l.print();
    }
}