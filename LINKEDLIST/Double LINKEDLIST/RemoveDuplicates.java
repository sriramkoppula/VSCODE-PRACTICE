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

public class RemoveDuplicates {

    static class LinkedList {

        Node head;
        Node tail;

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

        public void method() {
            Node temp = head;
            while (temp != null && temp.next != null) {
                if (temp.data == temp.next.data) {
                    // If duplicate is the last node
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    // Remove duplicate node
                    temp.next = temp.next.next;
                    // Update prev link
                    if (temp.next != null) {
                        temp.next.prev = temp;
                    }
                } else {
                    temp = temp.next;
                }
            }
        }

        public void print() {

            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
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

        l.method();
        l.print();
    }
}