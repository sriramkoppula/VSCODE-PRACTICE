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

public class DLLUserInput {

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

        public void print() {

            System.out.println("Forward:");

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();

            System.out.println("Backward:");

            temp = tail;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
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

        l.print();
    }
}
